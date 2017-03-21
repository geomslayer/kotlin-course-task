package geomslayer.com

import java.util.*

fun main(args: Array<String>) {
    for (len in 5..15) {
        println(generatePassword(len))
    }
}

fun generatePassword(len: Int): String {
    val rand = Random()
    val builder = StringBuilder()
    for (i in 1..len) {
        builder.append(when (rand.nextInt(3)) {
            0 -> 'a' + rand.nextInt(26)
            1 -> 'A' + rand.nextInt(26)
            2 -> '0' + rand.nextInt(10)
            else -> '?'
        })
    }
    return builder.toString()
}