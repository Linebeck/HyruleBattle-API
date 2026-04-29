package com.linebeck.hyrulebattle.abstracts

import com.destroystokyo.paper.profile.ProfileProperty
import com.linebeck.hylia.enums.HyruleSound
import io.papermc.paper.event.player.PlayerItemCooldownEvent
import io.papermc.paper.event.player.PlayerStopUsingItemEvent
import org.bukkit.entity.Player
import org.bukkit.event.entity.*
import org.bukkit.event.player.*
import java.util.*
import java.util.concurrent.ConcurrentHashMap

abstract class BaseCharacter(
    val name: String,
    val profileProperty: ProfileProperty,
    var tauntSound: HyruleSound? = null,
    var health: Float,
    var enabled: Boolean,
    var overridden: Boolean
) {

    private val players = ConcurrentHashMap.newKeySet<UUID>()
    fun getPlayers(): Set<UUID> = players

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

    open fun onItemCooldown(event: PlayerItemCooldownEvent) {}

    open fun onStopUsingItem(event: PlayerStopUsingItemEvent) {}

    open fun onItemConsume(event: PlayerItemConsumeEvent) {}

    abstract fun onAttack(event: EntityDamageByEntityEvent)

    abstract fun onBowAttack(event: EntityDamageByEntityEvent)

    abstract fun onBowShoot(event: EntityShootBowEvent)

    abstract fun onProjectileAttack(event: EntityDamageByEntityEvent)

    abstract fun onProjectileLaunch(event: ProjectileLaunchEvent)

    abstract fun onProjectileHit(event: ProjectileHitEvent)

    open fun onEggThrow(event: PlayerEggThrowEvent) {}

    abstract fun onHeld(event: PlayerItemHeldEvent)

    open fun onSwap(event: PlayerSwapHandItemsEvent) { event.isCancelled = true }

    abstract fun onSneak(event: PlayerToggleSneakEvent)

    open fun onPickup(event: EntityPickupItemEvent) { event.isCancelled = true }

    open fun onPickupArrow(event: PlayerPickupArrowEvent) { event.isCancelled = true }

    open fun onDrop(event: PlayerDropItemEvent) { event.isCancelled = true }

    abstract fun onMove(event: PlayerMoveEvent)

    @Suppress("UnstableApiUsage")
    open fun onInput(event: PlayerInputEvent) {}

    abstract fun onItemMerge(event: ItemMergeEvent)

    abstract fun onHurt(event: EntityDamageByEntityEvent)

    abstract fun onHurt(event: EntityDamageEvent)

    open fun onDeath(event: PlayerDeathEvent) {}

    open fun cleanup(player: Player) {}

    private fun playTauntSound(player: Player) {}
}