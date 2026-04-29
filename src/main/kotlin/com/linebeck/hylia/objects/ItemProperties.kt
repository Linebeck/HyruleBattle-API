package com.linebeck.hylia.objects

import com.linebeck.hylia.enums.HyruleItem
import net.kyori.adventure.text.Component
import org.bukkit.Material

class ItemProperties(
    displayName: Component,
    val hyruleItem: HyruleItem,
    material: Material,
    description: List<Component>?
) : BasicItemProperties(displayName, material, description)

class HeadProperties(
    displayName: Component,
    description: List<Component>?
) : BasicItemProperties(displayName, Material.PLAYER_HEAD, description)

open class BasicItemProperties(
    val displayName: Component,
    val material: Material,
    val description: List<Component>?
) {
    val name: String = TODO("Function is implemented in Hylia.")
}