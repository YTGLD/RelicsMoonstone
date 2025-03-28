package com.ytgld.moonstone_dna.dna.plague.BloodVirus;

import com.moonstone.moonstonemod.init.moonstoneitem.extend.BloodViru;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class sleepgene extends BloodViru {
    @Override
    public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("item.sleepgene.tool.string").withStyle(ChatFormatting.RED));
            pTooltipComponents.add(Component.translatable("item.sleepgene.tool.string.1").withStyle(ChatFormatting.RED));
        } else {
            pTooltipComponents.add(Component.translatable("Shift").withStyle(ChatFormatting.DARK_RED));
        }
    }
}
