package geomslayer.com

import java.util.*

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val res = process(list, hashSetOf(0, 1, 2, 3, 6))
    println("middle is ${middle(list)}, custom middle is $res")
}

fun process(list: List<Int>, positions: HashSet<Int>): Double {
    val n = positions.size
    val measures = Array(n, { 0.0 })
    for (i in 0..n - 1) {
        measures[i] = list.filterIndexed { index, _ -> index in positions }
                .sum()
                .toDouble() / n
        Collections.shuffle(list)
    }
    return measures.sum() / n
}

fun middle(list: List<Int>): Double {
    return list.sum().toDouble() / list.size
}