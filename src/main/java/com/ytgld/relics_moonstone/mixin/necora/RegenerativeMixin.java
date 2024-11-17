package com.ytgld.relics_moonstone.mixin.necora;

import com.moonstone.moonstonemod.Handler;
import com.moonstone.moonstonemod.init.Items;
import com.moonstone.moonstonemod.item.TheNecora.regenerative;
import com.moonstone.moonstonemod.item.ectoplasm.ectoplasmapple;
import com.ytgld.relics_moonstone.event.EctoplasmApple;
import com.ytgld.relics_moonstone.event.Regenerative;
import it.hurts.sskirillss.relics.items.relics.base.IRelicItem;
import it.hurts.sskirillss.relics.items.relics.base.data.RelicData;
import it.hurts.sskirillss.relics.items.relics.base.data.leveling.AbilitiesData;
import it.hurts.sskirillss.relics.items.relics.base.data.leveling.AbilityData;
import it.hurts.sskirillss.relics.items.relics.base.data.leveling.LevelingData;
import it.hurts.sskirillss.relics.items.relics.base.data.leveling.StatData;
import it.hurts.sskirillss.relics.items.relics.base.data.leveling.misc.UpgradeOperation;
import it.hurts.sskirillss.relics.items.relics.base.data.loot.LootData;
import it.hurts.sskirillss.relics.items.relics.base.data.misc.StatIcons;
import it.hurts.sskirillss.relics.utils.MathUtils;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import top.theillusivec4.curios.api.SlotContext;

@Mixin(regenerative.class)
public class RegenerativeMixin implements IRelicItem {

    public RelicData constructDefaultRelicData() {
        return RelicData.builder()
                .abilities(AbilitiesData.builder().ability(AbilityData.builder(Regenerative.doas)
                        .stat(StatData.builder(Regenerative.stat)

                                .icon(StatIcons.COUNT)
                                .initialValue(0.05 ,0.25)
                                .upgradeModifier(UpgradeOperation.MULTIPLY_BASE, 0.2)
                                .formatValue((value) -> MathUtils.round(value, 1)

                                ).build()).build()).build())
                .leveling(new LevelingData(100, 10, 200))
                .loot(LootData.builder().build()).build();
    }
    @Inject(at = @At(value = "RETURN"), method ="curioTick")
    public void curioTick(SlotContext slotContext, ItemStack stack, CallbackInfo ci) {
        if (slotContext.entity() instanceof Player player) {
            if (!player.getCooldowns().isOnCooldown(stack.getItem())) {
                if (stack.getItem() instanceof IRelicItem relicItem) {
                    if (Mth.nextInt(RandomSource.create(),1,4 ) ==1){
                        relicItem.addRelicExperience(player, stack, 1);
                    }
                    float size = (float) relicItem.getStatValue(stack,Regenerative.doas,Regenerative.stat);
                    player.heal(size);
                }
            }
        }
    }
}
