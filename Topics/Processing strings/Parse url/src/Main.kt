fun main() {
    val input = readLine()!!
    val params = "(?:\\?|&)(\\w+)=([^&]*)".toRegex()

    var password = ""

    params.findAll(input).forEach {
        val (_, name, value) = it.groupValues
        if (name == "pass" && value != "") {
            password = value
        }
        println("$name : ${if (value != "") value else "not found"}")
    }

    if (password != "") {
        println("password : $password")
    }
}