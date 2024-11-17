package com.ytgld.relics_moonstone.mixin.necora;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.moonstone.moonstonemod.Handler;
import com.moonstone.moonstonemod.entity.zombie.cell_giant;
import com.moonstone.moonstonemod.init.Items;
import com.ytgld.relics_moonstone.event.BoneCell;
import it.hurts.sskirillss.relics.items.relics.base.IRelicItem;
import it.hurts.sskirillss.relics.utils.EntityUtils;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(cell_giant.class)
public abstract class CellGiantMixin extends TamableAnimal {
    @Shadow
    public abstract @Nullable LivingEntity getOwner();

    protected CellGiantMixin(EntityType<? extends TamableAnimal> entityType, Level level) {
        super(entityType, level);
    }

    @Inject(method = "tick", at = @At(value = "RETURN"))
    public void un_un_pla(CallbackInfo ci){
        if (this.getOwner()!=null&&this.getOwner() instanceof Player player) {
            ((cell_giant) (Object) this).getAttributes().addTransientAttributeModifiers(relics_moontone$modifierMultimap(player));
        }
    }
    @Unique
    private Multimap<Holder<Attribute>, AttributeModifier> relics_moontone$modifierMultimap(LivingEntity owner) {
        Multimap<Holder<Attribute>, AttributeModifier> modifierMultimap = HashMultimap.create();
        if (owner instanceof Player player) {
            if (Handler.hascurio(player, Items.bone_cell.get())) {
                ItemStack stack = EntityUtils.findEquippedCurio(player, Items.bone_cell.get());
                if (stack.getItem() instanceof IRelicItem relicItem) {
                    float s = (float) relicItem.getStatValue(stack, BoneCell.doas, BoneCell.stat);

                    s/=200;

                    modifierMultimap.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(ResourceLocation.withDefaultNamespace("base_attack_do_mixin"), s, AttributeModifier.Operation.ADD_MULTIPLIED_BASE));
                }
            }else {
                return modifierMultimap;
            }
        }
        return modifierMultimap;
    }
}
