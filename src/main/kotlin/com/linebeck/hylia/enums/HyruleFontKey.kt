package com.linebeck.hylia.enums

enum class HyruleFontKey(val key: String) {

    ALBW_BOTW_HYLIAN_REGULAR("albw-botw-hylian-regular"),
    BOTW_SHEIKAH("botw-sheikah"),
    BOTW_SHEIKAH_BOLD("botw-sheikah-bold"),
    CONDUCTOR("conductor"),
    DEFAULT("default"),
    DIALOGUE("dialogue"),
    GUI("gui"),
    HYLIAN64("hylian64"),
    HYLIANSYMBOLS("hyliansymbols"),
    HYLIASERIF_REGULAR("hyliaserif-regular"),
    HYLIASERIF_SUBTITLE("hyliaserif-subtitle"),
    HYLIASERIF_TITLE("hyliaserif-title"),
    ICONS("icons"),
    ITEMS("items"),
    MAGICKA("magicka"),
    OCARINA("ocarina"),
    ROCKNROLL_ONE("rocknroll-one"),
    RUPEES("rupees"),
    SHEIKAH_ICONS("sheikah-icons"),
    SHOP("shop"),
    SLATE("slate"),
    TINGLE_TUNER("tingle_tuner"),
    TRIFORCE("triforce");

    companion object {
        private val byKey = entries.associateBy { it.key }

        fun fromKey(key: String): HyruleFontKey? = byKey[key]
    }
}
