package com.linebeck.hyrulebattle.abstracts

import com.destroystokyo.paper.profile.ProfileProperty
import org.bukkit.entity.Player
import org.bukkit.event.entity.*
import org.bukkit.event.player.*
import java.util.*

abstract class BaseCharacter(
    val name: String,
    val profileProperty: ProfileProperty,
    var tauntSound: String,
    var health: Float,
    var enabled: Boolean,
    var overridden: Boolean
) {

    val players = mutableSetOf<UUID>()

    fun setup(player: Player) {
        player.inventory.clear()
        player.foodLevel = 16
        players.add(player.uniqueId)

        setSkin(player)
        setEquipment(player)
        addTaunt(player)
    }

    open fun setSkin(player: Player) {}

    open fun setEquipment(player: Player) {}

    private fun addTaunt(player: Player) {}

    abstract fun tick()

    // Filter for interacting.
    fun onInteract(event: PlayerInteractEvent) {}

    abstract fun onInteractItem(event: PlayerInteractEvent)

    abstract fun onInteractEntity(event: PlayerInteractEntityEvent)

    abstract fun onAttack(event: EntityDamageByEntityEvent)

    abstract fun onBowAttack(event: EntityDamageByEntityEvent)

    abstract fun onBowShoot(event: EntityShootBowEvent)

    abstract fun onProjectileAttack(event: EntityDamageByEntityEvent)

    abstract fun onProjectileLaunch(event: ProjectileLaunchEvent)

    abstract fun onHeld(event: PlayerItemHeldEvent)

    abstract fun onSneak(event: PlayerToggleSneakEvent)

    open fun onPickup(event: EntityPickupItemEvent) { event.isCancelled = true }

    abstract fun onPickupArrow(event: PlayerPickupArrowEvent)

    open fun onDrop(event: PlayerDropItemEvent) { event.isCancelled = true }

    abstract fun onMove(event: PlayerMoveEvent)

    abstract fun onItemMerge(event: ItemMergeEvent)

    abstract fun onHurt(event: EntityDamageByEntityEvent)

    abstract fun onHurt(event: EntityDamageEvent)

    open fun onDeath(event: PlayerDeathEvent) {}

    open fun cleanup(player: Player) {}

    private fun playTauntSound(player: Player) {}
}