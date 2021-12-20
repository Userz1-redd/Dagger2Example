package com.example.dagger2example

import com.example.dagger2example.Component.DaggerHeroComponent
import com.example.dagger2example.Model.Person
import com.example.dagger2example.Model.Weapon


class IronMan : Person {
    override fun name() = "토니 스타크"

    override fun skill() = "수트 변형"

}
class Suit : Weapon {
    override fun type() = "수트"
}
fun main() {
    val hero = DaggerHeroComponent.create().callHero()
    hero.info()

}