package com.ytgld.moonstone_dna.init.moonstoneitem.extend;

import com.moonstone.moonstonemod.init.moonstoneitem.i.IDoom;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import org.jetbrains.annotations.NotNull;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurio;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class Doom extends Item implements ICurioItem , IDoom {
    public Doom() {
        super(new Properties().stacksTo(1).rarity(Rarity.RARE));
    }
    /*
     @Override
     public boolean canEquip(SlotContext slotContext, ItemStack stack) {
         if (slotContext.entity() instanceof Player player) {
             if (Handler.hascurio(player, stack.getItem())){
                 return false;
             }
         }
         return true;
     }

      */



    @NotNull
    @Override
    public ICurio.DropRule getDropRule(SlotContext slotContext, DamageSource source, boolean recentlyHit,
                               ItemStack stack) {
        return ICurio.DropRule.ALWAYS_KEEP;
    }
}
