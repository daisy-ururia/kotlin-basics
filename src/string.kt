fun main() {
    var firstname = "Daisy"
    var lastname = "Ururia"
    var school = "eMobilis"

    println(firstname)
    println(firstname + " " +lastname) //String concatenation
    println(firstname[0])
    println(firstname.uppercase())
    println(lastname.lowercase())

    //String interpolation
    println(school +" is a coding school")
    println("My fullname is $firstname $lastname")
}
