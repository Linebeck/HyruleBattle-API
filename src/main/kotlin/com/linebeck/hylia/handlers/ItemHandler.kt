package com.linebeck.hylia.handlers

import com.linebeck.hylia.enums.HyruleItem
import com.linebeck.hylia.objects.BasicItemProperties
import com.linebeck.hylia.objects.ItemProperties
import net.kyori.adventure.text.Component
import org.bukkit.Material
import org.bukkit.NamespacedKey
import org.bukkit.inventory.ItemStack
import org.bukkit.plugin.java.JavaPlugin

object ItemHandler {

    private const val HYRULE_NAMESPACE = "hyrulecore"

    @JvmStatic
    fun createItem(plugin: JavaPlugin, data: String, hyruleItem: HyruleItem, material: Material, displayName: Component, lore: List<Component>? = null): ItemStack {
        TODO("Function is implemented in Hylia.")
    }

    @JvmStatic
    fun createItem(plugin: JavaPlugin, data: String, itemProperties: ItemProperties): ItemStack {
        TODO("Function is implemented in Hylia.")
    }

    @JvmStatic
    fun createItem(plugin: JavaPlugin, itemProperties: ItemProperties): ItemStack {
        TODO("Function is implemented in Hylia.")
    }

    @JvmStatic
    fun createItem(plugin: JavaPlugin, data: String, baseItemProperties: BasicItemProperties): ItemStack {
        TODO("Function is implemented in Hylia.")
    }

    @JvmStatic
    fun createItem(plugin: JavaPlugin, baseItemProperties: BasicItemProperties): ItemStack {
        TODO("Function is implemented in Hylia.")
    }

    @JvmStatic
    fun swapItemModel(itemStack: ItemStack, hyruleItem: HyruleItem) {
        TODO("Function is implemented in Hylia.")
    }

    @JvmStatic
    fun isSameItem(plugin: JavaPlugin, itemStack: ItemStack, compareStack: ItemStack): Boolean {
        TODO("Function is implemented in Hylia.")
    }

    @JvmStatic
    fun isHyruleItem(itemStack: ItemStack, hyruleItem: HyruleItem): Boolean {
        TODO("Function is implemented in Hylia.")
    }

    @JvmStatic
    fun getHyruleItemByItemModel(itemModel: NamespacedKey): HyruleItem? {
        TODO("Function is implemented in Hylia.")
    }
}