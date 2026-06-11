package me.owdding.iconographic.features.tags

import me.owdding.iconographic.config.categories.tag.TagConfig
import me.owdding.iconographic.system.RegisterFeature
import me.owdding.iconographic.system.TooltipFeature
import me.owdding.iconographic.system.TooltipTag
import net.minecraft.world.item.ItemStack
import tech.thatgravyboat.skyblockapi.api.datatype.DataTypes

@RegisterFeature
data object RarityTag : TooltipFeature() {
    override val enabled: Boolean get() = TagConfig.rarity
    override val priority: Int = 10

    override fun ItemStack.leftTags(): List<TooltipTag> {
        val rarity = DataTypes.RARITY() ?: return emptyList()
        return listOf(TooltipTag.literal(rarity.displayName, rarity.color))
    }
}