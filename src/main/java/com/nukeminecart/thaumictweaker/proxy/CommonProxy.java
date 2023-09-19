package com.nukeminecart.thaumictweaker.proxy;

import com.nukeminecart.thaumictweaker.Config;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.world.World;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;
import thaumcraft.proxies.IProxy;

import javax.annotation.Nullable;
import java.io.File;

@Mod.EventBusSubscriber
public class CommonProxy implements IGuiHandler, IProxy {

    // Config instance
    public static Configuration config;

    public void preInit(FMLPreInitializationEvent event) {
        File directory = event.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "thaumictweaks.cfg"));
        Config.readConfig();

    }
    public void init(FMLInitializationEvent event) {

    }
    public void postInit(FMLPostInitializationEvent event) {
        if (config.hasChanged()) {
            config.save();
        }
    }

    @Override
    public World getClientWorld() {
        return null;
    }

    @Override
    public boolean getSingleplayer() {
        return false;
    }

    @Override
    public World getWorld(int i) {
        return null;
    }

    @Override
    public boolean isShiftKeyDown() {
        return false;
    }

    @Override
    public void registerModel(ItemBlock itemBlock) {

    }

    @Override
    public void checkInterModComs(FMLInterModComms.IMCEvent imcEvent) {

    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
    }

    @Nullable
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }

    @Nullable
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }
}

