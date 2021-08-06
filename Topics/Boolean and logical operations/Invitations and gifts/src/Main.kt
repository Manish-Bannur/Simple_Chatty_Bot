import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val invitation = scanner.nextBoolean()
    val gift = scanner.nextBoolean()
    if (invitation && gift) print(true) else print(false)
}