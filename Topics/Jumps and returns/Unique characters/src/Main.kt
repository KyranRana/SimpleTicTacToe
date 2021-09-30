fun main() {
    val chars = mutableMapOf<Char, Int>()
    val word = readLine()!!
    for (char in word) {
        chars[char] = chars.getOrDefault(char, 0) + 1
    }
    print(chars.values.filter { it == 1 }.count())
}