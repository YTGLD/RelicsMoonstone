package com.ytgld.moonstone_dna.init;


import com.ytgld.moonstone_dna.MoonStoneDNAMod;
import com.ytgld.moonstone_dna.dna.DNAItems;
import com.ytgld.moonstone_dna.dna.Items;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


public class Tab {

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoonStoneDNAMod.MODID);
    public static final DeferredHolder<CreativeModeTab,?> DNA = TABS.register("moonstone_item_dna",()->CreativeModeTab.builder()
            .icon(()->new ItemStack(Items.necora.get()))
            .title(Component.translatable("itemGroup.tabmoonstone.dna"))
            .displayItems((a,b)->{
                b.accept(new ItemStack(com.moonstone.moonstonemod.init.items.Items.dna_box.get()));


                b.accept(new ItemStack(Items.deceased_contract.get()));

                b.accept(new ItemStack(DNAItems.cell_compress.get()));
                b.accept(new ItemStack(DNAItems.cell_preferential.get()));
                b.accept(new ItemStack(DNAItems.cell_flu.get()));
                b.accept(new ItemStack(DNAItems.cell_constant.get()));
                b.accept(new ItemStack(DNAItems.cell_chromosome.get()));

                b.accept(new ItemStack(DNAItems.cell_necrosis.get()));
                b.accept(new ItemStack(DNAItems.cell_digestion.get()));
                b.accept(new ItemStack(DNAItems.cell_acid.get()));
                b.accept(new ItemStack(DNAItems.cell_eyes.get()));
                b.accept(new ItemStack(DNAItems.cell_bone_add.get()));
                b.accept(new ItemStack(DNAItems.cell_sense.get()));
                b.accept(new ItemStack(DNAItems.cell_cranial.get()));
                b.accept(new ItemStack(DNAItems.cell_dna_suppression.get()));
                b.accept(new ItemStack(DNAItems.cell_putrefactive.get()));
                b.accept(new ItemStack(DNAItems.cell_synthesis.get()));


                b.accept(new ItemStack(DNAItems.atp_height.get()));
                b.accept(new ItemStack(DNAItems.cell_god.get()));
                b.accept(new ItemStack(DNAItems.cell_ground.get()));
                b.accept(new ItemStack(DNAItems.cell_inheritance.get()));
                b.accept(new ItemStack(DNAItems.cell_oxygen.get()));
                b.accept(new ItemStack(DNAItems.cell_big_boom.get()));
                b.accept(new ItemStack(DNAItems.cell_break_down_water.get()));
                b.accept(new ItemStack(DNAItems.cell_darwin.get()));
                b.accept(new ItemStack(DNAItems.cell_disorder.get()));
                b.accept(new ItemStack(DNAItems.cell_in_air.get()));
                b.accept(new ItemStack(DNAItems.cell_in_water.get()));
                b.accept(new ItemStack(DNAItems.cell_off_on.get()));
                b.accept(new ItemStack(DNAItems.speed_metabolism.get()));









                b.accept(new ItemStack(Items.dna.get()));
                b.accept(new ItemStack(Items.fungus.get()));
                b.accept(new ItemStack(Items.germ.get()));
                b.accept(new ItemStack(Items.parasite.get()));
                b.accept(new ItemStack(Items.virus.get()));
                b.accept(new ItemStack(Items.cell.get()));
                b.accept(new ItemStack(Items.adrenaline.get()));
                b.accept(new ItemStack(Items.cell_mummy.get()));
                b.accept(new ItemStack(Items.cell_boom.get()));
                b.accept(new ItemStack(Items.cell_calcification.get()));
                b.accept(new ItemStack(Items.cell_blood.get()));
                b.accept(new ItemStack(Items.air.get()));
                b.accept(new ItemStack(Items.motor.get()));
                b.accept(new ItemStack(Items.watergen.get()));
                b.accept(new ItemStack(Items.giant.get()));
                b.accept(new ItemStack(Items.giant_nightmare.get()));

                b.accept(new ItemStack(Items.giant_boom_cell.get()));
                b.accept(new ItemStack(Items.anaerobic_cell.get()));
                b.accept(new ItemStack(Items.disgusting_cells.get()));
                b.accept(new ItemStack(Items.bone_cell.get()));
                b.accept(new ItemStack(Items.mother_cell.get()));
                b.accept(new ItemStack(Items.parasitic_cell.get()));
                b.accept(new ItemStack(Items.subspace_cell.get()));

                b.accept(new ItemStack(Items.botton.get()));
                b.accept(new ItemStack(Items.catalyzer.get()));


                b.accept(new ItemStack(Items.batskill.get()));


                b.accept(new ItemStack(Items.batgene.get()));
                b.accept(new ItemStack(Items.bloodgene.get()));
                b.accept(new ItemStack(Items.flygene.get()));
                b.accept(new ItemStack(Items.heathgene.get()));
                b.accept(new ItemStack(Items.ragegene.get()));
                b.accept(new ItemStack(Items.sleepgene.get()));


                b.accept(new ItemStack(Items.apple.get()));
                b.accept(new ItemStack(Items.medicinebox.get()));


                b.accept(new ItemStack(Items.calcification.get()));
                b.accept(new ItemStack(Items.masticatory.get()));
                b.accept(new ItemStack(Items.polyphagia.get()));
                b.accept(new ItemStack(Items.quadriceps.get()));
                b.accept(new ItemStack(Items.reanimation.get()));


                b.accept(new ItemStack(Items.ambush.get()));
                b.accept(new ItemStack(Items.atpoverdose.get()));
                b.accept(new ItemStack(Items.autolytic.get()));
                b.accept(new ItemStack(Items.fermentation.get()));
                b.accept(new ItemStack(Items.putrefactive.get()));
                b.accept(new ItemStack(Items.regenerative.get()));
                b.accept(new ItemStack(Items.bat_cell.get()));
                b.accept(new ItemStack(Items.cell_blood_attack.get()));
                b.accept(new ItemStack(Items.cell_desecrate.get()));
                b.accept(new ItemStack(Items.cell_doctor.get()));
                b.accept(new ItemStack(Items.cell_fear.get()));
                b.accept(new ItemStack(Items.cell_harvest.get()));
                b.accept(new ItemStack(Items.cell_immortal.get()));
                b.accept(new ItemStack(Items.cell_not_do.get()));
                b.accept(new ItemStack(Items.cell_rage.get()));
                b.accept(new ItemStack(Items.cell_scientist.get()));


                b.accept(new ItemStack(Items.bloodvirus.get()));
                b.accept(new ItemStack(Items.necora.get()));

            })
            .build()
    );

}


