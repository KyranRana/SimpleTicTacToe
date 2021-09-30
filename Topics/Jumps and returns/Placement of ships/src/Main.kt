import java.util.*

fun main() {
    val xs = (1..5).toMutableSet()
    val ys = (1..5).toMutableSet()

    val scanner = Scanner(System.`in`)

    repeat(3) {
        xs.remove(scanner.nextInt())
        ys.remove(scanner.nextInt())
    }

    println(xs.joinToString(" "))
    println(ys.joinToString(" "))
}