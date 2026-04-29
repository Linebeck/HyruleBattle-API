package com.linebeck.hylia.objects

class Magic(private var magicka: Int) {

    companion object {

        @JvmStatic
        val MAX = 20
    }

    fun hasMagic(): Boolean {
        TODO("Function is implemented in HyruleBattle.")
    }

    fun hasInfiniteMagic(): Boolean {
        TODO("Function is implemented in HyruleBattle.")
    }

    fun setInfiniteMagic(value: Boolean) {
        TODO("Function is implemented in HyruleBattle.")
    }

    fun getMagicka(): Int = magicka

    fun addMagic(amount: Int) {
        TODO("Function is implemented in HyruleBattle.")
    }

    fun subtractMagic(amount: Int) {
        TODO("Function is implemented in HyruleBattle.")
    }

    fun setMagic(amount: Int) {
        TODO("Function is implemented in HyruleBattle.")
    }

    fun hasEnoughMagic(amount: Int): Boolean {
        TODO("Function is implemented in HyruleBattle.")
    }
}