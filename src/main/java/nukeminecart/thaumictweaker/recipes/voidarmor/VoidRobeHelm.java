package nukeminecart.thaumictweaker.recipes.voidarmor;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.items.ItemsTC;
import thecodex6824.thaumicaugmentation.api.TAItems;

import java.util.List;

public class VoidRobeHelm extends InfusionRecipe {
    public VoidRobeHelm() {
        super("VOIDROBEARMOR", new ItemStack(ItemsTC.voidRobeHelm), 6,
                new AspectList().add(Aspect.METAL, 50)
                        .add(Aspect.SENSES, 50).add(Aspect.PROTECT, 50)
                        .add(Aspect.ENERGY, 50).add(Aspect.ELDRITCH, 75)
                        .add(Aspect.VOID, 50)
                    , new ItemStack(ItemsTC.fortressHelm),
                new ItemStack(ItemsTC.voidHelm),
                new ItemStack(TAItems.THAUMIUM_ROBES_HOOD),
                "plateVoid", "plateVoid",
                new ItemStack(ItemsTC.fabric),
                new ItemStack(ItemsTC.fabric),
                new ItemStack(ItemsTC.salisMundus));
    }
    public Object getRecipeOutput(EntityPlayer player, ItemStack input, List<ItemStack> comps) {
        if (input == null) {
            return null;
        } else {
            ItemStack out = new ItemStack(ItemsTC.voidRobeHelm,1);
            out.setTagCompound(input.getTagCompound());
            return out;
        }
    }
}
