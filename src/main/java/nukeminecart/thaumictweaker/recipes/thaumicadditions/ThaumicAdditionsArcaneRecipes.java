package nukeminecart.thaumictweaker.recipes.thaumicadditions;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import nukeminecart.thaumictweaker.ModConfig;
import nukeminecart.thaumictweaker.recipes.api.RecipeApi;
import org.zeith.thaumicadditions.init.BlocksTAR;
import org.zeith.thaumicadditions.init.ItemsTAR;
import thaumcraft.api.blocks.BlocksTC;
import thaumcraft.api.items.ItemsTC;

public class ThaumicAdditionsArcaneRecipes {

    public static void initializeArcaneRecipes() {
        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumadditions", "dna_sample"), 100, new Object[]{"tmt", "rpr", "tmt", 'r', ItemsTC.mechanismSimple, 't', "ingotThaumium", 'm', ItemsTC.morphicResonator, 'p', "plateThaumium"});

        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumadditions", "brass_jar"), 7, new Object[]{"p", "j", 'p', "plateBrass", 'j', BlocksTC.jarNormal});
        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumadditions", "thaumium_jar"), 15, new Object[]{"p", "j", 'p', new ItemStack(ItemsTC.plate, 1, 2), 'j', BlocksTAR.BRASS_JAR});
        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumadditions", "eldritch_jar"), 150, new Object[]{"p", "j", 'p', new ItemStack(ItemsTC.plate, 1, 3), 'j', BlocksTAR.THAUMIUM_JAR});
        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumadditions", "mithrillium_jar"), 750, new Object[]{"p", "j", 'p', new ItemStack(ItemsTAR.MITHRILLIUM_PLATE), 'j', BlocksTAR.ELDRITCH_JAR});
        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumadditions", "adaminite_jar"), 1000, new Object[]{"p", "j", 'p', new ItemStack(ItemsTAR.ADAMINITE_PLATE), 'j', BlocksTAR.MITHRILLIUM_JAR});

        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumadditions", "adaminite_fabric"), 200, new Object[]{" f ", "faf", " f ", 'f', new ItemStack(ItemsTC.fabric), 'a', new ItemStack(ItemsTAR.ADAMINITE_INGOT)});
        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumadditions", "adaminite_hood"), 200, new Object[]{"fff", "fmf", 'f', new ItemStack(ItemsTAR.ADAMINITE_FABRIC), 'm', new ItemStack(ItemsTC.voidRobeHelm)});
        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumadditions", "adaminite_robe"), 200, new Object[]{"f f", "fmf", "fff", 'f', new ItemStack(ItemsTAR.ADAMINITE_FABRIC), 'm', new ItemStack(ItemsTC.voidRobeChest)});
        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumadditions", "adaminite_belt"), 200, new Object[]{" f ", "fmf", 'f', new ItemStack(ItemsTAR.ADAMINITE_FABRIC), 'm', new ItemStack(ItemsTC.voidRobeLegs)});
        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumadditions", "adaminite_boots"), 200, new Object[]{"f f", "fmf", 'f', new ItemStack(ItemsTAR.ADAMINITE_FABRIC), 'm', new ItemStack(ModConfig.ISTHAUMICAUGMENT?thecodex6824.thaumicaugmentation.api.TAItems.VOID_BOOTS:ItemsTC.travellerBoots)});

        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumadditions", "mithminite_fabric"), 400, new Object[]{" a ", "ama", " a ", 'm', new ItemStack(ItemsTAR.MITHMINITE_INGOT), 'a', new ItemStack(ItemsTAR.ADAMINITE_FABRIC)});
        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumadditions", "mithrillium_smelter"), 500, new Object[]{"bsb", "mcm", "mmm", 'b', "plateBrass", 's', BlocksTC.smelterVoid, 'm', ItemsTAR.MITHRILLIUM_PLATE, 'c', BlocksTC.metalAlchemicalAdvanced});
        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumadditions", "adaminite_smelter"), 600, new Object[]{"bsb", "mcm", "mmm", 'b', "plateBrass", 's', BlocksTAR.MITHRILLIUM_SMELTER, 'm', ItemsTAR.ADAMINITE_PLATE, 'c', BlocksTC.metalAlchemicalAdvanced});
        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumadditions", "mithminite_smelter"), 750, new Object[]{"bsb", "mcm", "mmm", 'b', "plateBrass", 's', BlocksTAR.ADAMINITE_SMELTER, 'm', ItemsTAR.MITHMINITE_PLATE, 'c', BlocksTC.metalAlchemicalAdvanced});
        
    }
}
