const val HUNDRED = 100

fun main() {
    val input = readLine()!!
    val gc = input.count { it == 'c' || it == 'g' || it == 'C' || it == 'G' }.toDouble()
    println(gc / input.length * HUNDRED)
}