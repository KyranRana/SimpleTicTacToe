const val THREE = 3

fun main() {
    val word = readLine()!!
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'y')

    var (vowelCount, consonantCount, count) = Array(THREE) { 0 }

    for (i in word.indices) {
        if (vowels.contains(word[i])) {
            count += (consonantCount - 1) / 2
            consonantCount = 0
            vowelCount++
        } else {
            count += (vowelCount - 1) / 2
            consonantCount++
            vowelCount = 0
        }
    }

    count += (vowelCount - 1) / 2
    count += (consonantCount - 1) / 2

    println(count)
}