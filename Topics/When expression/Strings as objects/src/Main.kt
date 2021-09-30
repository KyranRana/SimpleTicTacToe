fun main() {
    val input = readLine()!!

    println(
        when (input.firstOrNull()) {
            's' -> input.drop(1).reversed()
            'i' -> input.drop(1).toInt().inc()
            else -> input
        }
    )
}