package nukeminecart.thaumictweaker;

import net.minecraftforge.fml.common.Loader;

public class ModConfig {

    public static boolean ISTHAUMICADDITIONS = false;
    public static boolean ISTHAUMICAUGMENT = false;


    public static void checkMods(){
        ISTHAUMICADDITIONS = Loader.isModLoaded("thaumadditions");
        ISTHAUMICAUGMENT = Loader.isModLoaded("thaumicaugmentation");

    }
}
