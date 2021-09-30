fun main() {
    val size = readLine()!!.toInt()
    val set = mutableSetOf<Int>()

    repeat(size) {
        set.add(readLine()!!.toInt())
    }

    val (p, m) = readLine()!!.split(" ").map { it.toInt() }

    println(
        if (set.contains(p) && set.contains(m)) {
            "YES"
        } else {
            "NO"
        }
    )
}