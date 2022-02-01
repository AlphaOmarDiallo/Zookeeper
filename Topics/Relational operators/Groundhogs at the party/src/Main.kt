fun main() {
    val reese = readLine()!!.toInt()
    val weekend = readLine()!!.toBoolean()

    val reeseW = reese in 10..20 && !weekend || reese in 15..25 && weekend

    println(reeseW)
}