package ru.stimmax.lesson07



fun main() {

    var counter: Int = 0
    for (i in 20 downTo 1) {
        counter++
        if (counter == 4) {
            counter = 0
            continue
        }
        println(i)
    }

}