package com.linebeck.hyrulebattle.enums

enum class GameType {
    TEAM,
    FREE_FOR_ALL,
    PRACTICE,
    ONE_VS_ONE,
    DEBUG;

    companion object {

        @JvmStatic
        fun getNameByGameType(gameType: GameType): String {
            TODO("Function is implemented in HyruleBattle.")
        }
    }
}