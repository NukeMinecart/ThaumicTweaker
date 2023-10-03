package nukeminecart.thaumictweaker.recipes.voidarmor;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import nukeminecart.thaumictweaker.ModConfig;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.items.ItemsTC;
import thecodex6824.thaumicaugmentation.api.TAItems;

import java.util.List;

public class VoidRobeChest extends InfusionRecipe {
    public VoidRobeChest() {
        super("VOIDROBEARMOR", new ItemStack(ItemsTC.voidRobeChest), 6,
                new AspectList().add(Aspect.METAL, 70)
                        .add(Aspect.PROTECT, 70)
                        .add(Aspect.ENERGY, 50)
                        .add(Aspect.ELDRITCH, 75)
                        .add(Aspect.VOID, 70)
                , new ItemStack(ItemsTC.fortressChest),
                new ItemStack(ItemsTC.voidChest),
                ModConfig.ISTHAUMICAUGMENT ? new ItemStack(TAItems.THAUMIUM_ROBES_CHESTPLATE):new ItemStack(ItemsTC.clothChest),
                "plateVoid", "plateVoid", "plateVoid", "plateVoid",
                new ItemStack(ItemsTC.salisMundus),
                new ItemStack(ItemsTC.fabric));
    }
    public Object getRecipeOutput(EntityPlayer player, ItemStack input, List<ItemStack> comps) {
        if (input == null) {
            return null;
        } else {
            ItemStack out = new ItemStack(ItemsTC.voidRobeChest,1);
            out.setTagCompound(input.getTagCompound());
            return out;
        }
    }
}
