package com.linebeck.hyrulebattle.mechanics

import com.linebeck.hyrulebattle.enums.MagicArrowType
import org.bukkit.entity.Arrow
import org.bukkit.persistence.PersistentDataContainer

class MagicArrows {

    companion object {

        @JvmStatic
        fun createFireArrow(arrow: Arrow) {
            TODO("Function is implemented in HyruleBattle.")
        }

        @JvmStatic
        fun createIceArrow(arrow: Arrow) {
            TODO("Function is implemented in HyruleBattle.")
        }

        @JvmStatic
        fun createLightArrow(arrow: Arrow) {
            TODO("Function is implemented in HyruleBattle.")
        }

        @JvmStatic
        fun createBombArrow(arrow: Arrow) {
            TODO("Function is implemented in HyruleBattle.")
        }

        fun isArrowType(dataContainer: PersistentDataContainer, value: MagicArrowType): Boolean {
            TODO("Function is implemented in HyruleBattle.")
        }
    }
}