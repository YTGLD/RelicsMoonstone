package com.ytgld.moonstone_dna.dna;

import com.ytgld.moonstone_dna.MoonStoneDNAMod;
import com.ytgld.moonstone_dna.dna.plague.ALL.*;
import com.ytgld.moonstone_dna.dna.plague.BloodVirus.Skill.batskill;
import com.ytgld.moonstone_dna.dna.plague.BloodVirus.*;
import com.ytgld.moonstone_dna.dna.plague.BloodVirus.dna.*;
import com.ytgld.moonstone_dna.dna.plague.BloodVirus.ex.botton;
import com.ytgld.moonstone_dna.dna.plague.BloodVirus.ex.catalyzer;
import com.ytgld.moonstone_dna.dna.plague.TheNecora.*;
import com.ytgld.moonstone_dna.dna.plague.TheNecora.bnabush.*;
import com.ytgld.moonstone_dna.dna.plague.TheNecora.bnabush.me.air;
import com.ytgld.moonstone_dna.dna.plague.TheNecora.bnabush.me.motor;
import com.ytgld.moonstone_dna.dna.plague.TheNecora.bnabush.me.watergen;
import com.ytgld.moonstone_dna.dna.plague.apple;
import com.ytgld.moonstone_dna.dna.plague.bloodvirus;
import com.ytgld.moonstone_dna.dna.plague.decorated.deceased_contract;
import com.ytgld.moonstone_dna.dna.plague.medicine.med.*;
import com.ytgld.moonstone_dna.dna.plague.medicinebox;
import com.ytgld.moonstone_dna.dna.plague.necora;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Items {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, MoonStoneDNAMod.MODID);
    public static final DeferredHolder<Item,?>  dna =REGISTRY.register("dna",dna::new);
    public static final DeferredHolder<Item,?>  deceased_contract =REGISTRY.register("dna", deceased_contract::new);
    public static final DeferredHolder<Item,?>  fungus =REGISTRY.register("fungus",fungus::new);
    public static final DeferredHolder<Item,?>  germ =REGISTRY.register("germ",germ::new);
    public static final DeferredHolder<Item,?>  parasite =REGISTRY.register("parasite",parasite::new);
    public static final DeferredHolder<Item,?>  virus =REGISTRY.register("virus",virus::new);
    public static final DeferredHolder<Item,?>  botton =REGISTRY.register("botton",botton::new);
    public static final DeferredHolder<Item,?>  catalyzer =REGISTRY.register("catalyzer",catalyzer::new);

    public static final DeferredHolder<Item,?>  calcification =REGISTRY.register("calcification",calcification::new);
    public static final DeferredHolder<Item,?>  masticatory =REGISTRY.register("masticatory",masticatory::new);
    public static final DeferredHolder<Item,?>  polyphagia =REGISTRY.register("polyphagia",polyphagia::new);
    public static final DeferredHolder<Item,?>  quadriceps =REGISTRY.register("quadriceps",quadriceps::new);
    public static final DeferredHolder<Item,?>  reanimation =REGISTRY.register("reanimation",reanimation::new);
    public static final DeferredHolder<Item,?>  batskill =REGISTRY.register("batskill",batskill::new);




    public static final DeferredHolder<Item,?> batgene =REGISTRY.register("batgene",batgene::new);
    public static final DeferredHolder<Item,?> bloodgene =REGISTRY.register("bloodgene",bloodgene::new);
    public static final DeferredHolder<Item,?> flygene =REGISTRY.register("flygene",flygene::new);
    public static final DeferredHolder<Item,?> heathgene =REGISTRY.register("heathgene",heathgene::new);
    public static final DeferredHolder<Item,?> ragegene =REGISTRY.register("ragegene",ragegene::new);
    public static final DeferredHolder<Item,?> sleepgene =REGISTRY.register("sleepgene",sleepgene::new);
    public static final DeferredHolder<Item,?> medicinebox =REGISTRY.register("medicinebox",medicinebox::new);
    public static final DeferredHolder<Item,?> apple =REGISTRY.register("apple",apple::new);




    public static final DeferredHolder<Item,?> ambush =REGISTRY.register("ambush", ambush::new);
    public static final DeferredHolder<Item,?> atpoverdose =REGISTRY.register("atpoverdose", atpoverdose::new);
    public static final DeferredHolder<Item,?> autolytic =REGISTRY.register("autolytic", autolytic::new);
    public static final DeferredHolder<Item,?> fermentation =REGISTRY.register("fermentation", fermentation::new);
    public static final DeferredHolder<Item,?> putrefactive =REGISTRY.register("putrefactive", putrefactive::new);
    public static final DeferredHolder<Item,?> regenerative =REGISTRY.register("regenerative", regenerative::new);


    public static final DeferredHolder<Item,?> bloodvirus =REGISTRY.register("bloodvirus",bloodvirus::new);
    public static final DeferredHolder<Item,?> necora =REGISTRY.register("necora",necora::new);


    public static final DeferredHolder<Item,?> cell =REGISTRY.register("cell", cell::new);
    public static final DeferredHolder<Item,?> adrenaline =REGISTRY.register("adrenaline", adrenaline::new);
    public static final DeferredHolder<Item,?> cell_mummy =REGISTRY.register("cell_mummy", cell_mummy::new);
    public static final DeferredHolder<Item,?> cell_boom =REGISTRY.register("cell_boom", cell_boom::new);
    public static final DeferredHolder<Item,?> cell_calcification =REGISTRY.register("cell_calcification", cell_calcification::new);
    public static final DeferredHolder<Item,?> cell_blood =REGISTRY.register("cell_blood", cell_blood::new);
    public static final DeferredHolder<Item,?> motor =REGISTRY.register("motor", motor::new);
    public static final DeferredHolder<Item,?> watergen =REGISTRY.register("watergen", watergen::new);
    public static final DeferredHolder<Item,?> air =REGISTRY.register("air", air::new);
    public static final DeferredHolder<Item,?> giant =REGISTRY.register("giant", giant::new);
    public static final DeferredHolder<Item,?> giant_nightmare =REGISTRY.register("giant_nightmare", giant_nightmare::new);


    public static final DeferredHolder<Item,?> bat_cell =REGISTRY.register("bat_cell", bat_cell::new);
    public static final DeferredHolder<Item,?> cell_doctor =REGISTRY.register("cell_doctor", cell_doctor::new);
    public static final DeferredHolder<Item,?> cell_desecrate =REGISTRY.register("cell_desecrate", cell_desecrate::new);
    public static final DeferredHolder<Item,?> cell_harvest =REGISTRY.register("cell_harvest", cell_harvest::new);

    public static final DeferredHolder<Item,?> cell_scientist =REGISTRY.register("cell_scientist", cell_scientist::new);
    public static final DeferredHolder<Item,?> cell_immortal =REGISTRY.register("cell_immortal", cell_immortal::new);
    public static final DeferredHolder<Item,?> cell_rage =REGISTRY.register("cell_rage", cell_rage::new);
    public static final DeferredHolder<Item,?> cell_blood_attack =REGISTRY.register("cell_blood_attack", cell_blood_attack::new);
    public static final DeferredHolder<Item,?> cell_fear =REGISTRY.register("cell_fear", cell_fear::new);
    public static final DeferredHolder<Item,?> cell_not_do =REGISTRY.register("cell_not_do", cell_not_do::new);

    public static final DeferredHolder<Item,?> anaerobic_cell =REGISTRY.register("anaerobic_cell", anaerobic_cell::new);
    public static final DeferredHolder<Item,?> giant_boom_cell =REGISTRY.register("giant_boom_cell", giant_boom_cell::new);
    public static final DeferredHolder<Item,?> subspace_cell =REGISTRY.register("subspace_cell", subspace_cell::new);
    public static final DeferredHolder<Item,?> bone_cell =REGISTRY.register("bone_cell", bone_cell::new);
    public static final DeferredHolder<Item,?> parasitic_cell =REGISTRY.register("parasitic_cell", parasitic_cell::new);
    public static final DeferredHolder<Item,?> mother_cell =REGISTRY.register("mother_cell", mother_cell::new);
    public static final DeferredHolder<Item,?> disgusting_cells =REGISTRY.register("disgusting_cells", disgusting_cells::new);

}
