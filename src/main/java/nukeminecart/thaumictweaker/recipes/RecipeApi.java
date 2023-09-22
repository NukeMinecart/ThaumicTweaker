package nukeminecart.thaumictweaker.recipes;

import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.IArcaneRecipe;
import thaumcraft.api.crafting.ShapedArcaneRecipe;

public class RecipeApi {
    static ResourceLocation defaultGroup = new ResourceLocation("");
    public static void addShapedArcaneRecipe(ResourceLocation location, int vis, AspectList crystals, Object... recipe){
        ShapedArcaneRecipe arcaneRecipe;
        IRecipe testRecipe = GameRegistry.findRegistry(IRecipe.class).getValue(location);
            if(testRecipe instanceof IArcaneRecipe) {
                arcaneRecipe = (ShapedArcaneRecipe) testRecipe;
            }else{
                throw new IllegalArgumentException("Invalid Location");
            }
        ThaumcraftApi.addArcaneCraftingRecipe(location,new ShapedArcaneRecipe(defaultGroup,
                arcaneRecipe.getResearch(),
                vis,
                crystals,
                arcaneRecipe.delegate.get().getRecipeOutput(), recipe));
    }
    public static void addShapedArcaneRecipe(ResourceLocation location, AspectList crystals, Object... recipe){
        ShapedArcaneRecipe arcaneRecipe;
        IRecipe testRecipe = GameRegistry.findRegistry(IRecipe.class).getValue(location);
        if(testRecipe instanceof IArcaneRecipe) {
            arcaneRecipe = (ShapedArcaneRecipe) testRecipe;
        }else{
            throw new IllegalArgumentException("Invalid Location");
        }
        ThaumcraftApi.addArcaneCraftingRecipe(location,new ShapedArcaneRecipe(defaultGroup,
                arcaneRecipe.getResearch(),
                arcaneRecipe.getVis(),
                crystals,
                arcaneRecipe.delegate.get().getRecipeOutput(), recipe));
    }
    public static void addShapedArcaneRecipe(ResourceLocation location, Object... recipe){
        ShapedArcaneRecipe arcaneRecipe;
        IRecipe testRecipe = GameRegistry.findRegistry(IRecipe.class).getValue(location);
        if(testRecipe instanceof IArcaneRecipe) {
            arcaneRecipe = (ShapedArcaneRecipe) testRecipe;
        }else{
            throw new IllegalArgumentException("Invalid Location");
        }
        ThaumcraftApi.addArcaneCraftingRecipe(location,new ShapedArcaneRecipe(defaultGroup,
                arcaneRecipe.getResearch(),
                arcaneRecipe.getVis(),
                arcaneRecipe.getCrystals(),
                arcaneRecipe.delegate.get().getRecipeOutput(), recipe));
    }
    public static void addShapedArcaneRecipe(ResourceLocation location, int vis, Object... recipe){
        ShapedArcaneRecipe arcaneRecipe;
        IRecipe testRecipe = GameRegistry.findRegistry(IRecipe.class).getValue(location);
        if(testRecipe instanceof IArcaneRecipe) {
            arcaneRecipe = (ShapedArcaneRecipe) testRecipe;
        }else{
            throw new IllegalArgumentException("Invalid Location");
        }
        ThaumcraftApi.addArcaneCraftingRecipe(location,new ShapedArcaneRecipe(defaultGroup,
                arcaneRecipe.getResearch(),
                vis,
                arcaneRecipe.getCrystals(),
                arcaneRecipe.delegate.get().getRecipeOutput(), recipe));
    }
}
