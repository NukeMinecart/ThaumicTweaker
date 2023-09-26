package nukeminecart.thaumictweaker.recipes;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.zeith.thaumicadditions.InfoTAR;
import org.zeith.thaumicadditions.items.seed.ItemVisSeeds;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.CrucibleRecipe;
import thaumcraft.api.items.ItemsTC;
import thaumcraft.common.config.ModConfig;
import thecodex6824.thaumicaugmentation.api.ThaumicAugmentationAPI;

import java.util.ArrayList;
import java.util.List;

public class AlchemyRecipes {
    public static final ResourceLocation visSeedsRecipeIDFake = new ResourceLocation(InfoTAR.MOD_ID, "vis_seeds_recipes_all");
    public static final List<ResourceLocation> visSeedsRecipes = new ArrayList<>();
    public static void initializeAlchemyRecipes() {
        //Thuamcraft
        RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:alumentum"), new AspectList().merge(Aspect.ENERGY, 20).merge(Aspect.FIRE, 15).merge(Aspect.ENTROPY, 5));
        RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:brassingot"), new AspectList().merge(Aspect.TOOL, 5).merge(Aspect.EARTH, 5));
        RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:voidingot"),new AspectList().merge(Aspect.METAL, 10).merge(Aspect.FLUX, 5).merge(Aspect.ENTROPY,5));
        RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:hedge_tallow"), new AspectList().merge(Aspect.FIRE, 4));
        RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:hedge_leather"), new AspectList().merge(Aspect.AIR, 5).merge(Aspect.BEAST, 5));
        RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:focus_1"), new AspectList().merge(Aspect.CRYSTAL, 15).merge(Aspect.MAGIC, 15).merge(Aspect.AURA, 5));
        RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:metal_purification_iron"), (new AspectList()).merge(Aspect.METAL, 2).merge(Aspect.ORDER, 2));
        RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:metal_purification_gold"), (new AspectList()).merge(Aspect.METAL, 2).merge(Aspect.ORDER, 2));
        RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:metal_purification_cinnabar"),(new AspectList()).merge(Aspect.METAL, 2).merge(Aspect.ORDER, 2));
        if (ModConfig.foundCopperOre) {
            RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:metal_purification_copper"),new AspectList().merge(Aspect.METAL, 2).merge(Aspect.ORDER, 2));
        }

        if (ModConfig.foundTinOre) {
            RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:metal_purification_tin"),new AspectList().merge(Aspect.METAL, 2).merge(Aspect.ORDER, 2));
        }

        if (ModConfig.foundSilverOre) {
            RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:metal_purification_silver"),new AspectList().merge(Aspect.METAL, 2).merge(Aspect.ORDER, 2));
        }

        if (ModConfig.foundLeadOre) {
            RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:metal_purification_lead"),new AspectList().merge(Aspect.METAL, 2).merge(Aspect.ORDER, 2));
        }
        RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:LiquidDeath"),new AspectList().add(Aspect.DEATH, 50).add(Aspect.ALCHEMY, 20).add(Aspect.ENTROPY, 25));
        RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:BottleTaint"),new AspectList().add(Aspect.FLUX, 30).add(Aspect.WATER, 40));
        RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:BathSalts"),new AspectList().add(Aspect.MIND, 30).add(Aspect.AIR, 40).add(Aspect.ORDER, 30).add(Aspect.LIFE, 60));
        RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:SaneSoap"),new AspectList().add(Aspect.MIND, 80).add(Aspect.ELDRITCH, 25).add(Aspect.ORDER, 80).add(Aspect.LIFE, 50));
        RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:EverfullUrn"),new AspectList().add(Aspect.WATER, 15).add(Aspect.CRAFT, 5).add(Aspect.EARTH, 10));

        //Thaumc Tweaker
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("minecraft:ghast_tear"),new CrucibleRecipe("HEDGEALCHEMY",new ItemStack(Items.GHAST_TEAR),new ItemStack(ItemsTC.nuggets,1,5), (new AspectList().add(Aspect.FIRE,10).add(Aspect.BEAST,5).add(Aspect.SOUL,10))));

        // Thaumic Augmentation
        RecipeApi.changeAlchemyRecipe(new ResourceLocation(ThaumicAugmentationAPI.MODID, "impetus_jewel"),new AspectList().add(Aspect.ORDER, 25).add(Aspect.ENERGY, 25));

        //Thaumic Additions
        for(Aspect a : Aspect.aspects.values())
        {
            CrucibleRecipe cr = new CrucibleRecipe("TAR_VIS_SEEDS", ItemVisSeeds.create(a, 1), new ItemStack(Items.WHEAT_SEEDS), new AspectList().add(Aspect.PLANT, 40).add(a, 10));
            ResourceLocation loc = new ResourceLocation(InfoTAR.MOD_ID, a.getTag() + "_vis_seed");
            visSeedsRecipes.add(loc);
            ThaumcraftApi.addCrucibleRecipe(loc, cr);
        }

        ThaumcraftApi.addFakeCraftingRecipe(visSeedsRecipeIDFake, visSeedsRecipes);
    }
}
