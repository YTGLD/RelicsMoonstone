package com.ytgld.moonstone_dna.dna.plague.BloodVirus.dna;

import com.moonstone.moonstonemod.init.moonstoneitem.extend.BloodViru;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class cell_doctor extends BloodViru {
    @Override
    public void appendHoverText(ItemStack stack, TooltipContext pContext, List<Component> tooltip, TooltipFlag flags) {
        super.appendHoverText(stack, pContext, tooltip, flags);
        tooltip.add(Component.translatable("item.cell_doctor.tool.string").withStyle(ChatFormatting.RED));
    }
}
