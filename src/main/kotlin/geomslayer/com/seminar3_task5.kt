package geomslayer.com

fun main(args: Array<String>) {
    println(getCombinations(setOf(1, 2, 3, 4)))
}

fun <T> getCombinations(set: Set<T>): List<List<T>> {
    val res = arrayListOf(arrayListOf<T>())
    set.forEach {
        val newElements = arrayListOf<ArrayList<T>>()
        for (combination in res) {
            newElements.add(ArrayList(combination))
            newElements.last().add(it)
        }
        res.addAll(newElements)
    }
    return res
}