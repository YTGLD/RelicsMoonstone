package com.ytgld.relics_moonstone.mixin.nightmare;

import com.moonstone.moonstonemod.Handler;
import com.moonstone.moonstonemod.init.Items;
import com.moonstone.moonstonemod.item.nightmare.nightmareeye;
import com.ytgld.relics_moonstone.event.NightmareCharm;
import it.hurts.sskirillss.relics.items.relics.base.IRelicItem;
import it.hurts.sskirillss.relics.utils.EntityUtils;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(nightmareeye.class)
public class NightmareEyeMixin {
    @ModifyVariable(method = "un_un_pla", at = @At(value = "INVOKE", target = "Lcom/moonstone/moonstonemod/Handler;hascurio(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/Item;)Z"), index = 4)
    public float un_un_pla(float s, Player player, ItemStack nightmarecharm) {
        if (Handler.hascurio(player, Items.nightmarecharm.get())){
            ItemStack stack = EntityUtils.findEquippedCurio(player, Items.nightmarecharm.get());
            if (stack.getItem() instanceof IRelicItem relicItem) {
                float lvl = (float) relicItem.getStatValue(stack, NightmareCharm.doas,NightmareCharm.stat);
                lvl/=100;
                if (lvl>s){
                    lvl=s;
                }
                return s - lvl;
            }
        }
        return s;
    }
}
