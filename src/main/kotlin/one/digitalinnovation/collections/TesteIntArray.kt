package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)
    values[0] = 5
    values[1] = 2
    values[2] = 3
    values[3] = 4
    values[4] = 1

    for(value in values) {
        println(value)
    }
    println("---------------------------")

    values.forEach {
        println(it)
    }
    println("---------------------------")

    values.forEach { value ->
        println(value)
    }
    println("---------------------------")

    for(index in values.indices) {
        println(values[index])
    }
    println("---------------------------")

    values.sort()
    for(value in values) {
        println(value)
    }
    println("---------------------------")

}