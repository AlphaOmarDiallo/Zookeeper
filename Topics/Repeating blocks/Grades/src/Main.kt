fun main() {
    val n = readLine()!!.toInt()

    var A = 0
    var B = 0
    var C = 0
    var D = 0

    repeat(n) {
        var grade = readln()!!.toInt()
        if (grade == 5) A++
        if (grade == 4) B++
        if (grade == 3) C++
        if (grade == 2) D++
    }

    println("$D $C $B $A")
}