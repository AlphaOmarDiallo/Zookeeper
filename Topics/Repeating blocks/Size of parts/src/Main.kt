fun main() {
    val n = readLine()!!.toInt()

    var larger = 0
    var perfect = 0
    var smaller = 0

    repeat(n) {
        val output = readLine()!!.toInt()
        if (output == 1) larger++
        if (output == 0) perfect++
        if (output == -1) smaller++
    }

    println("$perfect $larger $smaller")
}