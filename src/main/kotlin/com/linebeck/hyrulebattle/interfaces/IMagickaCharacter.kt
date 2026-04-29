package com.linebeck.hyrulebattle.interfaces

import com.linebeck.hylia.objects.Magic
import java.util.*

interface IMagickaCharacter {

    val magickaPlayers: MutableMap<UUID, Magic>

    fun getMagicka(playerId: UUID): Magic? {
        TODO("Function is implemented in HyruleBattle.")
    }

    fun addMagickaPlayer(playerId: UUID, magicka: Int = 20) {
        TODO("Function is implemented in HyruleBattle.")
    }

    fun removeMagickaPlayer(playerId: UUID) {
        TODO("Function is implemented in HyruleBattle.")
    }
}