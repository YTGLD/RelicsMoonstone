package com.ytgld.moonstone_dna.init.moonstoneitem.extend;

import com.moonstone.moonstonemod.Handler;
import com.moonstone.moonstonemod.init.items.Items;
import com.moonstone.moonstonemod.init.moonstoneitem.DataReg;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class INanoBattery extends Doom {
    public int t;
    public static final String nameTime = "ALLBattery";

    public int getT() {
        return t;
    }

    public void setT(int t, LivingEntity player, ItemStack stack) {
        if (Handler.hascurio(player, Items.battery.get())||
                Handler.hascurio(player, Items.soulbattery.get())||
                Handler.hascurio(player, Items.ectoplasmbattery.get())||
                Handler.hascurio(player, Items.mbattery.get()))
        {
            t = (int) (t *  0.7);
        }
        if (stack.get(DataReg.tag)!=null &&
                stack.get(DataReg.tag).getBoolean(nameTime)){
            t = (int) (t *  0.8);
        }
        this.t = t;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
        tooltipComponents.add(Component.translatable("moonstone.string.cooling").append(String.valueOf(getT())).withStyle(ChatFormatting.GOLD));
        tooltipComponents.add(Component.literal(""));
    }
}