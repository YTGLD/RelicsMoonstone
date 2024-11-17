package com.ytgld.relics_moonstone.event;

import com.moonstone.moonstonemod.Handler;
import com.moonstone.moonstonemod.init.Items;
import it.hurts.sskirillss.relics.items.relics.base.IRelicItem;
import it.hurts.sskirillss.relics.utils.EntityUtils;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;

public class NightmareCharm {

    public static final String doas="nightmarecharm";
    public static final String stat="amout";
    public  static void LivingIncomingDamageEvent(LivingIncomingDamageEvent event){
        if (event.getEntity() instanceof Player player) {
            ItemStack stack = EntityUtils.findEquippedCurio(player, Items.nightmarecharm.get());
            if (Handler.hascurio(player, Items.nightmarecharm.get())) {
                if (stack.getItem() instanceof IRelicItem relicItem) {
                    relicItem.addRelicExperience(player, stack, 1);
                }
            }
        }
    }
}
