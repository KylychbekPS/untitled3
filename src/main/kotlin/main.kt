

fun main() {
    val array = intArrayOf(10, 2, 10, 3, 1, 2, 5, 2,-1, 3)
    println(array.contentToString())
    var needIteration = true
    while (needIteration) {
       needIteration = false
        for (i in 1 until array.size) {
            if (array[i] < array[i - 1]) {
                val tmp = array[i]
                array[i] = array[i-1]
                array[i-1] = tmp
               needIteration = true
            }
        }
    }
    println(array.contentToString())
}
