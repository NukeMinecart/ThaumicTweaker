package nukeminecart.thaumictweaker.recipes.thaumicaugmentation;

import net.minecraft.util.ResourceLocation;
import nukeminecart.thaumictweaker.recipes.api.RecipeApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

public class ThaumicAugmentationAlchemyRecipes {
    public static void initializeAlchemyRecipes() {
        RecipeApi.changeAlchemyRecipe(new ResourceLocation("thaumicaugmentation", "impetus_jewel"), new AspectList().add(Aspect.ORDER, 25).add(Aspect.ENERGY, 25));

    }
}
