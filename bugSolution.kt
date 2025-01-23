fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val iterator = list.listIterator(list.size)
    while (iterator.hasPrevious()) {
        val element = iterator.previous()
        if (element % 2 == 0) {
            iterator.remove()
        }
    }
    println(list)
}