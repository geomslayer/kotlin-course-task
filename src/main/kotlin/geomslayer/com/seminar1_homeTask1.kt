package geomslayer.com

import java.util.*

fun main(args: Array<String>) {
    val list = listOf("meat", "salt", "water", "marshmallow", "sugar", "whisky")
    println(process(list))
}

fun process(list: List<String>): List<List<String>> {
    val map = TreeMap<Char, MutableList<String>>()
    for (word in list) {
        if (map[word[0]] != null) {
            map[word[0]]!!.add(word)
        } else {
            map[word[0]] = MutableList(1, {word})
        }
    }
    val res = MutableList<List<String>>(0, { emptyList() })
    for ((_, innerList) in map) {
        res.add(innerList.toList())
    }
    return res.toList()
}

