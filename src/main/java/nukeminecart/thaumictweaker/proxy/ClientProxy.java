package nukeminecart.thaumictweaker.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import nukeminecart.thaumictweaker.ModConfig;

public class ClientProxy implements ISidedProxy{
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        ModConfig.checkMods();
    }

    @Override
    public void init(FMLInitializationEvent event) {

    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }
}
