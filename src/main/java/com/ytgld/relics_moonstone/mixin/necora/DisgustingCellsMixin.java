package com.ytgld.relics_moonstone.mixin.necora;

import com.moonstone.moonstonemod.entity.zombie.cell_giant;
import com.moonstone.moonstonemod.init.moonstoneitem.extend.TheNecoraIC;
import com.moonstone.moonstonemod.item.TheNecora.bnabush.disgusting_cells;
import com.ytgld.relics_moonstone.event.DisgustingCells;

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
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import top.theillusivec4.curios.api.SlotContext;

import java.util.List;

@Mixin(disgusting_cells.class)
public class DisgustingCellsMixin extends TheNecoraIC implements IRelicItem {

    public RelicData constructDefaultRelicData() {
        return RelicData.builder()
                .abilities(AbilitiesData.builder().ability(AbilityData.builder(DisgustingCells.doas)
                        .stat(StatData.builder(DisgustingCells.stat)

                                .icon(StatIcons.COUNT)
                                .initialValue(1 ,5)
                                .upgradeModifier(UpgradeOperation.MULTIPLY_BASE, 0.2)
                                .formatValue((value) -> MathUtils.round(value*15, 1)
                                ).build()).build()).build())
                .leveling(new LevelingData(100, 10, 200))
                .loot(LootData.builder().build()).build();
    }

    @Override
    public void curioTick(SlotContext slotContext, ItemStack stack) {
        if (stack.getItem() instanceof IRelicItem relicItem) {
            if (slotContext.entity() instanceof Player player) {
                Vec3 playerPos = player.position().add(0.0, 0.75, 0.0);
                int range = 6;
                List<cell_giant> entities = player.level().getEntitiesOfClass(cell_giant.class, new AABB(playerPos.x - (double) range, playerPos.y - (double) range, playerPos.z - (double) range, playerPos.x + (double) range, playerPos.y + (double) range, playerPos.z + (double) range));
                for (cell_giant cellZombie : entities) {
                    if (cellZombie.getOwner() != null && cellZombie.getOwner().is(player)) {
                        if (player.tickCount % 20 == 1) {
                            cellZombie.level().addParticle(ParticleTypes.HEART,cellZombie.getX(),cellZombie.getY()+2,cellZombie.getZ(),0,0,0);
                            cellZombie.time -= (int) relicItem.getStatValue(stack,DisgustingCells.doas,DisgustingCells.stat) * 15;
                            relicItem.addRelicExperience(player,stack,1);
                        }
                    }
                }
            }
        }
    }
}
