package me.owdding.iconographic.utils

import me.owdding.iconographic.Iconographic

enum class StarStyle(private val id: String) {
    FOUR_POINT("4"),
    FOUR_POINT_NO_BORDER("4_no_border"),
    FIVE_POINT("5"),
    FIVE_POINT_NO_BORDER("5_no_border"),
    ;

    val identifier = Iconographic.id("stars/star_${id}")
}