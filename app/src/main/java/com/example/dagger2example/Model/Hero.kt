package com.example.dagger2example.Model

import android.util.Log
import javax.inject.Inject

interface Person{
    fun name() : String
    fun skill() : String
}
interface Weapon {
    fun type() : String
}
class Hero @Inject constructor(private val person : Person, private val weapon : Weapon) {
    fun info(){
        println("${person.name()} ${person.skill()}")
    }
}