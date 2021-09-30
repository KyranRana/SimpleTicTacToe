fun main() {
    val word = readLine()!!
    print(('a'..'z').filter { it !in word }.joinToString(""))
}