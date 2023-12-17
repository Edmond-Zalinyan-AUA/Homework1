package com.example.homework1

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Scanner

class Main {
}

@RequiresApi(Build.VERSION_CODES.O)
fun main() {
    println("Task 1.")
    task1()
    println("-----------------------------------------------------")
    println("Task 2.")
    task2()
    println("-----------------------------------------------------")

    println("Task 3.")
    task3()
    println("-----------------------------------------------------")

    println("Task 4.")
    task4()
    println("-----------------------------------------------------")

    println("Task 5.")
    task5()
    println("-----------------------------------------------------")

    println("Task 6.")
    task6()
    println("-----------------------------------------------------")

    println("Task 7.")
    task7()
    println("-----------------------------------------------------")

    println("Task 8.")
    task8()
    println("-----------------------------------------------------")

    println("Task 9.")
    task9()
    println("-----------------------------------------------------")

    println("Task 10.")
    task10()
    println("-----------------------------------------------------")
}

/**
 * Task 1: Declare an array and a list of your choice, initialize them with values, and print the elements.
 */
fun task1() {
    val array = arrayOfNulls<String>(4)
    array[0] = "First"
    array[1] = "Second"
    array[2] = "Third"
    array[3] = "Last"
    for (element in array) {
        print("$element ")
    }
    println()
    val list = listOf("item1", "item2", "item3", "item4")
    println(list.joinToString(", "))
}

/**
 * Task 2: Create a string variable and perform various string manipulations such as concatenation,
 * substring extraction, and changing case, then print the modified string.
 */
fun task2() {
    var string1 = "name"
    val string2 = "surname"
    string1 += " $string2"
    string1 = string1.substring(5)
    string1 = string1.uppercase()
    println(string1) //should become "SURNAME"
}

/**
 * Task3: Declare a map with key-value pairs and iterate through it to print both keys and values.
 */
fun task3() {
    val map = mapOf(1 to "value1", 2 to "value2", 3 to "value3")
    for (entry in map) {
        println("${entry.key}-> ${entry.value}")
    }

}

/**
 * Task 4: Write a function that takes an integer as input and returns a string indicating
 * whether it's positive, negative, or zero. Call this function with different integer
 * inputs and print the results.
 */
fun task4() {
    fun tellTheSign(input: Int) {
        if (input > 0) {
            println("$input is positive")
            return
        }
        if (input < 0) {
            println("$input is negative")
            return
        } else
            println("the input is zero")
        return
    }
    tellTheSign(4)
    tellTheSign(-4)
    tellTheSign(0)
}

/**
 * Task5: Create a program that asks the user for their name and age,
 * then prints a personalized greeting with their name and a message based on their age.
 */
fun task5() {
    val reader = Scanner(System.`in`)

    print("What is your name?: ")
    val name = reader.next()
    print("How old are you, $name?: ")
    val age = reader.nextInt()
    println("Wow, already $age?")
}

/**
 * task 6: Write a function that takes two numbers as input and divides them.
 * Implement error handling to handle division by zero and print an appropriate message.
 */
fun task6() {
    fun divide(input1: Double, input2: Double) {
        if (input2.compareTo(0) == 0) {
            println("You can't divide by 0")
            return
        }
        println(input1 / input2)
    }
    divide(8.toDouble(), 4.toDouble())
    divide(9.toDouble(), 2.toDouble())
    divide(9.toDouble(), 0.toDouble())
}

/**
 * Task7:	Get the current date and time, format it, and print it.
 */
@RequiresApi(Build.VERSION_CODES.O)
fun task7() {
    val dateTime = LocalDateTime.now()
    println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME))
}

/**
 * Task8: Define a class representing a simple "Person" with properties like name and age.
 * Create an object of this class and print its properties.
 */
fun task8() {
    val me = Person("Edmond", 21)
    println("${me.name} is ${me.age} years old.")
}

/**
 * Task9: Extend Person class and write a function that takes a person's age as input
 * and returns a string indicating their life stage (e.g., "Child," "Teenager," "Adult”).
 */
fun task9() {
    val me = Person("Edmond", 21)
    fun getLifeStage(person: Person): String {
        if (person.age < 10)
            return "Child"
        if (person.age > 20)
            return "Adult"
        return "Teenager"
    }
    println("${me.name}'s life stage is ${getLifeStage(me)}")
}

/**
 * Task 10:	Declare a list of integers and use a lambda function to filter
 * and print only the even numbers from the list.
 */
fun task10() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    fun isEven(number: Int): Boolean {
        return number % 2 == 1
    }
    list.stream().filter(::isEven).forEach(::println)
}
