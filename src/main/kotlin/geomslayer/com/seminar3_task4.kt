package geomslayer.com

fun main(args: Array<String>) {
    println(substr("abcdefg", 4, 5))
}

fun substr(str: String, a: Int, b: Int): String {
    return str.substring(a..b)
}