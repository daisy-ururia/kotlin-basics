fun main() {
    //Standard-Library Functions/Predefined functions
    var output = Math.sqrt(144.0)
    println("The squareroot of 144 is $output")

    var number = Math.round(45.89)
    println(number)

    school()
    add()
    student("John","Male",34)
    student("Ann","female",14)
    employee("Michael",25000,disability= true)

}
//User-Defined Functions
fun school(){
    println("eMobilis")
}

fun add(){
    var x = 3
    var y = 5
    println(x + y)
}

//Parameters/Variables and arguments/Values
fun student(name:String,gender:String,age:Int){
    println("$name is a $gender.$name is $age years old")
}
fun employee(name:String,salary:Int,disability:Boolean){
        println("$name earns a salary of $salary.Disability $disability")

}