package ru.stimmax.lesson05

fun main() {
    val sum = 10 + 5 //15
    val diff = 10 - 5 //5
    val product = 10 * 5 //50
    val remainder = 10 % 5 //0
    val reminder1 = 10 % 6 //4

    val isEqual = (5 == 5) //true
    val isNotEqual = (5 != 5) //false
    val isGreater = (5 > 3) //true
    val isLesser = (5 < 3) //false
    val isGreaterOrEqual = (5 >= 5) //true
    val isLesserOrEqual = (5 <= 5) //true

    val andResult = (5 > 3) && (5 > 4) //true
    val orResult = (5 > 3) || (5 < 4) //true
    val notResult = !(5 > 3) //false

    var number = 5
    number += 3
    //также есть -=, *=, /=, %=

    var a = 5
    var b = a++
    print("a: $a")
    print("b: $b")

    var c = 5
    var d = ++c
    print("a: $c")
    print("b: $d")


}