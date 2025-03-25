import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)
    println("Enter first number :")
    var number = read.nextInt()

    println("Enter Second number :")
    var num = read.nextInt()

    println("Enter third number :")
    var num2 = read.nextInt()

    if (number>=num && number>=num2){
        println("$number is the largest number")
    }
    else if (num >= number && num>= num2){
        println("$num is the largest number")
    }
    else{
        println("$num2 is the largest number")
    }

}