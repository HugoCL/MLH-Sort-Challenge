import kotlin.random.Random

fun main(args: Array<String>) {
    println("Generating random number for list length")

    val length = Random.nextInt(0, 100)
    val list = List(length) { Random.nextInt(0, 100) }
    val arrayList = ArrayList(list)
    println("List with $length numbers ranging from 0 to 100 generated")
    println("Pre-sorted list: $arrayList")

    print("Sorted list: " + insertionSort(arrayList, length))
}

fun insertionSort(list: ArrayList<Int>, length: Int): ArrayList<Int>{
    for (i in 0 until length){
        val number = list[i]
        var secondIndex = i - 1
        while ((secondIndex >= 0) && (list[secondIndex] > number)){
            list[secondIndex + 1] = list[secondIndex]
            secondIndex--
        }
        list[secondIndex + 1] = number
    }
    return(list)
}