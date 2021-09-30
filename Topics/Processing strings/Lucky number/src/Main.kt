fun main() {
    val input = readLine()!!
    val (first, last) = input.chunked(input.length / 2).map { it.map(Char::digitToInt).sum() }
    println(if (first == last) "YES" else "NO")
}