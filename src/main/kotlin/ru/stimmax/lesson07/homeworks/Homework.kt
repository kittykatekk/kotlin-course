package ru.stimmax.lesson07.homeworks

fun main() {

//Задания для цикла for

//Прямой диапазон
//1. Напишите цикл for, который выводит числа от 1 до 5.
    for (i in 1..5) {
        println(i)
    }

//2. Напишите цикл for, который выводит четные числа от 1 до 10.
    for (i in 1..10) {
        if (i % 2 == 0) println(i)

    }

//Обратный диапазон
//3. Создайте цикл for, который выводит числа от 5 до 1.
    for (i in 5 downTo 1) {
        println(i)
    }

//4. Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
    for (i in 5 downTo 1 step 2) {
        println(i)
    }
    //другой вариант, без шага, выводит число - 2
    for (i in 5 downTo 1) {
        println(i-2)
    }


//С шагом (step)
//5. Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.
    for (i in 1..9  step 2) {
        println(i)
    }

//6. Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.
    for (i in 1..20) {
        if (i % 3 == 0) {
            println(i)
        }
    }

//Использование до (until)
//7. Создайте числовую переменную 'size'. Используйте цикл for с шагом 2 для вывода чисел от 3 до size не включая size.
val size: Int = 31
    for (i in 3 until size step 2) {
        println(i)
    }

//    Задания для цикла while

//Цикл while
//8. Создайте цикл while, который выводит квадраты чисел от 1 до 5.
var num: Int = 1
    while (num in 1..5) {
        //println(num * num)
        //num++
    }

//9. Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
var num2: Int = 10
    while (num2 >= 5) {
        println(num2)
        num2--
    }

//Цикл do while
//10. Используйте цикл do while, чтобы вывести числа от 5 до 1.
    var num3: Int = 5
    do {
        println(num3)
        num3--
    } while (num3 >= 1)

//11. Создайте цикл do while, который повторяется, пока счетчик меньше 10, начиная с 5.
    var num4: Int = 5
    do {
        println(num4)
        num4++
    } while (num4 < 10)

//    Задания для прерывания и пропуска итерации

//Использование break
//12. Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.
    for (i in 1..10) {
        if (i == 6) break
        println(i)
    }

//13. Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
    var num6: Int = 1
while (num6 >= 1) {
    if (num6 == 10) break
        println(num6)
        num6++
    }

//Использование continue
//14. В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.
    for (i in 1..10) {
        if (i % 2 == 0) continue
        println(i)
    }

//15. Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.
    var num7: Int = 1
while (num7 in 1..10) {
    if (num7 % 3 == 0) {
        num7++
        continue
    }
    println(num7)
    num7++
    }
//    Задачи повышенной сложности

//1. Используя вложенный цикл реализовать таблицу умножения, как на картинке.
    for (i in 1..10) {
        //Внутренний цикл для столбцов
        for (j in 1..10) {
            val num8 = i * j
            //Добавление пробела к выводу
            print("$num8" + " ")
        }
        //Переход на новую строку
        println()
    }

//2. Напишите функцию, которая суммирует числа от 1 до 'arg' с помощью цикла for. 'arg' - целочисленный аргумент функции.
exercise2(3)

//3. Напишите функцию, которая вычисляет факториал числа 'arg' с использованием цикла while.
exercise3(20)

//4. Напишите функцию, которая находит сумму всех четных чисел от 2 до 'arg', используя цикл while.
exercise4(20)

//5. Напишите функцию, которая используя вложенные циклы while, выведет заполненный прямоугольник размером 5x3 из символов *.
exercise5(4, 6)

//6. Напишите функцию, которая используя цикл for найдёт суммы чётных и нечётных значений чисел от 1 до arg.
exercise6(7)

}

fun exercise2(arg: Int) {
    var sum = 0
    when {
        arg >= 1 -> for (i in 1..arg) {
            sum+=i
            //println(sum)
        }
        else -> println("Incorrect data")
    }
    println(sum)
}

fun exercise3(arg: Int) {
    var num: Int = 1
    var factorial: Long = 1
    while (num <= arg) {
            factorial *= num
            //println(factorial)
            num++
        }
    println(factorial)
}

fun exercise4(arg: Int) {
    var num: Int = 2
    var sum: Int = 0
    while (num in 2..arg) {
        if (num % 2 == 0) {
            sum+=num
            println(sum)
        }
        num++
    }
    println(sum)
}

fun exercise5(height: Int, width: Int) {
    var i: Int = 0
    while (i < height) {
        var j: Int = 0
        while (j < width) {
            print("*")
            j++
        }
        println() //переход на новую строку
        i++
    }
}

fun exercise6(arg: Int) {
    var num: Int = 1
    var sumOdd: Int = 0
    var sumEven: Int = 0
    while (num in 1..arg) {
        if (num % 2 == 0) {
            sumEven+=num
        } else {
            sumOdd+=num
        }
        num++
    }
    println("Cумма нечетных чисел: $sumOdd")
    println("Cумма четных чисел: $sumEven")
}