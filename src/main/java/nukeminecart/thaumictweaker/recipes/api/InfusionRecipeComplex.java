package nukeminecart.thaumictweaker.recipes.api;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.world.World;
import net.minecraftforge.common.util.RecipeMatcher;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.capabilities.ThaumcraftCapabilities;
import thaumcraft.api.crafting.InfusionRecipe;

public class InfusionRecipeComplex extends InfusionRecipe {
    //Code taken from Thaumic Augmentation so that it doesn't crash
    public InfusionRecipeComplex(String research, Object outputResult, int inst, AspectList aspects, Object centralItem, Object... recipe) {
        super(research, outputResult, inst, aspects, centralItem, recipe);
    }

    @Override
    @SuppressWarnings("null")
    public boolean matches(List<ItemStack> input, ItemStack central, World world, EntityPlayer player) {
        if (getRecipeInput() == null || !ThaumcraftCapabilities.knowsResearchStrict(player, research))
            return false;

        return (getRecipeInput() == Ingredient.EMPTY || getRecipeInput().apply(central)) &&
                RecipeMatcher.findMatches(input, getComponents()) != null;
    }

}
