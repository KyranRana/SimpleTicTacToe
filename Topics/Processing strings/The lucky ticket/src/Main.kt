const val THREE = 3

fun main() {
    val (first, last) = readLine()!!.chunked(THREE).map { it.map(Char::digitToInt).sum() }
    print(if (first == last) "Lucky" else "Regular")
}