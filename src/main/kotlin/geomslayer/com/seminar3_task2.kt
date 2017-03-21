package geomslayer.com

fun main(args: Array<String>) {
    val str = "abacaba"
    println(if (isPalindrome(str)) "Yes" else "No")
}

fun isPalindrome(str: String): Boolean {
    return str == str.reversed()
}