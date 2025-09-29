package com.github.redScorpes.pocketdimension;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import static net.minecraft.item.Items.register;

public class Pocketdimension implements ModInitializer {

    @Override
    public void onInitialize() {
        ModItems.initialize();
        ModBlocks.initialize();
    }
}
