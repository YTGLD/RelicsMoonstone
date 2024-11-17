package com.ytgld.relics_moonstone.mixin.nightmare;

import com.moonstone.moonstonemod.item.TheNecora.regenerative;
import com.moonstone.moonstonemod.item.nightmare.nightmarecharm;
import com.ytgld.relics_moonstone.event.NightmareCharm;
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
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(nightmarecharm.class)
public class NightmareCharmMixin implements IRelicItem {
    @Override
    public RelicData constructDefaultRelicData() {
        return RelicData.builder()
                .abilities(AbilitiesData.builder().ability(AbilityData.builder(NightmareCharm.doas)
                        .stat(StatData.builder(NightmareCharm.stat)

                                .icon(StatIcons.COUNT)
                                .initialValue(0.05 ,0.25)
                                .upgradeModifier(UpgradeOperation.MULTIPLY_BASE, 0.2)
                                .formatValue((value) -> MathUtils.round(value/10, 3)

                                ).build()).build()).build())
                .leveling(new LevelingData(100, 10, 200))
                .loot(LootData.builder().build()).build();
    }

}
