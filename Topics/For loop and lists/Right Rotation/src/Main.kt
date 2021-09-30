fun main() {
    val size = readLine()!!.toInt()
    val list = MutableList(size) { readLine()!!.toInt() }
    val n = readLine()!!.toInt()

    val cutoff = size - n % size
    val result = list.subList(cutoff, size) + list.subList(0, cutoff)

    println(result.joinToString(" "))
}