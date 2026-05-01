package com.linebeck.hylia.enums

import org.bukkit.Material

enum class HyruleBlock(
    val binary: String,
    val material: Material,
    val path: String
) {

    BLACK("011110", Material.BROWN_MUSHROOM_BLOCK, "blocks/black"),
    CRATE_BLOCK("000011", Material.BROWN_MUSHROOM_BLOCK, "blocks/crate_block"),
    ELDIN_IRON_ORE_BLOCK("011111", Material.BROWN_MUSHROOM_BLOCK, "blocks/eldin_iron_ore_block"),
    GERUDO_BLOCK("000001", Material.BROWN_MUSHROOM_BLOCK, "blocks/gerudo_block"),
    GODTRIBE_PILLAR_BRICKS("010010", Material.BROWN_MUSHROOM_BLOCK, "blocks/godtribe_pillar_bricks"),
    GODTRIBE_STONE("001111", Material.BROWN_MUSHROOM_BLOCK, "blocks/godtribe_stone"),
    GODTRIBE_STONE_CHISELED_PILLAR("010000", Material.BROWN_MUSHROOM_BLOCK, "blocks/godtribe_stone_chiseled_pillar"),
    GODTRIBE_STONE_PILLAR("010001", Material.BROWN_MUSHROOM_BLOCK, "blocks/godtribe_stone_pillar"),
    GODTRIBE_STONE_TRIFORCE("010110", Material.BROWN_MUSHROOM_BLOCK, "blocks/godtribe_stone_triforce"),
    HOOK_BLOCK("000010", Material.BROWN_MUSHROOM_BLOCK, "blocks/hook_block"),
    HYLIA_MOSAIC_LOWER_LEFT_BLOCK("011010", Material.BROWN_MUSHROOM_BLOCK, "blocks/hylia_mosaic_lower_left_block"),
    HYLIA_MOSAIC_LOWER_RIGHT_BLOCK("011000", Material.BROWN_MUSHROOM_BLOCK, "blocks/hylia_mosaic_lower_right_block"),
    HYLIA_MOSAIC_UPPER_LEFT_BLOCK("011001", Material.BROWN_MUSHROOM_BLOCK, "blocks/hylia_mosaic_upper_left_block"),
    HYLIA_MOSAIC_UPPER_RIGHT_BLOCK("010111", Material.BROWN_MUSHROOM_BLOCK, "blocks/hylia_mosaic_upper_right_block"),
    IRON_CRATE("011011", Material.BROWN_MUSHROOM_BLOCK, "blocks/iron_crate"),
    LODESTONE_TOP("001110", Material.BROWN_MUSHROOM_BLOCK, "blocks/lodestone_top"),
    MAILBOX_BLOCK("000101", Material.BROWN_MUSHROOM_BLOCK, "blocks/mailbox_block"),
    POLISHED_GODTRIBE_STONE("010011", Material.BROWN_MUSHROOM_BLOCK, "blocks/polished_godtribe_stone"),
    POLISHED_GODTRIBE_STONE_TRIFORCE("010101", Material.BROWN_MUSHROOM_BLOCK, "blocks/polished_godtribe_stone_triforce"),
    SHEIKAH_SLATE_PEDESTAL("011100", Material.BROWN_MUSHROOM_BLOCK, "blocks/sheikah_slate_pedestal"),
    SHEIKAH_STONE_BLOCK("000100", Material.BROWN_MUSHROOM_BLOCK, "blocks/sheikah_stone_block"),
    TIME_LOWER_LEFT_BLOCK("001101", Material.BROWN_MUSHROOM_BLOCK, "blocks/time_lower_left_block"),
    TIME_LOWER_RIGHT_BLOCK("001011", Material.BROWN_MUSHROOM_BLOCK, "blocks/time_lower_right_block"),
    TIME_SHIFT_STONE_BLOCK("000111", Material.BROWN_MUSHROOM_BLOCK, "blocks/time_shift_stone_block"),
    TIME_SHIFT_STONE_ORE_BLOCK("001000", Material.BROWN_MUSHROOM_BLOCK, "blocks/time_shift_stone_ore_block"),
    TIME_UPPER_LEFT_BLOCK("001100", Material.BROWN_MUSHROOM_BLOCK, "blocks/time_upper_left_block"),
    TIME_UPPER_RIGHT_BLOCK("001010", Material.BROWN_MUSHROOM_BLOCK, "blocks/time_upper_right_block"),
    TRUTH_BLOCK("000110", Material.BROWN_MUSHROOM_BLOCK, "blocks/truth_block"),
    WAVEY_GODTRIBE_STONE("010100", Material.BROWN_MUSHROOM_BLOCK, "blocks/wavey_godtribe_stone"),
    WHITE("011101", Material.BROWN_MUSHROOM_BLOCK, "blocks/white");

    companion object {
        private val byMaterialAndBinary = values().associateBy { it.material to it.binary }

        fun from(material: Material, binary: String): HyruleBlock? =
            byMaterialAndBinary[material to binary]
    }
}
