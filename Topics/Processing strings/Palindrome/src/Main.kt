fun main() {
    val word = readLine()!!
    print(if (word == word.reversed()) "yes" else "no")
}