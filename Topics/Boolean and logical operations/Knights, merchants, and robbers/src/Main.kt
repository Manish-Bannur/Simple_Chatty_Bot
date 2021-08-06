import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val firstAnswer = scanner.nextBoolean()
    val secondAnswer = scanner.nextBoolean()
    val confession = scanner.nextBoolean()

    print(firstAnswer == secondAnswer && !confession)
}