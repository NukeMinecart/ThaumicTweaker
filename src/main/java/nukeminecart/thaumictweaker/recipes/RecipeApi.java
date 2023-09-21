package nukeminecart.thaumictweaker.recipes;

import net.minecraft.util.ResourceLocation;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.IArcaneRecipe;
import thaumcraft.api.crafting.IThaumcraftRecipe;
import thaumcraft.api.crafting.ShapedArcaneRecipe;

import javax.annotation.Nullable;
import java.util.HashMap;

public class RecipeApi {
    static ResourceLocation defaultGroup = new ResourceLocation("");

    void addInfusionRecipe(String s){

    }
    public static void addShapedArcaneRecipe(ResourceLocation location, int vis, AspectList crystals, Object... recipe){
        HashMap<ResourceLocation, IThaumcraftRecipe> craftingRecipes;
        ShapedArcaneRecipe arcaneRecipe;
        craftingRecipes = ThaumcraftApi.getCraftingRecipes();
        try{
            arcaneRecipe = (ShapedArcaneRecipe) craftingRecipes.get(location);
        }catch (Exception e){
            throw new IllegalArgumentException("Invalid recipe location");
        }
        ThaumcraftApi.addArcaneCraftingRecipe(location,new ShapedArcaneRecipe(defaultGroup,
                arcaneRecipe.getResearch(),
                //fix crash with this
                (vis==-1) ? arcaneRecipe.getVis() : vis,
                (crystals.getAspects().length==0) ? arcaneRecipe.getCrystals() : crystals,
                arcaneRecipe.delegate.get().getRecipeOutput(), recipe));

    }
}
