package com.nukeminecart.thaumictweaker;

import com.nukeminecart.thaumictweaker.items.ConfigItems;
import com.nukeminecart.thaumictweaker.recipes.*;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public final class Registrar {
        public Registrar() {
        }
        @SubscribeEvent(priority = EventPriority.LOW)
        public static void registerItems(RegistryEvent.Register<Item> event) {

            ConfigItems.registerItems(event);
        }

        public static void registerVanillaRecipes() {
            NormalRecipes.initializeNormalRecipes();
            ArcaneRecipies.initializeArcaneRecipes();
            InfusionRecipes.initializeInfusionRecipes();
            AlchemyRecipes.initializeAlchemyRecipes();
            ThaumicAdditionsRecipes.init();

        }

}
