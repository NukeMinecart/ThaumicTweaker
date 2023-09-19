package nukeminecart.thaumictweaker.items;

import nukeminecart.thaumictweaker.ItemsTT;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;



public class ConfigItems {

    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(ItemsTT.greatwoodStick = new ItemTTBase("greatwood_stick"));

    }


}
