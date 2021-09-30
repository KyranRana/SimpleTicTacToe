fun main() {
    val (a, b, c, n) = readLine()!!.split(" ").map { it.toInt() }

    val uc = ('A'..'Z').toList()
    val lc = ('a'..'z').toList()
    val num = ('0'..'9').toList()

    var pass = ""
    repeat(a) { pass += uc[it % uc.size] }
    repeat(b) { pass += lc[it % lc.size] }
    repeat(c) { pass += num[it % num.size] }

    if (pass.length < n) {
        pass += '$'
        repeat(n - pass.length) { pass += num[it % num.size] }
    }

    print(pass)
}