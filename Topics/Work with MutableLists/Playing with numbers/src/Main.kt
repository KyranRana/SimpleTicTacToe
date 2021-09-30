fun main() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    // do not touch the lines above
    // write your code here   
    val sum = numbers.sum()

    // remove penultimate
    numbers.removeAt(numbers.lastIndex - 1)

    // add sum to beginning of list
    numbers.add(0, sum)

    // do not touch the lines below
    println(numbers.joinToString(" "))
}