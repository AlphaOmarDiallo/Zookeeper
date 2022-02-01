fun main() {    
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    // Do not touch lines above
    // Write only exchange actions here.
    val a = numbers[numbers.size-1]
    val b = numbers[0]

    numbers[0] = a
    numbers[numbers.size-1] = b

    // Do not touch lines below
    println(numbers.joinToString(separator = " "))
}