fun main() {
    val size = readLine()!!.toInt()
    val list = MutableList(size) { readLine()!!.toInt() }

    list.add(0, list.removeLast())

    println(list.joinToString(" "))
}