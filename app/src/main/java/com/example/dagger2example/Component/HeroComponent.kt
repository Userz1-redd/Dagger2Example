package com.example.dagger2example.Component

import com.example.dagger2example.Model.Hero
import com.example.dagger2example.Module.HeroModule
import dagger.Component

@Component(modules = [HeroModule::class])
interface HeroComponent {
    fun callHero() : Hero
}