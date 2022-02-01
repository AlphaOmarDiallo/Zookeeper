fun main() {
    val year = readLine()!!.toInt()
    val regular = "Regular"
    val leap = "Leap"
    if (year % 4 == 0 && year % 100 != 0) {
        print(leap)
    } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
        print(leap)
    } else {
        print(regular)
    }
}