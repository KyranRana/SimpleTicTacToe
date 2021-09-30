fun main() {
    val input = readLine()!!
    var alphabet = true
    for (i in 1..input.lastIndex) {
        if (input[i] != input[i - 1] + 1) {
            alphabet = false
            break
        }
    }
    print(alphabet)
}