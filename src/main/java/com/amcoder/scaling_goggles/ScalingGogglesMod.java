package com.amcoder.scaling_goggles;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = ScalingGogglesMod.MODID, version = ScalingGogglesMod.VERSION)
public class ScalingGogglesMod
{
    public static final String MODID = "scaling-goggles";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("Initializing Scaling Goggles");
    }
}
