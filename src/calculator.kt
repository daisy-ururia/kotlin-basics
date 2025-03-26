import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)
    println("Enter first number :")
    var num1 = read.nextInt()

    println("Enter Second number :")
    var num2 = read.nextInt()

    println("Enter an operator :")
    val operator = readln()

    when (operator) {
        "+" -> println("Result: ${num1 + num2}")
        "-" -> println("Result: ${num1 - num2}")
        "*" -> println("Result: ${num1 * num2}")
        "/" -> println("Result: ${num1 / num2}")

        else-> {
        println("invalid operator")
        }
    }


}