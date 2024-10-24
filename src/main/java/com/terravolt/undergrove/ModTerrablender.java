package com.terravolt.undergrove;

import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;

public class ModTerrablender {
    public static void registerBiomes() {
        Regions.register(new TestRegion1(ResourceLocation.fromNamespaceAndPath(Undergrove.MOD_ID, "overworld"), 25));
    }
}
