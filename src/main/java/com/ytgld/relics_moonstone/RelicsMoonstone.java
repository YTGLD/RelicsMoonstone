package com.ytgld.relics_moonstone;

import com.moonstone.moonstonemod.event.NewEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;

@Mod(RelicsMoonstone.MODID)
public class RelicsMoonstone
{
    public static final String MODID = "relics_moonstone";

    public RelicsMoonstone(IEventBus modEventBus, ModContainer modContainer) {
        NeoForge.EVENT_BUS.register(new AllEvent());

    }

}
