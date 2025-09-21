package ru.stimmax.lesson06

import ru.stimmax.lesson03.PI

fun main() {

    val number = 10
    if (number > 5) {
        println("Число больше 5")
    }

    if (number % 2 == 0) {
        println("Число x")
    } else {
        println("Число нечетное")
    }

    val intRange = 1..10
//    val intRangeUntil = 1.. until < 10
//    val 1

    val inRange = 2 in intRange
    val notInRange = 2 !in intRange

    val score = 95
    when {
        score in 90..100 -> println("Good")
        score in 80..89 -> println("Ok")
        score in 70..79 -> println("Удовл")
        else -> print("вв")
    }

    val score1 = 95
    when (score) {
        2 -> print("2")
        in 90..100 -> println("Good")
        in 80..89 -> println("Ok")
        in 70..79 -> println("Удовл")
        else -> println("вв")
    }

    val a = 5
    val b = 6
    val max = if (a > b) a else b
    example1(24)
    example2(24, true)
}

fun example1(arg: Int) {
    when (arg) {
        in 0..5 -> println("night")
        in 6..11 -> println("morning")
        in 12..17 -> println("afternoon")
        in 18..23 -> println("evening")
        else -> println("incorrect")
    }
}

fun example2(arg1: Int, arg2: Boolean) {
    if (arg1 > 30 || arg1 < -20) {
        if (arg2) {
            println("stay at home")
        } else {
            println("take a car")
        }
    } else if (arg1 >= 15 && !arg2) {
        println("have a walk")
    } else {
        println("take a bus")
    }
}