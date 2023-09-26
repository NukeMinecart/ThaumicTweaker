package nukeminecart.thaumictweaker.recipes;

import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.*;
import thecodex6824.thaumicaugmentation.common.recipe.InfusionRecipeComplexResearch;

public class RecipeApi {
    static ResourceLocation defaultGroup = new ResourceLocation("");
    public static void changeShapedArcaneRecipe(ResourceLocation location, int vis, AspectList crystals, Object[] recipe){
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
    public static void changeShapedArcaneRecipe(ResourceLocation location, AspectList crystals, Object[] recipe){
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
    public static void changeShapedArcaneRecipe(ResourceLocation location, Object[] recipe){
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
    public static void changeShapedArcaneRecipe(ResourceLocation location, int vis, Object[] recipe){
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
    public static void changeShapelessArcaneRecipe(ResourceLocation location, int vis,AspectList aspects, Object... recipe){
        ShapelessArcaneRecipe arcaneRecipe;
        IRecipe testRecipe = GameRegistry.findRegistry(IRecipe.class).getValue(location);
        if(testRecipe instanceof IArcaneRecipe) {
            arcaneRecipe = (ShapelessArcaneRecipe) testRecipe;
        }else{
            throw new IllegalArgumentException("Invalid Location");
        }
        ThaumcraftApi.addArcaneCraftingRecipe(location,new ShapelessArcaneRecipe(defaultGroup,
                arcaneRecipe.getResearch(),
                vis,
                aspects,
                arcaneRecipe.delegate.get().getRecipeOutput(), recipe));
    }

    public static void changeInfusionRecipe(ResourceLocation location, AspectList aspects, Object[] recipe){
        InfusionRecipe infusionRecipe;
        IThaumcraftRecipe testRecipe = ThaumcraftApi.getCraftingRecipes().get(location);
        if(testRecipe instanceof InfusionRecipe) {
            infusionRecipe = (InfusionRecipe) testRecipe;
        }else{
            throw new IllegalArgumentException("Invalid Location");
        }
        ThaumcraftApi.addInfusionCraftingRecipe(location, new InfusionRecipe(
                infusionRecipe.getResearch(),
                infusionRecipe.getRecipeOutput(),
                infusionRecipe.instability,
                aspects,
                infusionRecipe.getRecipeInput(),
                recipe));

    }

    public static void changeInfusionRecipe(ResourceLocation location, Object[] recipe){
        InfusionRecipe infusionRecipe;
        IThaumcraftRecipe testRecipe = ThaumcraftApi.getCraftingRecipes().get(location);
        if(testRecipe instanceof InfusionRecipe) {
            infusionRecipe = (InfusionRecipe) testRecipe;
        }else{
            throw new IllegalArgumentException("Invalid Location");
        }
        ThaumcraftApi.addInfusionCraftingRecipe(location, new InfusionRecipe(
                infusionRecipe.getResearch(),
                infusionRecipe.getRecipeOutput(),
                infusionRecipe.instability,
                infusionRecipe.getAspects(),
                infusionRecipe.getRecipeInput(),
                recipe));

    }

    public static void changeComplexInfusionRecipe(ResourceLocation location, AspectList aspects,Object[] recipe){
        InfusionRecipe infusionRecipe;
        IThaumcraftRecipe testRecipe = ThaumcraftApi.getCraftingRecipes().get(location);
        if(testRecipe instanceof InfusionRecipe) {
            infusionRecipe = (InfusionRecipe) testRecipe;
        }else{
            throw new IllegalArgumentException("Invalid Location");
        }
        ThaumcraftApi.addInfusionCraftingRecipe(location, new InfusionRecipeComplexResearch(
                infusionRecipe.getResearch(),
                infusionRecipe.getRecipeOutput(),
                infusionRecipe.instability,
                aspects,
                infusionRecipe.getRecipeInput(),
                recipe));

    }
    public static void changeComplexInfusionRecipe(ResourceLocation location,Object[] recipe){
        InfusionRecipe infusionRecipe;
        IThaumcraftRecipe testRecipe = ThaumcraftApi.getCraftingRecipes().get(location);
        if(testRecipe instanceof InfusionRecipe) {
            infusionRecipe = (InfusionRecipe) testRecipe;
        }else{
            throw new IllegalArgumentException("Invalid Location");
        }
        ThaumcraftApi.addInfusionCraftingRecipe(location, new InfusionRecipeComplexResearch(
                infusionRecipe.getResearch(),
                infusionRecipe.getRecipeOutput(),
                infusionRecipe.instability,
                infusionRecipe.getAspects(),
                infusionRecipe.getRecipeInput(),
                recipe));

    }

    public static void changeAlchemyRecipe(ResourceLocation location, AspectList aspects){
        CrucibleRecipe alchemyRecipe;
        IThaumcraftRecipe testRecipe = ThaumcraftApi.getCraftingRecipes().get(location);
        if(testRecipe instanceof CrucibleRecipe) {
            alchemyRecipe = (CrucibleRecipe) testRecipe;
        }else{
            throw new IllegalArgumentException("Invalid Location");
        }
        ThaumcraftApi.addCrucibleRecipe(location, new CrucibleRecipe(
                alchemyRecipe.getResearch(),
                alchemyRecipe.getRecipeOutput(),
                alchemyRecipe.getCatalyst(),
                aspects));
    }

}
