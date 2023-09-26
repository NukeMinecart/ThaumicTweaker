package nukeminecart.thaumictweaker.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import org.zeith.thaumicadditions.InfoTAR;
import org.zeith.thaumicadditions.api.AspectUtil;
import org.zeith.thaumicadditions.init.BlocksTAR;
import org.zeith.thaumicadditions.init.ItemsTAR;
import org.zeith.thaumicadditions.init.KnowledgeTAR;
import org.zeith.thaumicadditions.items.seed.ItemVisSeeds;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.blocks.BlocksTC;
import thaumcraft.api.crafting.CrucibleRecipe;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.crafting.ShapedArcaneRecipe;
import thaumcraft.api.items.ItemsTC;
import thecodex6824.thaumicaugmentation.api.TAItems;

import java.util.ArrayList;
import java.util.List;

public class ThaumicAdditionsRecipes

{
    public static final ResourceLocation visSeedsRecipeIDFake = new ResourceLocation(InfoTAR.MOD_ID, "vis_seeds_recipes_all");
    public static final List<ResourceLocation> visSeedsRecipes = new ArrayList<>();
    static ResourceLocation defaultGroup = new ResourceLocation("");


    public static void addInfusionRecipe(String path, Object output, String research, int instability, Object catalyst, AspectList aspects, Object... inputs)
    {
        ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation(InfoTAR.MOD_ID, path), new InfusionRecipe(research, output, instability, aspects, catalyst, inputs));
    }

    public static void addShapedArcaneRecipe(String path, String res, int vis, AspectList crystals, ItemStack result, Object... recipe)
    {
        ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation(InfoTAR.MOD_ID, path), new ShapedArcaneRecipe(defaultGroup, res, vis, crystals, result, recipe));
    }

    public static void init()
    {
        infusion();
        //arcaneCrafting();
        //crucible();

    }


    private static void infusion()
    {
        Ingredient primordialPearl = Ingredient.fromItem(ItemsTC.primordialPearl);

        addInfusionRecipe("mithrillium_ingot", new ItemStack(ItemsTAR.MITHRILLIUM_INGOT), "TAR_MITHRILLIUM", 5, new ItemStack(ItemsTC.ingots, 1, 1), new AspectList().add(Aspect.CRYSTAL, 30).add(Aspect.ENERGY, 20).add(Aspect.ELDRITCH, 10).add(Aspect.METAL, 30).add(Aspect.MAGIC, 10), new ItemStack(ItemsTC.quicksilver), new ItemStack(ItemsTC.salisMundus), new ItemStack(ItemsTC.quicksilver), new ItemStack(ItemsTC.salisMundus));
        addInfusionRecipe("adaminite_ingot", new ItemStack(ItemsTAR.ADAMINITE_INGOT), "TAR_ADAMINITE", 10, new ItemStack(ItemsTAR.MITHRILLIUM_INGOT), new AspectList().add(Aspect.LIFE, 50).add(Aspect.ALCHEMY, 30).add(Aspect.EXCHANGE, 40).add(Aspect.METAL, 40).add(Aspect.SOUL, 60).add(Aspect.MAGIC, 50).add(KnowledgeTAR.DRACO, 10), new ItemStack(Items.END_CRYSTAL), new ItemStack(ItemsTC.fabric), primordialPearl);
        addInfusionRecipe("mithminite_ingot", new ItemStack(ItemsTAR.MITHMINITE_INGOT), "TAR_MITHMINITE", 8, new ItemStack(ItemsTAR.ADAMINITE_INGOT), new AspectList().add(KnowledgeTAR.CAELES, 10).add(Aspect.METAL, 60).add(Aspect.LIFE, 90).add(Aspect.MAGIC, 60), new ItemStack(ItemsTAR.MITHRILLIUM_INGOT), new ItemStack(ItemsTC.quicksilver), new ItemStack(ItemsTAR.MITHRILLIUM_INGOT), new ItemStack(ItemsTC.quicksilver));

        addInfusionRecipe("mithrillium_resonator", new ItemStack(ItemsTAR.MITHRILLIUM_RESONATOR), "TAR_MITHRILLIUM", 5, new ItemStack(ItemsTC.morphicResonator), AspectUtil.primals(10).add(KnowledgeTAR.IMPERIUM, 10), new ItemStack(ItemsTAR.MITHRILLIUM_PLATE), new ItemStack(ItemsTC.mechanismComplex));

        addInfusionRecipe("adaminite_sword", new ItemStack(ItemsTAR.ADAMINITE_SWORD), "TAR_ADAMINITE_SWORD", 6, new ItemStack(ItemsTC.voidSword), new AspectList().add(KnowledgeTAR.DRACO, 20).add(Aspect.MAGIC, 70).add(Aspect.AVERSION, 150).add(KnowledgeTAR.INFERNUM, 90).add(Aspect.METAL, 60), "plateAdaminite", "plateAdaminite", primordialPearl, "plateAdaminite");

        addInfusionRecipe("mithminite_scythe", new ItemStack(ItemsTAR.MITHMINITE_SCYTHE), "TAR_MITHMINITE_SCYTHE", 1, primordialPearl, new AspectList().add(Aspect.AVERSION, 250).add(Aspect.TOOL, 150).add(Aspect.MAGIC, 100), new ItemStack(ItemsTAR.MITHMINITE_BLADE), new ItemStack(ItemsTAR.MITHMINITE_PLATE), new ItemStack(ItemsTAR.MITHMINITE_HANDLE));
        addInfusionRecipe("mithminite_blade", new ItemStack(ItemsTAR.MITHMINITE_BLADE), "TAR_MITHMINITE_SCYTHE", 1, new ItemStack(ItemsTAR.ADAMINITE_SWORD), new AspectList().add(Aspect.AVERSION, 150).add(KnowledgeTAR.INFERNUM, 50), new ItemStack(ItemsTAR.MITHMINITE_PLATE), new ItemStack(ItemsTAR.MITHMINITE_PLATE), new ItemStack(ItemsTAR.MITHRILLIUM_RESONATOR));
        addInfusionRecipe("mithminite_handle", new ItemStack(ItemsTAR.MITHMINITE_HANDLE), "TAR_MITHMINITE_SCYTHE", 1, new ItemStack(ItemsTAR.MITHMINITE_NUGGET), new AspectList().add(Aspect.TOOL, 100).add(Aspect.SOUL, 75), new ItemStack(ItemsTAR.MITHMINITE_PLATE), new ItemStack(ItemsTAR.MITHMINITE_INGOT));

        addInfusionRecipe("aura_disperser", new ItemStack(BlocksTAR.AURA_DISPERSER), "TAR_AURA_DISPERSER", 4, new ItemStack(Blocks.DISPENSER), new AspectList().add(KnowledgeTAR.FLUCTUS, 30).add(Aspect.AURA, 10).add(Aspect.ALCHEMY, 20).add(KnowledgeTAR.VENTUS, 50), new ItemStack(ItemsTC.mechanismComplex), AspectUtil.salt(Aspect.AURA), AspectUtil.salt(Aspect.ALCHEMY), new ItemStack(BlocksTC.shimmerleaf), new ItemStack(ItemsTC.morphicResonator), AspectUtil.salt(KnowledgeTAR.FLUCTUS), "nitor");

        addInfusionRecipe("crystal_crusher", new ItemStack(BlocksTAR.CRYSTAL_CRUSHER), "TAR_CRYSTAL_CRUSHER", 3, new ItemStack(ItemsTC.mechanismComplex), new AspectList().add(Aspect.CRAFT, 20).add(KnowledgeTAR.EXITIUM, 20).add(Aspect.TOOL, 20), AspectUtil.crystalEssence(Aspect.AIR), AspectUtil.crystalEssence(Aspect.EARTH), AspectUtil.crystalEssence(Aspect.FIRE), AspectUtil.crystalEssence(Aspect.WATER), AspectUtil.crystalEssence(Aspect.ORDER), AspectUtil.crystalEssence(Aspect.ENTROPY), new ItemStack(ItemsTC.plate, 1, 2), new ItemStack(ItemsTC.plate, 1, 2), new ItemStack(ItemsTC.plate, 1, 2), new ItemStack(BlocksTC.slabArcaneStone), new ItemStack(ItemsTAR.SALT_ESSENCE));

        addInfusionRecipe("enchanted_golden_apple", new ItemStack(Items.GOLDEN_APPLE, 1, 1), "TAR_ENCHANTED_GOLDEN_APPLE", 6, new ItemStack(Items.GOLDEN_APPLE, 1, 0), new AspectList().add(Aspect.DESIRE, 10).add(Aspect.LIFE, 5).add(KnowledgeTAR.VISUM, 20), new ItemStack(Blocks.GOLD_BLOCK), new ItemStack(Blocks.GOLD_BLOCK), new ItemStack(Blocks.GOLD_BLOCK), new ItemStack(Blocks.GOLD_BLOCK), new ItemStack(Blocks.GOLD_BLOCK), new ItemStack(Blocks.GOLD_BLOCK), new ItemStack(Blocks.GOLD_BLOCK), new ItemStack(Blocks.GOLD_BLOCK));

        addInfusionRecipe("growth_chamber", new ItemStack(BlocksTAR.GROWTH_CHAMBER), "TAR_GROWTH_CHAMBER", 3, BlocksTAR.CRYSTAL_BLOCK, new AspectList().add(Aspect.ORDER, 20).add(Aspect.MECHANISM, 15).add(KnowledgeTAR.IMPERIUM, 10), ItemsTC.amber, new ItemStack(ItemsTC.plate, 1, 2), ItemsTC.morphicResonator, new ItemStack(ItemsTC.plate, 1, 2), ItemsTC.visResonator, new ItemStack(ItemsTC.plate, 1, 2), ItemsTC.mechanismSimple, new ItemStack(ItemsTC.plate, 1, 2));
        addInfusionRecipe("chester", new ItemStack(ItemsTAR.CHESTER), "TAR_CHESTER", 2, new ItemStack(BlocksTC.hungryChest), new AspectList().add(KnowledgeTAR.IMPERIUM, 80).add(Aspect.LIFE, 40).add(Aspect.VOID, 20).add(Aspect.MECHANISM, 10), new ItemStack(BlocksTC.plankGreatwood), "ingotThaumium", new ItemStack(BlocksTC.plankGreatwood), new ItemStack(ItemsTC.brain), new ItemStack(BlocksTC.plankGreatwood), new ItemStack(ItemsTC.morphicResonator), "ingotThaumium");

        addInfusionRecipe("wormhole_mirror", new ItemStack(ItemsTAR.WORMHOLE_MIRROR), "TAR_WORMHOLE_MIRROR", 6, new ItemStack(ItemsTC.handMirror), new AspectList().add(Aspect.ELDRITCH, 50).add(KnowledgeTAR.IMPERIUM, 50).add(KnowledgeTAR.VISUM, 40), new ItemStack(ItemsTAR.VOID_THAUMOMETER), new ItemStack(ItemsTC.plate, 1, 3), new ItemStack(ItemsTC.plate, 1, 3));
        addInfusionRecipe("void_elemental_hoe", new ItemStack(ItemsTAR.VOID_ELEMENTAL_HOE), "TAR_VOID_ELEMENTAL_HOE", 6, new ItemStack(ItemsTC.elementalHoe), new AspectList().add(Aspect.ELDRITCH, 40).add(Aspect.PLANT, 80).add(Aspect.METAL, 200), primordialPearl, new ItemStack(ItemsTC.plate, 1, 3), new ItemStack(ItemsTC.plate, 1, 3));
        addInfusionRecipe("void_elemental_shovel", ItemsTAR.VOID_ELEMENTAL_SHOVEL.defInst(), "TAR_VOID_ELEMENTAL_SHOVEL", 6, new ItemStack(ItemsTC.elementalShovel), new AspectList().add(Aspect.ELDRITCH, 40).add(Aspect.EARTH, 80).add(Aspect.METAL, 200), primordialPearl, new ItemStack(ItemsTC.plate, 1, 3), new ItemStack(ItemsTC.plate, 1, 3));
        addInfusionRecipe("void_elemental_axe", ItemsTAR.VOID_ELEMENTAL_AXE.defInst(), "TAR_VOID_ELEMENTAL_AXE", 6, new ItemStack(ItemsTC.elementalAxe), new AspectList().add(Aspect.ELDRITCH, 40).add(Aspect.ENTROPY, 80).add(Aspect.METAL, 200), primordialPearl, new ItemStack(ItemsTC.plate, 1, 3), new ItemStack(ItemsTC.plate, 1, 3));
        addInfusionRecipe("void_elemental_pickaxe", ItemsTAR.VOID_ELEMENTAL_PICKAXE.defInst(), "TAR_VOID_ELEMENTAL_PICKAXE", 6, new ItemStack(ItemsTC.elementalPick), new AspectList().add(Aspect.ELDRITCH, 40).add(Aspect.FIRE, 80).add(Aspect.METAL, 200).add(Aspect.SENSES, 50), primordialPearl, new ItemStack(ItemsTC.plate, 1, 3), new ItemStack(ItemsTC.plate, 1, 3));

        addInfusionRecipe("void_crop", new ItemStack(ItemsTAR.VOID_SEED), "TAR_VOID_CROP", 5, new ItemStack(Items.WHEAT_SEEDS), AspectUtil.primals(20).add(Aspect.DARKNESS, 50).add(KnowledgeTAR.CAELES, 5), primordialPearl, new ItemStack(ItemsTC.voidSeed), new ItemStack(ItemsTC.salisMundus));
        addInfusionRecipe("shadow_enchanter", new ItemStack(BlocksTAR.SHADOW_ENCHANTER), "TAR_SHADOW_ENCHANTER", 10, new ItemStack(Blocks.ENCHANTING_TABLE), AspectUtil.primals(100).add(Aspect.MIND, 300), new ItemStack(ItemsTAR.MITHRILLIUM_PLATE), "ingotThaumium", new ItemStack(ItemsTAR.MITHRILLIUM_RESONATOR), new ItemStack(ItemsTC.mechanismComplex), new ItemStack(ItemsTAR.MITHRILLIUM_PLATE), "ingotThaumium", new ItemStack(ItemsTAR.DISENCHANT_FABRIC));
        addInfusionRecipe("shadow_beam_staff", new ItemStack(ItemsTAR.SHADOW_BEAM_STAFF), "TAR_SHADOW_BEAM_STAFF", 10, new ItemStack(ItemsTC.visResonator), AspectUtil.primals(50).add(Aspect.ELDRITCH, 200).add(KnowledgeTAR.DRACO, 50), new ItemStack(ItemsTAR.MITHRILLIUM_PLATE), "plateIron", new ItemStack(ItemsTAR.MITHRILLIUM_PLATE), "plateIron", new ItemStack(ItemsTAR.MITHRILLIUM_PLATE), "plateIron");
        addInfusionRecipe("void_anvil", new ItemStack(BlocksTAR.VOID_ANVIL), "TAR_VOID_ANVIL", 7, new ItemStack(Blocks.ANVIL), new AspectList().add(Aspect.ELDRITCH, 100).add(KnowledgeTAR.CAELES, 10), new ItemStack(ItemsTC.plate, 1, 3), new ItemStack(ItemsTC.plate, 1, 3), new ItemStack(BlocksTC.metalBlockVoid), new ItemStack(ItemsTC.plate, 1, 3), new ItemStack(ItemsTC.plate, 1, 3),new ItemStack(ItemsTC.plate, 1, 3), new ItemStack(ItemsTC.plate, 1, 3), new ItemStack(ItemsTC.plate, 1, 3), new ItemStack(ItemsTC.plate, 1, 3), new ItemStack(ItemsTC.plate, 1, 3), new ItemStack(ItemsTC.plate, 1, 3), new ItemStack(BlocksTC.metalBlockVoid));
        addInfusionRecipe("the_beheader", new ItemStack(ItemsTAR.THE_BEHEADER), "TAR_THE_BEHEADER", 8, new ItemStack(ItemsTC.thaumiumAxe), new AspectList().add(Aspect.UNDEAD, 100).add(Aspect.ENTROPY, 70).add(Aspect.MAGIC, 85).add(Aspect.AVERSION, 120).add(Aspect.DEATH, 70), new ItemStack(ItemsTAR.MITHRILLIUM_PLATE), new ItemStack(Items.SKULL, 1, 1), new ItemStack(ItemsTAR.MITHRILLIUM_PLATE), new ItemStack(ItemsTC.plate, 1, 2), new ItemStack(ItemsTAR.MITHRILLIUM_PLATE));

        }

    private static void arcaneCrafting()
    {
        addShapedArcaneRecipe("dna_sample", "TAR_MOB_SUMMONING@2", 100, AspectUtil.primals(6), new ItemStack(ItemsTAR.ENTITY_CELL), "tmt", "rpr", "tmt", 'r', ItemsTC.mechanismSimple, 't', "ingotThaumium", 'm', ItemsTC.morphicResonator, 'p', "plateThaumium");

        addShapedArcaneRecipe("brass_jar", "TAR_BRASS_JAR", 7, new AspectList(), new ItemStack(BlocksTAR.BRASS_JAR), "p", "j", 'p', "plateBrass", 'j', BlocksTC.jarNormal);
        addShapedArcaneRecipe("thaumium_jar", "TAR_THAUMIUM_JAR", 15, new AspectList().add(Aspect.WATER, 2), new ItemStack(BlocksTAR.THAUMIUM_JAR), "p", "j", 'p', new ItemStack(ItemsTC.plate, 1, 2), 'j', BlocksTAR.BRASS_JAR);
        addShapedArcaneRecipe("eldritch_jar", "TAR_ELDRITCH_JAR", 150, new AspectList().add(Aspect.WATER, 6), new ItemStack(BlocksTAR.ELDRITCH_JAR), "p", "j", 'p', new ItemStack(ItemsTC.plate, 1, 3), 'j', BlocksTAR.THAUMIUM_JAR);
        addShapedArcaneRecipe("mithrillium_jar", "TAR_MITHRILLIUM_JAR", 750, new AspectList().add(Aspect.WATER, 12), new ItemStack(BlocksTAR.MITHRILLIUM_JAR), "p", "j", 'p', new ItemStack(ItemsTAR.MITHRILLIUM_PLATE), 'j', BlocksTAR.ELDRITCH_JAR);
        addShapedArcaneRecipe("adaminite_jar", "TAR_ADAMINITE_JAR@2", 1000, new AspectList().add(Aspect.WATER, 24), new ItemStack(BlocksTAR.ADAMINITE_JAR), "p", "j", 'p', new ItemStack(ItemsTAR.ADAMINITE_PLATE), 'j', BlocksTAR.MITHRILLIUM_JAR);

        addShapedArcaneRecipe("adaminite_fabric", "TAR_ADAMINITE_FABRIC", 200, AspectUtil.primals(4), new ItemStack(ItemsTAR.ADAMINITE_FABRIC, 2), " f ", "faf", " f ", 'f', new ItemStack(ItemsTC.fabric), 'a', new ItemStack(ItemsTAR.ADAMINITE_INGOT));
        addShapedArcaneRecipe("adaminite_hood", "TAR_ADAMINITE_FABRIC", 200, AspectUtil.primals(4), new ItemStack(ItemsTAR.ADAMINITE_HOOD), "fff", "fmf", 'f', new ItemStack(ItemsTAR.ADAMINITE_FABRIC), 'm', new ItemStack(ItemsTC.voidRobeHelm));
        addShapedArcaneRecipe("adaminite_robe", "TAR_ADAMINITE_FABRIC", 200, AspectUtil.primals(4), new ItemStack(ItemsTAR.ADAMINITE_ROBE), "f f", "fmf", "fff", 'f', new ItemStack(ItemsTAR.ADAMINITE_FABRIC), 'm', new ItemStack(ItemsTC.voidRobeChest));
        addShapedArcaneRecipe("adaminite_belt", "TAR_ADAMINITE_FABRIC", 200, AspectUtil.primals(4), new ItemStack(ItemsTAR.ADAMINITE_BELT), " f ", "fmf", 'f', new ItemStack(ItemsTAR.ADAMINITE_FABRIC), 'm', new ItemStack(ItemsTC.voidRobeLegs));
        addShapedArcaneRecipe("adaminite_boots", "TAR_ADAMINITE_FABRIC", 200, AspectUtil.primals(4), new ItemStack(ItemsTAR.ADAMINITE_BOOTS), "f f", "fmf", 'f', new ItemStack(ItemsTAR.ADAMINITE_FABRIC), 'm', new ItemStack(TAItems.VOID_BOOTS));

        addShapedArcaneRecipe("mithminite_fabric", "TAR_MITHMINITE_FABRIC", 400, AspectUtil.primals(8), new ItemStack(ItemsTAR.MITHMINITE_FABRIC, 2), " a ", "ama", " a ", 'm', new ItemStack(ItemsTAR.MITHMINITE_INGOT), 'a', new ItemStack(ItemsTAR.ADAMINITE_FABRIC));
        addShapedArcaneRecipe("mithrillium_smelter", "TAR_MITHRILLIUM_SMELTER", 500, new AspectList().add(Aspect.FIRE, 6).add(Aspect.WATER, 2), new ItemStack(BlocksTAR.MITHRILLIUM_SMELTER), "bsb", "mcm", "mmm", 'b', "plateBrass", 's', BlocksTC.smelterVoid, 'm', ItemsTAR.MITHRILLIUM_PLATE, 'c', BlocksTC.metalAlchemicalAdvanced);
        addShapedArcaneRecipe("adaminite_smelter", "TAR_ADAMINITE_SMELTER", 600, new AspectList().add(Aspect.FIRE, 12).add(Aspect.WATER, 6), new ItemStack(BlocksTAR.ADAMINITE_SMELTER), "bsb", "mcm", "mmm", 'b', "plateBrass", 's', BlocksTAR.MITHRILLIUM_SMELTER, 'm', ItemsTAR.ADAMINITE_PLATE, 'c', BlocksTC.metalAlchemicalAdvanced);
        addShapedArcaneRecipe("mithminite_smelter", "TAR_MITHMINITE_SMELTER", 750, new AspectList().add(Aspect.FIRE, 24).add(Aspect.WATER, 12), new ItemStack(BlocksTAR.MITHMINITE_SMELTER), "bsb", "mcm", "mmm", 'b', "plateBrass", 's', BlocksTAR.ADAMINITE_SMELTER, 'm', ItemsTAR.MITHMINITE_PLATE, 'c', BlocksTC.metalAlchemicalAdvanced);

    }

    private static void crucible()
    {
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
