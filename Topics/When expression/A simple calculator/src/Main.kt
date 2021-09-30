import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextLong()
    val op = scanner.next()
    val b = scanner.nextLong()

    println(
        when (op) {
            "+" -> a + b
            "-" -> a - b
            "/" -> if (b != 0L) a / b else "Division by 0!"
            "*" -> a * b
            else -> "Unknown operator"
        }
    )
}