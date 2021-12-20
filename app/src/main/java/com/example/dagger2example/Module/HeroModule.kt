package com.example.dagger2example.Module

import com.example.dagger2example.IronMan
import com.example.dagger2example.Model.Hero
import com.example.dagger2example.Model.Person
import com.example.dagger2example.Model.Weapon
import com.example.dagger2example.Suit
import dagger.Module
import dagger.Provides

@Module
class HeroModule {
    @Provides
    fun providePerson() : Person = IronMan()

    @Provides
    fun provideWeapon() : Weapon = Suit()

    @Provides
    fun provideHero(person : Person, weapon : Weapon)= Hero(person, weapon)
}