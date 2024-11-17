package com.ytgld.relics_moonstone.event;

import com.moonstone.moonstonemod.Handler;
import com.moonstone.moonstonemod.init.Items;
import it.hurts.sskirillss.relics.items.relics.base.IRelicItem;
import it.hurts.sskirillss.relics.utils.EntityUtils;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;

public class MaxBloodSword {
    public static final String blood="max_sword";
    public static final String bloodStat="amout";
    public  static void LivingIncomingDamageEvent(LivingIncomingDamageEvent event){
        if (event.getSource().getEntity() instanceof Player player){
            if (Mth.nextInt(RandomSource.create(),1,2)==1) {
                ItemStack stack = EntityUtils.findEquippedCurio(player, Items.max_sword.get());
                if (Handler.hascurio(player, Items.max_sword.get())) {
                    if (stack.getItem() instanceof IRelicItem relicItem) {
                        relicItem.addRelicExperience(player, stack, 1);

                        player.heal((float) relicItem.getStatValue(stack, blood, bloodStat));
                    }
                }
            }
        }
    }
}
