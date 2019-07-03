package _01basics

fun sum(a: Int, b: Int): Int {
    return a + b;
}




fun sayMyName(name: String = "Heisenberg"): Unit {
    println("My name is $name");
}




const val PI = 3.14
fun define() {
    var a: Int = 1;
    val b = 3;
}


val a = 2
val b = 3

// if as expression
val max1 = if (a > b) a else b

val max2 = if (a > b) {
    print("Choose a")
    a
} else {
    print("Choose b")
    b
}




fun whenExp(x: Any) {
    val validNumbers = listOf(2,3,5,7,11,17,19)

    when (x) {
        in 1..10 -> print("x is in the range")
        in validNumbers -> print("x is valid")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }
}





val aStory = """
    
    Once upon a time...
    
    bla bla bla
    
""".trimIndent()




// https://kotlinlang.org/docs/reference/coding-conventions.html



fun main() {
    sayMyName()
}