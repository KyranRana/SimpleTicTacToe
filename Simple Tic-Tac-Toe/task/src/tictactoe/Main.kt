package tictactoe

import java.util.Scanner

const val DIVIDER = "---------"
const val PIPE = '|'

fun main() {
    val scanner = Scanner(System.`in`)

    val cells = CharArray(9) { ' ' }
    printGrid(cells)

    var x = true
    while (true) {
        print("Enter the coordinates: ")
        val cellY = scanner.next()
        val cellX = scanner.next()

        if (valid(cellX) && valid(cellY)) {
            val index = (cellY.toInt() - 1) * 3 + (cellX.toInt() - 1)
            if (cells[index] != ' ') {
                println("This cell is occupied! Choose another one!")
            } else {
                val symbol = if (x) 'X' else 'O'
                cells[index] = symbol
                printGrid(cells)
                if (hasWon(cells, symbol)) {
                    print("$symbol wins")
                    break
                }
                x = !x
            }
        }
    }
}

private fun valid(cell: String): Boolean {
    if (cell.isEmpty() || cell.length > 1 || !cell.first().isDigit()) {
        println("You should enter numbers!")
        return false
    } else if (cell.first() !in '1'..'3') {
        println("Coordinates should be from 1 to 3!")
        return false
    }
    return true
}

private fun printGrid(cells: CharArray) {
    println(DIVIDER)
    for (i in 0..2) {
        print("$PIPE ")
        for (j in 0..2) {
            print("${cells[i * 3 + j]} ")
        }
        println(PIPE)
    }
    println(DIVIDER)
}

private fun hasWon(cells: CharArray, symbol: Char): Boolean {
    return hasWonHorizOrVert(cells, symbol) || hasWonDiag(cells, symbol)
}

private fun hasWonHorizOrVert(cells: CharArray, symbol: Char): Boolean {
    for (i in 0..2) {
        var horiz = true
        var vert = true
        for (j in 0..2) {
            horiz = horiz && cells[i * 3 + j] == symbol
            vert = vert && cells[j * 3 + i] == symbol
        }
        if (horiz || vert) {
            return true
        }
    }
    return false
}

private fun hasWonDiag(cells: CharArray, symbol: Char): Boolean {
    var ldiag = true
    var rdiag = true
    for (i in 0..2) {
        ldiag = ldiag && cells[i * 3 + i] == symbol
        rdiag = rdiag && cells[i * 3 + (2 - i)] == symbol
    }
    if (ldiag || rdiag) {
        return true
    }
    return false
}