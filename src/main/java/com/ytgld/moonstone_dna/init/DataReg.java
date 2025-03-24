package com.ytgld.moonstone_dna.init;

import com.moonstone.moonstonemod.MoonStoneMod;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.component.BundleContents;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DataReg {
    public static final DeferredRegister<DataComponentType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.DATA_COMPONENT_TYPE, MoonStoneMod.MODID);

    public static final DeferredHolder<DataComponentType<?>, DataComponentType<CompoundTag>> tag =
            REGISTRY.register("tag",()-> DataComponentType.<CompoundTag>builder().persistent(CompoundTag.CODEC).build());
    public static final DeferredHolder<DataComponentType<?>, DataComponentType<BundleContents>> BUNDLE_CONTENTS =
            REGISTRY.register("bundle",()-> DataComponentType.<BundleContents>builder().persistent(BundleContents.CODEC).build());




}


