package com.linebeck.hyrulebattle.interfaces

import org.bukkit.Location
import org.bukkit.entity.LivingEntity
import org.bukkit.entity.Player
import java.util.*

interface ISummonerCharacter {

    // <Player UUID, Set<Entity UUIDs>>
    val summonedEntities: MutableMap<UUID, MutableSet<UUID>>

    fun getSummonedEntities(uuid: UUID): MutableSet<UUID>? {
        TODO("Function is implemented in HyruleBattle.")
    }

    fun <T : LivingEntity> summonEntity(player: Player, clazz: Class<T>, location: Location): T {
        TODO("Function is implemented in HyruleBattle.")
    }

    fun cleanupSummons(player: Player) {
        TODO("Function is implemented in HyruleBattle.")
    }
}