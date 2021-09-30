fun main() {
    val size = readLine()!!.toInt()
    val list = Array(size) { readLine()!!.toInt() }

    var triples = 0
    for (i in 0..list.lastIndex - 2) {
        if (list[i] + 1 == list[i + 1] && list[i + 1] + 1 == list[i + 2]) {
            triples++
        }
    }
    println(triples)
}