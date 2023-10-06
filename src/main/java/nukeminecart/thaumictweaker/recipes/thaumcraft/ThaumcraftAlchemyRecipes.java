package nukeminecart.thaumictweaker.recipes.thaumcraft;

import net.minecraft.util.ResourceLocation;
import nukeminecart.thaumictweaker.recipes.api.RecipeApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.common.config.ModConfig;

public class ThaumcraftAlchemyRecipes {
    public static void initializeAlchemyRecipes() {
        //Thuamcraft
        RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:alumentum"), new AspectList().merge(Aspect.ENERGY, 20).merge(Aspect.FIRE, 15).merge(Aspect.ENTROPY, 5));
        RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:brassingot"), new AspectList().merge(Aspect.TOOL, 5).merge(Aspect.EARTH, 5));
        RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:voidingot"), new AspectList().merge(Aspect.METAL, 10).merge(Aspect.FLUX, 5).merge(Aspect.ENTROPY, 5));
        RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:hedge_tallow"), new AspectList().merge(Aspect.FIRE, 4));
        RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:hedge_leather"), new AspectList().merge(Aspect.AIR, 5).merge(Aspect.BEAST, 5));
        RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:focus_1"), new AspectList().merge(Aspect.CRYSTAL, 15).merge(Aspect.MAGIC, 15).merge(Aspect.AURA, 5));
        RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:metal_purification_iron"), (new AspectList()).merge(Aspect.METAL, 2).merge(Aspect.ORDER, 2));
        RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:metal_purification_gold"), (new AspectList()).merge(Aspect.METAL, 2).merge(Aspect.ORDER, 2));
        RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:metal_purification_cinnabar"), (new AspectList()).merge(Aspect.METAL, 2).merge(Aspect.ORDER, 2));
        if (ModConfig.foundCopperOre) {
            RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:metal_purification_copper"), new AspectList().merge(Aspect.METAL, 2).merge(Aspect.ORDER, 2));
        }

        if (ModConfig.foundTinOre) {
            RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:metal_purification_tin"), new AspectList().merge(Aspect.METAL, 2).merge(Aspect.ORDER, 2));
        }

        if (ModConfig.foundSilverOre) {
            RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:metal_purification_silver"), new AspectList().merge(Aspect.METAL, 2).merge(Aspect.ORDER, 2));
        }

        if (ModConfig.foundLeadOre) {
            RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:metal_purification_lead"), new AspectList().merge(Aspect.METAL, 2).merge(Aspect.ORDER, 2));
        }
        RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:LiquidDeath"), new AspectList().add(Aspect.DEATH, 50).add(Aspect.ALCHEMY, 20).add(Aspect.ENTROPY, 25));
        RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:BottleTaint"), new AspectList().add(Aspect.FLUX, 30).add(Aspect.WATER, 40));
        RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:BathSalts"), new AspectList().add(Aspect.MIND, 30).add(Aspect.AIR, 40).add(Aspect.ORDER, 30).add(Aspect.LIFE, 60));
        RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:SaneSoap"), new AspectList().add(Aspect.MIND, 80).add(Aspect.ELDRITCH, 25).add(Aspect.ORDER, 80).add(Aspect.LIFE, 50));
        RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumcraft:EverfullUrn"), new AspectList().add(Aspect.WATER, 15).add(Aspect.CRAFT, 5).add(Aspect.EARTH, 10));
    }
}
