fun main() {
    val dna = readLine()!!

    if (dna.isEmpty()) {
        return
    }

    var prev = dna[0]
    var count = 1

    for (i in 1..dna.lastIndex) {
        if (dna[i] == prev) {
            count++
            continue
        }

        print("$prev$count")

        prev = dna[i]
        count = 1
    }

    println("$prev$count")
}