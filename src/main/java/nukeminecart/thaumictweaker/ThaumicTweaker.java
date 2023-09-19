package nukeminecart.thaumictweaker;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import nukeminecart.thaumictweaker.proxy.ISidedProxy;
import org.apache.logging.log4j.Logger;

@Mod(modid = ThaumicTweaker.MODID, useMetadata = true, dependencies = "after:thaumcraft;after:thaumicaugmentation;after:thaumadditions;")
public class ThaumicTweaker
{

    @SidedProxy(serverSide = "nukeminecart.thaumictweaker.proxy.ServerProxy",clientSide = "nukeminecart.thaumictweaker.proxy.ClientProxy")
    public static ISidedProxy proxy;
    public static final String MODID = "thaumictweaker";

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
        Registrar.registerVanillaRecipes();
    }
}
