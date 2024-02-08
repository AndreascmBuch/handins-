package com.example.myapplication

/// 1.opgave

fun personOver18 (age: Int): String {
return if (age>=18){
    "You are eligible to vote"
} else {
    "You are not eligible to vote"
}
}
/// 2.Opgave
// max function

fun max (a:Int,b:Int,c:Int){
    if (a>b && a>c)
        println("$a is the largest number")
    else if (b>a && b>c)
        println("$b is the largest number")
    else
        println("$c is the largest number")
}
// min-function

fun min (a:Int,b:Int,c:Int) {
    if (a<b && a<c)
        println("$a is the lowest number")
    else if (b<a && b<c)
        println("$b is the lowest number")
    else
        println("$c is the lowest number")
}

/// 3.Opgave

fun calculateAverage (arr: Array<Int>): Double {
    return if(arr.isNullOrEmpty()) 0.0
    else arr.average()
}

/// 4.opgave

fun isCPRValid (CPR:String): Boolean {
    if (CPR.length !=10) {
        return false }

        return try {
            val dag = CPR.substring(0, 2).toInt()
            val måned = CPR.substring(2, 4).toInt()
            dag <=31 && måned <=12
        } catch (e: NumberFormatException) {
            false
        }
    }


// 5. opgave

fun fizzBuzz () {
    for (i in 1..100) {
        when {
            i % 5==0 && i % 3==0 -> println("FizzBuzz")
            i % 3==0 -> println("Fizz")
            i % 5==0 -> println("Buzz")
            else -> println(i)
        }
    }
}

/// 6. opgave

fun shortName (name:String){
    return

}

/// 7. opgave

fun calculateGrade (grade:Int):String {
    return when {
        grade in 90..100-> "A"
        grade in 80..90-> "B"
        grade in 70..80-> "C"
        grade in 60..70-> "D"
        grade < 60-> "F"
        else -> "Invalid grade"
    }
}
// 8.opgave

fun filterWordsByLength () {

}

fun main() {
    println(personOver18(6))
    println(max(1,18,8))
    println(min(1,18,-8))
    val array = arrayOf(10, 20, 30, 40, 50)
    println(calculateAverage(array))
    println(isCPRValid("3212892716"))
    println(fizzBuzz())
    println(calculateGrade(90))
}

