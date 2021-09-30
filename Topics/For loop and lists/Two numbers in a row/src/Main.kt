fun main() {
    val size = readLine()!!.toInt()
    val list = Array(size) { readLine()!!.toInt() }
    val (p, m) = readLine()!!.split(" ").map { it.toInt() }

    var ans = "YES"
    for (i in 0 until list.lastIndex) {
        if (list[i] == p && list[i + 1] == m || list[i] == m && list[i + 1] == p) {
            ans = "NO"
            break
        }
    }
    println(ans)
}