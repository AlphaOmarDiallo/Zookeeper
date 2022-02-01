fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val num = 20

    val check = a + b == num || a + c == num || b + c == num

    println(check)
}