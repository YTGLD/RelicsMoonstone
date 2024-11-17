package com.ytgld.relics_moonstone.event;

import com.moonstone.moonstonemod.Handler;
import com.moonstone.moonstonemod.init.Items;
import it.hurts.sskirillss.relics.items.relics.base.IRelicItem;
import it.hurts.sskirillss.relics.utils.EntityUtils;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;

public class BoneCell {
    public static final String doas="bone_cell";
    public static final String stat="amout";
    public static void LivingDeathEvent(LivingDeathEvent event){
        if (event.getSource().getEntity() instanceof Player player){
            ItemStack stack = EntityUtils.findEquippedCurio(player, Items.bone_cell.get());
            if (Handler.hascurio(player,Items.bone_cell.get())){
                if (stack.getItem() instanceof IRelicItem relicItem) {
                    relicItem.addRelicExperience(player, stack, 5);
                }
            }
        }
    }
}
