package com.ytgld.relics_moonstone.mixin.necora;


import com.moonstone.moonstonemod.init.moonstoneitem.extend.TheNecoraIC;
import com.moonstone.moonstonemod.item.TheNecora.bnabush.adrenaline;
import com.ytgld.relics_moonstone.event.Adrenaline;
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
import org.spongepowered.asm.mixin.Mixin;

@Mixin(adrenaline.class)
public class AdrenalineMixin extends TheNecoraIC implements IRelicItem {

    public RelicData constructDefaultRelicData() {
        return RelicData.builder()
                .abilities(AbilitiesData.builder().ability(AbilityData.builder(Adrenaline.doas)
                        .stat(StatData.builder(Adrenaline.stat)
                                .icon(StatIcons.COUNT)
                                .initialValue(1 ,5)
                                .upgradeModifier(UpgradeOperation.MULTIPLY_BASE, 0.2)
                                .formatValue((value) -> MathUtils.round(value*10, 1)
                                ).build()).build()).build())
                .leveling(new LevelingData(100, 10, 200))
                .loot(LootData.builder().build()).build();
    }
}