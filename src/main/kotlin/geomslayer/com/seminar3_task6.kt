package geomslayer.com

import java.util.*

fun main(args: Array<String>) {
    val gr = Graph()
    println(gr.colors.toList())
}

class Graph {
    val n: Int      // count of vertexes
    val m: Int      // count of edges

    val list: Array<ArrayList<Int>>
    val colors: Array<Int>

    init {
        val scanner = Scanner(System.`in`)
        n = scanner.nextInt()
        m = scanner.nextInt()

        list = Array(n, { arrayListOf<Int>() })
        colors = Array(n, { 0 })
        for (i in 1..m) {
            val u = scanner.nextInt() - 1
            val v = scanner.nextInt() - 1
            list[u].add(v)
            list[v].add(u)
        }

        colorize()
    }

    private fun colorize() {
        val order = (0..n - 1).toMutableList()
        Collections.shuffle(order)
        order.forEach { colors[it] = getAvailableColor(it) }
    }

    private fun getAvailableColor(vert: Int): Int {
        val set = TreeSet<Int>()
        list[vert].forEach { set.add(colors[it]) }
        return (1..n).first { !set.contains(it) }
    }
}