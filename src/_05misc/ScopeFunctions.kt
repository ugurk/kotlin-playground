package _05misc

import _02classes.Person2


fun main() {


    Person2("Alice", 20).let {
        println(it)
        println(it)
    }





    val numberList = mutableListOf<Double>()
    numberList.also { println("Populating the list") }
        .apply {
            add(2.71)
            add(3.14)
            add(1.0)
        }
        .also { println("Sorting the list") }
        .sort()


    println(numberList)



}








// https://kotlinlang.org/docs/reference/scope-functions.html

