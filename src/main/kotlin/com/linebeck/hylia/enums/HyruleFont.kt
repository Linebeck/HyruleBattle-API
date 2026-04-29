package com.linebeck.hylia.enums

enum class HyruleFont(
    val file: String,
    val chars: List<String>
) {

    DIALOGUE_DIALOGUE_BOX("hyrulecore:font/dialogue/dialogue_box.png", listOf("")),
    DIALOGUE_MM3D_SIGN("hyrulecore:font/dialogue/mm3d_sign.png", listOf("⃔")),
    DIALOGUE_WW_DIALOGUE_SWIRL("hyrulecore:font/dialogue/ww_dialogue_swirl.png", listOf("")),
    HYRULECORE_ITEM_GUI_CONTAINER_COOKINGPOT("hyrulecore:item/gui/container/cookingpot.png", listOf("")),
    HYRULECORE_ITEM_GUI_N64_A_BUTTON("hyrulecore:item/gui/n64/a_button.png", listOf("a")),
    HYRULECORE_ITEM_GUI_N64_DOWN_C_BUTTON("hyrulecore:item/gui/n64/down_c_button.png", listOf("1")),
    HYRULECORE_ITEM_GUI_N64_LEFT_C_BUTTON("hyrulecore:item/gui/n64/left_c_button.png", listOf("2")),
    HYRULECORE_ITEM_GUI_N64_RIGHT_C_BUTTON("hyrulecore:item/gui/n64/right_c_button.png", listOf("3")),
    HYRULECORE_ITEM_GUI_N64_UP_C_BUTTON("hyrulecore:item/gui/n64/up_c_button.png", listOf("4")),
    HYRULECORE_ITEM_GUI_OTHER_FOOD("hyrulecore:item/gui/other/food.png", listOf("🥖")),
    HYRULECORE_ITEM_GUI_OTHER_FOOD_HALF("hyrulecore:item/gui/other/food_half.png", listOf("🥐")),
    HYRULECORE_ITEM_GUI_OTHER_FULLSCREEN("hyrulecore:item/gui/other/fullscreen.png", listOf("1")),
    HYRULECORE_ITEM_GUI_OTHER_HEART("hyrulecore:item/gui/other/heart.png", listOf("❤")),
    HYRULECORE_ITEM_GUI_SHEIKAH_ICONS_BORDER("hyrulecore:item/gui/sheikah/icons/border.png", listOf("#")),
    HYRULECORE_ITEM_GUI_SHEIKAH_ICONS_MAGNESIS("hyrulecore:item/gui/sheikah/icons/magnesis.png", listOf("1")),
    HYRULECORE_ITEM_GUI_SHEIKAH_ICONS_SELECTOR("hyrulecore:item/gui/sheikah/icons/selector.png", listOf("0")),
    HYRULECORE_ITEM_GUI_SHEIKAH_SHEIKAH_SLATE_ASCEND("hyrulecore:item/gui/sheikah/sheikah_slate_ascend.png", listOf("🔼")),
    HYRULECORE_ITEM_GUI_SHEIKAH_SHEIKAH_SLATE_AUTOBUILD("hyrulecore:item/gui/sheikah/sheikah_slate_autobuild.png", listOf("/")),
    HYRULECORE_ITEM_GUI_SHEIKAH_SHEIKAH_SLATE_BLANK("hyrulecore:item/gui/sheikah/sheikah_slate_blank.png", listOf("-")),
    HYRULECORE_ITEM_GUI_SHEIKAH_SHEIKAH_SLATE_BOMB_PLUS("hyrulecore:item/gui/sheikah/sheikah_slate_bomb_plus.png", listOf("💣")),
    HYRULECORE_ITEM_GUI_SHEIKAH_SHEIKAH_SLATE_FUSE("hyrulecore:item/gui/sheikah/sheikah_slate_fuse.png", listOf(";")),
    HYRULECORE_ITEM_GUI_SHEIKAH_SHEIKAH_SLATE_MAGNESIS("hyrulecore:item/gui/sheikah/sheikah_slate_magnesis.png", listOf("🧲")),
    HYRULECORE_ITEM_GUI_SHEIKAH_SHEIKAH_SLATE_SELECT_0("hyrulecore:item/gui/sheikah/sheikah_slate_select_0.png", listOf("0")),
    HYRULECORE_ITEM_GUI_SHEIKAH_SHEIKAH_SLATE_SELECT_1("hyrulecore:item/gui/sheikah/sheikah_slate_select_1.png", listOf("1")),
    HYRULECORE_ITEM_GUI_SHEIKAH_SHEIKAH_SLATE_SELECT_2("hyrulecore:item/gui/sheikah/sheikah_slate_select_2.png", listOf("2")),
    HYRULECORE_ITEM_GUI_SHEIKAH_SHEIKAH_SLATE_SELECT_3("hyrulecore:item/gui/sheikah/sheikah_slate_select_3.png", listOf("3")),
    HYRULECORE_ITEM_GUI_SHEIKAH_SHEIKAH_SLATE_SELECT_4("hyrulecore:item/gui/sheikah/sheikah_slate_select_4.png", listOf("4")),
    HYRULECORE_ITEM_GUI_SHEIKAH_SHEIKAH_SLATE_SELECT_5("hyrulecore:item/gui/sheikah/sheikah_slate_select_5.png", listOf("5")),
    HYRULECORE_ITEM_GUI_SHEIKAH_SHEIKAH_SLATE_SELECT_6("hyrulecore:item/gui/sheikah/sheikah_slate_select_6.png", listOf("6")),
    HYRULECORE_ITEM_GUI_SHEIKAH_SHEIKAH_SLATE_SELECT_7("hyrulecore:item/gui/sheikah/sheikah_slate_select_7.png", listOf("7")),
    HYRULECORE_ITEM_GUI_SHEIKAH_SHEIKAH_SLATE_SELECT_8("hyrulecore:item/gui/sheikah/sheikah_slate_select_8.png", listOf("8")),
    HYRULECORE_ITEM_GUI_SHEIKAH_SHEIKAH_SLATE_STASIS_PLUS("hyrulecore:item/gui/sheikah/sheikah_slate_stasis_plus.png", listOf("📆")),
    HYRULECORE_ITEM_GUI_SHEIKAH_SHEIKAH_SLATE_WHEEL("hyrulecore:item/gui/sheikah/sheikah_slate_wheel.png", listOf("#")),
    LENS_OF_TRUTH_LENS("hyrulecore:font/lens_of_truth/lens.png", listOf("")),
    MUSIC_CONDUCTOR_CENTER_CONDUCTOR_DIAMOND("hyrulecore:font/music/conductor/center_conductor_diamond.png", listOf("")),
    MUSIC_CONDUCTOR_DOWN_CONDUCTOR_DIAMOND("hyrulecore:font/music/conductor/down_conductor_diamond.png", listOf("")),
    MUSIC_CONDUCTOR_EMPTY_CONDUCTOR_DIAMOND("hyrulecore:font/music/conductor/empty_conductor_diamond.png", listOf("")),
    MUSIC_CONDUCTOR_LEFT_CONDUCTOR_DIAMOND("hyrulecore:font/music/conductor/left_conductor_diamond.png", listOf("")),
    MUSIC_CONDUCTOR_RIGHT_CONDUCTOR_DIAMOND("hyrulecore:font/music/conductor/right_conductor_diamond.png", listOf("")),
    MUSIC_CONDUCTOR_UP_CONDUCTOR_DIAMOND("hyrulecore:font/music/conductor/up_conductor_diamond.png", listOf("")),
    MUSIC_CONDUCTOR_WW_METRONOME_BACKGROUND("hyrulecore:font/music/conductor/ww_metronome_background.png", listOf("")),
    MUSIC_CONDUCTOR_WW_RL_METRONOME_CIRCLE("hyrulecore:font/music/conductor/ww_rl_metronome_circle.png", listOf("")),
    MUSIC_CONDUCTOR_WW_RS_METRONOME_CIRCLE("hyrulecore:font/music/conductor/ww_rs_metronome_circle.png", listOf("")),
    MUSIC_CONDUCTOR_WW_WL_METRONOME_CIRCLE("hyrulecore:font/music/conductor/ww_wl_metronome_circle.png", listOf("")),
    MUSIC_CONDUCTOR_WW_WS_METRONOME_CIRCLE("hyrulecore:font/music/conductor/ww_ws_metronome_circle.png", listOf("")),
    MUSIC_OCARINA_A_BUTTON("hyrulecore:font/music/ocarina/a_button.png", listOf("")),
    MUSIC_OCARINA_DOWN_C_BUTTON("hyrulecore:font/music/ocarina/down_c_button.png", listOf("")),
    MUSIC_OCARINA_LEFT_C_BUTTON("hyrulecore:font/music/ocarina/left_c_button.png", listOf("")),
    MUSIC_OCARINA_RIGHT_C_BUTTON("hyrulecore:font/music/ocarina/right_c_button.png", listOf("")),
    MUSIC_OCARINA_STAFF("hyrulecore:font/music/ocarina/staff.png", listOf("")),
    MUSIC_OCARINA_UP_C_BUTTON("hyrulecore:font/music/ocarina/up_c_button.png", listOf("")),
    SHOP_SELECTOR("hyrulecore:font/shop/selector.png", listOf("")),
    UI_MAGIC_METER_MAGIC_METER_HALF("hyrulecore:font/ui/magic_meter/magic_meter_half.png", listOf("")),
    UI_MAGIC_METER_MAGIC_METER_INFINITE("hyrulecore:font/ui/magic_meter/magic_meter_infinite.png", listOf("")),
    UI_MAGIC_METER_MAGIC_METER_NEGATIVE("hyrulecore:font/ui/magic_meter/magic_meter_negative.png", listOf("")),
    UI_MAGIC_METER_MAGIC_METER_POSITIVE("hyrulecore:font/ui/magic_meter/magic_meter_positive.png", listOf("")),
    UI_RUPEE_NUMBERS("hyrulecore:font/ui/rupee_numbers.png", listOf("")),
    UI_RUPEE_WALLET_RUPEE_WALLETS("hyrulecore:font/ui/rupee_wallet/rupee_wallets.png", listOf(""));

    companion object {
        private val byFile = entries.associateBy { it.file }
        private val byChar = entries.flatMap { font ->
            font.chars.map { char -> char to font }
        }.toMap()

        fun fromFile(file: String): HyruleFont? = byFile[file]
        fun fromChar(char: String): HyruleFont? = byChar[char]
    }
}
