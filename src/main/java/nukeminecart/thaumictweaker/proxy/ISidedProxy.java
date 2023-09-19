package nukeminecart.thaumictweaker.proxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public interface ISidedProxy{

     void preInit(FMLPreInitializationEvent event);

     void init(FMLInitializationEvent event);

     void postInit(FMLPostInitializationEvent event);


    @SubscribeEvent
     static void registerBlocks(RegistryEvent.Register<Block> event) {
    }

    @SubscribeEvent
     static void registerItems(RegistryEvent.Register<Item> event) {
    }

}

