package geomslayer.com

fun main(args: Array<String>) {
    println(buildList(listOf(1, 2, 3, 2, 2, 4, 6), setOf(1, 2, 4)))
}

fun buildList(list: List<Int>, set: Set<Int>): List<List<Int>> {
    val map = linkedMapOf<Int, ArrayList<Int>>()
    set.forEach { map[it] = arrayListOf<Int>() }
    list.forEachIndexed { index, num -> map[num]?.add(index) }
    return map.values.toList()
}