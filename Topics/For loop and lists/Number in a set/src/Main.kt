fun main() {
    val size = readLine()!!.toInt()
    val list = MutableList(size) { readLine()!!.toInt() }
    val n = readLine()!!.toInt()

    print(if (list.contains(n)) "YES" else "NO")
}