package _02classes

import java.awt.Color






data class Person2(val fullName: String, val age: Int)

// copy?







class Car(color: Color) {

    init {
        println("car initialized with $color color")
    }

}






class Person3(val name: String) {
    constructor(name: String, parent: JavaPerson) : this(name) {
        // this is secondary constructor
    }
}






class Aircraft() {

    private var _model = "";

    var model: String
        get() = this._model
        set(value) {
            this._model = value
        }


    var modelX: String = this._model
        private set


}





interface WorkBook

class ExcelWorkbook : WorkBook







// type alias
typealias Age = Int

class AlteredPerson(val name: String, val age: Age)






// time to talk about "inline"


// smart cast


// a == b  >>> a?.equals(b) ?: (b === null)



val person3Instance = Person3("Jessie")


val javaPerson = JavaPerson("Leb", 44)


fun doIt() {
    // some interoperability

}

