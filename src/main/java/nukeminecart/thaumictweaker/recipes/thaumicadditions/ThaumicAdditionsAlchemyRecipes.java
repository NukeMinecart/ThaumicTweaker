package nukeminecart.thaumictweaker.recipes.thaumicadditions;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.zeith.thaumicadditions.items.seed.ItemVisSeeds;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.CrucibleRecipe;

import java.util.ArrayList;
import java.util.List;

public class ThaumicAdditionsAlchemyRecipes {
    public static final ResourceLocation visSeedsRecipeIDFake = new ResourceLocation( "thaumadditions", "vis_seeds_recipes_all");
    public static final List<ResourceLocation> visSeedsRecipes = new ArrayList<>();

    public static void initializeAlchemyRecipes() {
        for (Aspect a : Aspect.aspects.values()) {
            CrucibleRecipe cr = new CrucibleRecipe("TAR_VIS_SEEDS",  ItemVisSeeds.create(a, 1), new ItemStack(Items.WHEAT_SEEDS), new AspectList().add(Aspect.PLANT, 40).add(a, 10));
            ResourceLocation loc = new ResourceLocation( "thaumadditions", a.getTag() + "_vis_seed");
            visSeedsRecipes.add(loc);
            ThaumcraftApi.addCrucibleRecipe(loc, cr);
        }

        ThaumcraftApi.addFakeCraftingRecipe(visSeedsRecipeIDFake, visSeedsRecipes);
    }
}
