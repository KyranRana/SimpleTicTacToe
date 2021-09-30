const val THREE = 3

fun main() {
    val input = readLine()!!

    var index = -1
    for (i in 0..input.lastIndex - 2) {
        if (input.substring(i, i + THREE).lowercase() == "the") {
            index = i
            break
        }
    }

    println(index)
}