fun main() {
    val first = readLine()!!.toInt() > 0
    val second = readLine()!!.toInt() > 0
    val third = readLine()!!.toInt() > 0
    val output = first.compareTo(false) + second.compareTo(false) + third.compareTo(false)
    if (output == 1) {
        println("true")
    } else {
        println("false")
    }
}