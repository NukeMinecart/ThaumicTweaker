package com.nukeminecart.thaumictweaker.recipes;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidUtil;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.blocks.BlocksTC;
import thaumcraft.api.crafting.CrucibleRecipe;
import thaumcraft.api.items.ItemsTC;
import thaumcraft.common.config.ConfigBlocks;
import thaumcraft.common.config.ConfigItems;
import thaumcraft.common.config.ModConfig;
import thaumcraft.common.items.consumables.ItemPhial;
import thecodex6824.thaumicaugmentation.api.TAItems;
import thecodex6824.thaumicaugmentation.api.ThaumicAugmentationAPI;

public class AlchemyRecipes {
    public static void initializeAlchemyRecipes() {
        //Thuamcraft
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumcraft:alumentum"), new CrucibleRecipe("ALUMENTUM", new ItemStack(ItemsTC.alumentum), new ItemStack(Items.COAL, 1, 32767), (new AspectList()).merge(Aspect.ENERGY, 20).merge(Aspect.FIRE, 15).merge(Aspect.ENTROPY, 5)));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumcraft:brassingot"), new CrucibleRecipe("METALLURGY@1", new ItemStack(ItemsTC.ingots, 1, 2), "ingotIron", (new AspectList()).merge(Aspect.TOOL, 5).merge(Aspect.EARTH, 5)));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumcraft:voidingot"), new CrucibleRecipe("BASEELDRITCH", new ItemStack(ItemsTC.ingots, 1, 1), new ItemStack(ItemsTC.voidSeed), (new AspectList()).merge(Aspect.METAL, 10).merge(Aspect.FLUX, 5).merge(Aspect.ENTROPY,5)));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumcraft:hedge_tallow"), new CrucibleRecipe("HEDGEALCHEMY@1", new ItemStack(ItemsTC.tallow), new ItemStack(Items.ROTTEN_FLESH), (new AspectList()).merge(Aspect.FIRE, 4)));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumcraft:hedge_leather"), new CrucibleRecipe("HEDGEALCHEMY@1", new ItemStack(Items.LEATHER), new ItemStack(Items.ROTTEN_FLESH), (new AspectList()).merge(Aspect.AIR, 5).merge(Aspect.BEAST, 5)));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumcraft:focus_1"), new CrucibleRecipe("UNLOCKAUROMANCY", new ItemStack(ItemsTC.focus1), ConfigItems.ORDER_CRYSTAL, (new AspectList()).merge(Aspect.CRYSTAL, 15).merge(Aspect.MAGIC, 15).merge(Aspect.AURA, 5)));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumcraft:metal_purification_iron"), new CrucibleRecipe("METALPURIFICATION", new ItemStack(ItemsTC.clusters, 1, 0), "oreIron", (new AspectList()).merge(Aspect.METAL, 2).merge(Aspect.ORDER, 2)));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumcraft:metal_purification_gold"), new CrucibleRecipe("METALPURIFICATION", new ItemStack(ItemsTC.clusters, 1, 1), "oreGold", (new AspectList()).merge(Aspect.METAL, 2).merge(Aspect.ORDER, 2)));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumcraft:metal_purification_cinnabar"), new CrucibleRecipe("METALPURIFICATION", new ItemStack(ItemsTC.clusters, 1, 6), "oreCinnabar", (new AspectList()).merge(Aspect.METAL, 2).merge(Aspect.ORDER, 2)));
        if (ModConfig.foundCopperOre) {
            ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumcraft:metal_purification_copper"), new CrucibleRecipe("METALPURIFICATION", new ItemStack(ItemsTC.clusters, 1, 2), "oreCopper", (new AspectList()).merge(Aspect.METAL, 2).merge(Aspect.ORDER, 2)));
        }

        if (ModConfig.foundTinOre) {
            ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumcraft:metal_purification_tin"), new CrucibleRecipe("METALPURIFICATION", new ItemStack(ItemsTC.clusters, 1, 3), "oreTin", (new AspectList()).merge(Aspect.METAL, 2).merge(Aspect.ORDER, 2)));
        }

        if (ModConfig.foundSilverOre) {
            ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumcraft:metal_purification_silver"), new CrucibleRecipe("METALPURIFICATION", new ItemStack(ItemsTC.clusters, 1, 4), "oreSilver", (new AspectList()).merge(Aspect.METAL, 2).merge(Aspect.ORDER, 2)));
        }

        if (ModConfig.foundLeadOre) {
            ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumcraft:metal_purification_lead"), new CrucibleRecipe("METALPURIFICATION", new ItemStack(ItemsTC.clusters, 1, 5), "oreLead", (new AspectList()).merge(Aspect.METAL, 2).merge(Aspect.ORDER, 2)));
        }
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumcraft:LiquidDeath"), new CrucibleRecipe("LIQUIDDEATH", FluidUtil.getFilledBucket(new FluidStack(ConfigBlocks.FluidDeath.instance, 1000)), new ItemStack(Items.BUCKET), (new AspectList()).add(Aspect.DEATH, 50).add(Aspect.ALCHEMY, 20).add(Aspect.ENTROPY, 25)));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumcraft:BottleTaint"), new CrucibleRecipe("BOTTLETAINT", new ItemStack(ItemsTC.bottleTaint), ItemPhial.makeFilledPhial(Aspect.FLUX), (new AspectList()).add(Aspect.FLUX, 30).add(Aspect.WATER, 40)));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumcraft:BathSalts"), new CrucibleRecipe("BATHSALTS", new ItemStack(ItemsTC.bathSalts), new ItemStack(ItemsTC.salisMundus), (new AspectList()).add(Aspect.MIND, 30).add(Aspect.AIR, 40).add(Aspect.ORDER, 30).add(Aspect.LIFE, 60)));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumcraft:SaneSoap"), new CrucibleRecipe("SANESOAP", new ItemStack(ItemsTC.sanitySoap), new ItemStack(BlocksTC.fleshBlock), (new AspectList()).add(Aspect.MIND, 80).add(Aspect.ELDRITCH, 25).add(Aspect.ORDER, 80).add(Aspect.LIFE, 50)));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumcraft:EverfullUrn"), new CrucibleRecipe("EVERFULLURN", new ItemStack(BlocksTC.everfullUrn), new ItemStack(Items.FLOWER_POT), (new AspectList()).add(Aspect.WATER, 15).add(Aspect.CRAFT, 5).add(Aspect.EARTH, 10)));

        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("minecraft:ghast_tear"),new CrucibleRecipe("HEDGEALCHEMY",new ItemStack(Items.GHAST_TEAR),new ItemStack(ItemsTC.nuggets,1,5), (new AspectList().add(Aspect.FIRE,10).add(Aspect.BEAST,5).add(Aspect.SOUL,10))));
        // Thaumic Augmentation
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation(ThaumicAugmentationAPI.MODID, "impetus_jewel"), new CrucibleRecipe(
                "IMPETUS", new ItemStack(TAItems.MATERIAL, 2, 5), ItemsTC.voidSeed, new AspectList().add(Aspect.ORDER, 25).add(Aspect.ENERGY, 25)));
    }
}
