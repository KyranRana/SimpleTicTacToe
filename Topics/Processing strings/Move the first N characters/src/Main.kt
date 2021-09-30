import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val input = scanner.next()
    val n = scanner.nextInt()

    if (n >= input.length) {
        println(input)
    } else {
        println("${input.drop(n)}${input.take(n)}")
    }
}