import kotlin.math.sqrt

const val TWO = 2
const val THREE = 3
const val PI = 3.14

fun main() {
    when (readLine()!!) {
        "triangle" -> {
            val (a, b, c) = Array(THREE) { readLine()!!.toDouble() }

            // using heron's formula
            // see: https://www.mathopenref.com/heronsformula.html
            val p = (a + b + c) / 2
            print(sqrt(p * (p - a) * (p - b) * (p - c)))
        }
        "circle" -> {
            val r = readLine()!!.toDouble()
            print(PI * r * r)
        }
        "rectangle" -> {
            val (a, b) = Array(TWO) { readLine()!!.toDouble() }
            print(a * b)
        }
    }
}