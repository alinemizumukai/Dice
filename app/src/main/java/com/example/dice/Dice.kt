package com.example.dice

class Dice{
    var sides: Int = 6 //default

    fun roll(): Int{
        val interval = 1..sides
        val number = interval.random()
        return number
    }

}