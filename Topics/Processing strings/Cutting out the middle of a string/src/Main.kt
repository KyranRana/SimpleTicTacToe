fun main() {
    val input = readLine()!!
    val size = input.length
    if (size % 2 == 0) {
        val mid = input.length / 2 - 1
        println(input.removeRange(mid, mid + 2))
    } else {
        val mid = input.length / 2
        println(input.removeRange(mid, mid + 1))
    }
}