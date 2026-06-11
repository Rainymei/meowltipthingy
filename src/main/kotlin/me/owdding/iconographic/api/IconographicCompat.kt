package me.owdding.iconographic.api

@Suppress("FunctionName")
interface IconographicCompat {

    fun `iconographic$isSkyblocker`(): Boolean

}

val IconographicCompat.isSkyblocker get() = this.`iconographic$isSkyblocker`()