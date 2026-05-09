package com.example.example_mod.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.world.ClientWorld;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.example.example_mod.ExampleMod;

import javax.annotation.Nullable;

@Mixin(MinecraftClient.class)
public class MinecraftMixin {

    @Shadow
    @Nullable
    public ClientWorld world;

    @Inject(method = "disconnect(Lnet/minecraft/client/gui/screen/Screen;Z)V", at = @At("HEAD"))
    private void disconnect(Screen screen, boolean bl, CallbackInfo ci) {
        if (world != null) {
            ExampleMod.LOGGER.info("Goodbye world!");
        }
    }

}
