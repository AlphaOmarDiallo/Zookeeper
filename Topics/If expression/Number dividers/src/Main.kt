fun main() {
    val two = 2
    val three = 3
    val five = 5
    val six = 6
    val st = "Divided by"
    val num = readLine()!!.toInt()

    if (num % two == 0) {
        println("$st $two")
    }
    if (num % three == 0) {
        println("$st $three")
    }
    if (num % five == 0) {
        println("$st $five")
    }
    if (num % six == 0) {
        println("$st $six")
    }
}