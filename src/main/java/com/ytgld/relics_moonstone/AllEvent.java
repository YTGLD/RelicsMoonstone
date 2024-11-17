package com.ytgld.relics_moonstone;

import com.ytgld.relics_moonstone.event.*;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;

public class AllEvent {
    @SubscribeEvent
    public  void LivingIncomingDamageEvent(LivingIncomingDamageEvent event) {
        MaxBloodSword.LivingIncomingDamageEvent(event);
        EctoplasmApple.LivingIncomingDamageEvent(event);
        NightmareCharm.LivingIncomingDamageEvent(event);
    }
    @SubscribeEvent
    public  void LivingIncomingDamageEvent(LivingDeathEvent event){
        Adrenaline.LivingDeathEvent(event);
        BoneCell.LivingDeathEvent(event);
    }
}
