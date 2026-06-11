package me.owdding.iconographic.utils.debug

import me.owdding.iconographic.utils.chat.ChatUtils
import me.owdding.iconographic.utils.extensions.literal
import tech.thatgravyboat.skyblockapi.api.events.misc.AbstractModRegisterDebugEvent
import tech.thatgravyboat.skyblockapi.utils.text.Text.send

internal class RegisterTttDebugEvent(base: RegisterIconCommandEvent) :
    AbstractModRegisterDebugEvent(ChatUtils.prefix, true, base) {

    fun tttRegister(name: String, commandName: String, init: DebugBuilder.() -> Unit) {
        base.registerWithCallback(name(commandName)) {
            RootDebugBuilder(name.literal()).apply(init).build().send()
        }
    }

}
