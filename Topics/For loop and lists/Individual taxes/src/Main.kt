fun main() {
    val size = readLine()!!.toInt()
    val annuals = MutableList(size) { readLine()!!.toDouble() }
    val taxes = MutableList(size) { readLine()!!.toDouble() }

    var number = 0
    var maxTax = Double.MIN_VALUE

    for (i in annuals.indices) {
        val tax = annuals[i] * (taxes[i] / 100)
        if (tax > maxTax) {
            maxTax = tax
            number = i + 1
        }
    }

    println(number)
}