fun main() {
    val size = readLine()!!.toInt()
    val list = MutableList(size) { readLine()!!.toInt() }
    val m = readLine()!!.toInt()

    println(list.count { it == m })
}