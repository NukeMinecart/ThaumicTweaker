package nukeminecart.thaumictweaker.recipes.thaumicaugmentation;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import nukeminecart.thaumictweaker.recipes.api.RecipeApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.items.ItemsTC;

public class ThaumicAugmentationInfusionRecipes {
    public static void initializeInfusionRecipes() {
        RecipeApi.changeComplexInfusionRecipe(new ResourceLocation("thaumicaugmentation", "thaumium_robes_hood"),
                new AspectList().add(Aspect.METAL, 30).add(Aspect.ENERGY, 30).add(Aspect.PROTECT, 30).add(Aspect.SENSES, 15).add(Aspect.AURA, 15),
                new Object[]{ItemsTC.goggles, ItemsTC.fabric, ItemsTC.fabric, ItemsTC.salisMundus, "plateThaumium", "leather"});

        RecipeApi.changeComplexInfusionRecipe(new ResourceLocation("thaumicaugmentation", "thaumium_robes_chestplate"),
                new AspectList().add(Aspect.METAL, 30).add(Aspect.ENERGY, 30).add(Aspect.PROTECT, 35).add(Aspect.AURA, 20),
                new Object[]{ItemsTC.fabric, ItemsTC.fabric, ItemsTC.fabric, ItemsTC.salisMundus, "plateThaumium", "plateThaumium"});

        RecipeApi.changeComplexInfusionRecipe(new ResourceLocation("thaumicaugmentation", "thaumium_robes_leggings"),
                new AspectList().add(Aspect.METAL, 30).add(Aspect.ENERGY, 30).add(Aspect.PROTECT, 25).add(Aspect.AURA, 10),
                new Object[]{ItemsTC.fabric, new ItemStack(ItemsTC.baubles, 1, 2), new ItemStack(ItemsTC.clothLegs), ItemsTC.salisMundus, "plateThaumium", "plateThaumium"});

        RecipeApi.changeComplexInfusionRecipe(new ResourceLocation("thaumicaugmentation", "gauntlet_void"),
                new AspectList().add(Aspect.ENERGY, 100).add(Aspect.ELDRITCH, 150).add(Aspect.VOID, 150),
                new Object[]{ItemsTC.fabric, "plateVoid", "plateVoid", "plateVoid", "plateVoid", ItemsTC.salisMundus});

        RecipeApi.changeComplexInfusionRecipe(new ResourceLocation("thaumicaugmentation", "boots_void"),
                new AspectList().add(Aspect.VOID, 50).add(Aspect.ELDRITCH, 100).add(Aspect.MOTION, 300).add(Aspect.FLIGHT, 150),
                new Object[]{ItemsTC.fabric, ItemsTC.fabric, "plateVoid", "plateVoid", "feather", ItemsTC.primordialPearl, "quicksilver"});

        RecipeApi.changeComplexInfusionRecipe(new ResourceLocation("thaumicaugmentation", "primal_cutter"), new AspectList().add(Aspect.EARTH, 150).add(
                        Aspect.TOOL, 100).add(Aspect.MAGIC, 100).add(Aspect.VOID, 100).add(Aspect.AVERSION, 150).add(
                        Aspect.ELDRITCH, 100).add(Aspect.DESIRE, 100),
                new Object[]{ItemsTC.voidAxe, ItemsTC.voidSword, ItemsTC.elementalAxe, ItemsTC.elementalSword});

        RecipeApi.changeComplexInfusionRecipe(new ResourceLocation("thaumicaugmentation", "elytra_harness"), new AspectList().add(Aspect.MOTION, 50).add(Aspect.ENERGY, 50).add(Aspect.FLIGHT, 50),
                new Object[]{"plateVoid", ItemsTC.visResonator, Items.ELYTRA});
    }
}
