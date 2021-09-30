fun main() {
    val (input, substring) = Array(2) { readLine()!! }
    print(input.split(substring).size - 1)
}