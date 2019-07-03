package _03functions



fun reformat(str: String,
             normalizeCase: Boolean = true,
             upperCaseFirstLetter: Boolean = true,
             divideByCamelHumps: Boolean = false,
             wordSeparator: Char = ' ') {
    /// ...
}






fun doItWithCallback(x: Int, callback: (Int) -> Unit) {

    println("value is $x")

    callback(x);

}






fun main() {

    reformat("", true, true, false, '_')



    reformat("",
        normalizeCase = true,
        upperCaseFirstLetter = true,
        divideByCamelHumps = false,
        wordSeparator = '_'
    )



    reformat("", wordSeparator = '_')




    // lambda param demo



}




// inline!





// https://kotlinlang.org/docs/reference/functions.html



