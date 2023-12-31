package nukeminecart.thaumictweaker.recipes.voidarmor;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import nukeminecart.thaumictweaker.ModConfig;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.items.ItemsTC;

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
                ModConfig.ISTHAUMICAUGMENT ? new ItemStack(thecodex6824.thaumicaugmentation.api.TAItems.THAUMIUM_ROBES_HOOD):new ItemStack(ItemsTC.goggles, 1, 32767),
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
