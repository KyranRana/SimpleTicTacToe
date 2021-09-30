fun main() {
    val input = readLine()!!
    print(input.last() + input.substring(1 until input.lastIndex) + input.first())
}