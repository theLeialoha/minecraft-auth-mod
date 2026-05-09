package com.example.example_mod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class FabricExampleMod extends ExampleMod implements ModInitializer, ClientModInitializer {

    @Override
    public void onInitialize() {
        init();
    }

    @Override
    public void onInitializeClient() {
        initClient();
    }

    @Override
    public Path getConfigFolder() {
        return FabricLoader.getInstance().getConfigDir();
    }

}
