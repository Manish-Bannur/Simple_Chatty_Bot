import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val x = scanner.nextBoolean()
    val y = scanner.nextBoolean()
    val z = scanner.nextBoolean()
    print(!(x and y) or z)
}