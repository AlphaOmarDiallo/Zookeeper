fun main() {
    var num = 0
    repeat(readLine()!!.toInt()) {
        var num2 = readLine()!!.toInt()
        if (num2 > num && num2 % 4 == 0) num = num2
    }
    println(num)
}