package nukeminecart.thaumictweaker.recipes.thaumictweaker;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import nukeminecart.thaumictweaker.ItemsTT;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.blocks.BlocksTC;
import thaumcraft.api.crafting.CrucibleRecipe;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.crafting.ShapedArcaneRecipe;
import thaumcraft.api.items.ItemsTC;

public class ThaumicTweakerRecpies {
    static ResourceLocation defaultGroup = new ResourceLocation("");

    public static void initializeRecipes(){
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("minecraft:ghast_tear"),new CrucibleRecipe("HEDGEALCHEMY",new ItemStack(Items.GHAST_TEAR),new ItemStack(ItemsTC.nuggets,1,5), (new AspectList().add(Aspect.FIRE,10).add(Aspect.BEAST,5).add(Aspect.SOUL,10))));
        ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("minecraft:totem_of_undying"),new InfusionRecipe("BASEAUROMANCY",new ItemStack(Items.TOTEM_OF_UNDYING),3,(new AspectList().add(Aspect.LIFE,100).add(Aspect.MAGIC,50).add(Aspect.PROTECT,30)),new ItemStack(Items.NETHER_STAR),new ItemStack(ItemsTC.fabric),"plateBrass",new ItemStack(ItemsTC.fabric),"plateBrass",new ItemStack(ItemsTC.fabric),"plateBrass",new ItemStack(ItemsTC.fabric),"plateBrass"));
        ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation("thaumictweaker:greatwood_stick"),new ShapedArcaneRecipe(defaultGroup,"BASEARTIFICE",1,(new AspectList()).add(Aspect.WATER, 1),new ItemStack(ItemsTT.greatwoodStick,4), "x", "x", 'x',new ItemStack(BlocksTC.plankGreatwood)));
    }

}
