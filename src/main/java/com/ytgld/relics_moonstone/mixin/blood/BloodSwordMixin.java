package com.ytgld.relics_moonstone.mixin.blood;

import com.moonstone.moonstonemod.item.blood.max_sword;
import com.ytgld.relics_moonstone.event.MaxBloodSword;
import it.hurts.sskirillss.relics.items.relics.base.IRelicItem;
import it.hurts.sskirillss.relics.items.relics.base.data.RelicData;
import it.hurts.sskirillss.relics.items.relics.base.data.leveling.AbilitiesData;
import it.hurts.sskirillss.relics.items.relics.base.data.leveling.AbilityData;
import it.hurts.sskirillss.relics.items.relics.base.data.leveling.LevelingData;
import it.hurts.sskirillss.relics.items.relics.base.data.leveling.StatData;
import it.hurts.sskirillss.relics.items.relics.base.data.leveling.misc.UpgradeOperation;
import it.hurts.sskirillss.relics.items.relics.base.data.loot.LootData;
import it.hurts.sskirillss.relics.items.relics.base.data.loot.misc.LootCollections;
import it.hurts.sskirillss.relics.items.relics.base.data.misc.StatIcons;
import it.hurts.sskirillss.relics.utils.MathUtils;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(max_sword.class)
public class BloodSwordMixin implements IRelicItem {

    public RelicData constructDefaultRelicData() {
        return RelicData.builder()
                .abilities(AbilitiesData.builder().ability(AbilityData.builder(MaxBloodSword.blood)
                .stat(StatData.builder(MaxBloodSword.bloodStat)
                        .icon(StatIcons.COUNT)
                        .initialValue(0.05 ,0.25)
                        .upgradeModifier(UpgradeOperation.MULTIPLY_BASE, 0.2)
                        .formatValue((value) -> MathUtils.round(value/5, 1)

        ).build()).build()).build())
                .leveling(new LevelingData(100, 10, 200))
                .loot(LootData.builder().build()).build();
    }
}
