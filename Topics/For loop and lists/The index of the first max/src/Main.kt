fun main() {
    val size = readLine()!!.toInt()

    var max = Integer.MIN_VALUE
    var first = 0

    for (i in 0 until size) {
        val current = readLine()!!.toInt()
        if (current > max) {
            max = current
            first = i
        }
    }

    println(first)
}