fun main() {
    val n = readLine()!!.toInt()
    var pos = 0
    repeat(n) {
        val num = readLine()!!.toInt()
        if (num > 0) pos++
    }
    println(pos)
}