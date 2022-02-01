import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)
    val one = scanner.nextInt()
    val two = scanner.nextInt()
    val three = scanner.nextInt()

    var outputin = one != two && two != three && three != one

    print(outputin)
}