package _02classes

fun String.firstLetter(): Char? {
    return if (this.isNotEmpty()) this[0] else null
}





fun Any?.toSafeString() = if (this!=null) this.toString() else ""





val <T> List<T>.lastIndex: Int
    get() = size - 1





