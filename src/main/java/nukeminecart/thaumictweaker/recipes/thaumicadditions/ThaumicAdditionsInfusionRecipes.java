package nukeminecart.thaumictweaker.recipes.thaumicadditions;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import nukeminecart.thaumictweaker.recipes.api.RecipeApi;
import org.zeith.thaumicadditions.init.ItemsTAR;
import org.zeith.thaumicadditions.init.KnowledgeTAR;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.blocks.BlocksTC;
import thaumcraft.api.items.ItemsTC;

public class ThaumicAdditionsInfusionRecipes {
    public static void initializeInfusionRecipes() {
        Ingredient primordialPearl = Ingredient.fromItem(ItemsTC.primordialPearl);
        
        RecipeApi.changeInfusionRecipe(new ResourceLocation( "thaumadditions","mithrillium_ingot"), new AspectList().add(Aspect.CRYSTAL, 30).add(Aspect.ENERGY, 20).add(Aspect.ELDRITCH, 10).add(Aspect.METAL, 30).add(Aspect.MAGIC, 10), new Object[]{new ItemStack(ItemsTC.quicksilver), new ItemStack(ItemsTC.salisMundus), new ItemStack(ItemsTC.quicksilver), new ItemStack(ItemsTC.salisMundus)});
        RecipeApi.changeInfusionRecipe(new ResourceLocation( "thaumadditions","adaminite_ingot"), new AspectList().add(Aspect.LIFE, 50).add(Aspect.ALCHEMY, 30).add(Aspect.EXCHANGE, 40).add(Aspect.METAL, 40).add(Aspect.SOUL, 60).add(Aspect.MAGIC, 50).add(KnowledgeTAR.DRACO, 10), new Object[]{ new ItemStack(Items.END_CRYSTAL), new ItemStack(ItemsTC.fabric), primordialPearl});
        RecipeApi.changeInfusionRecipe(new ResourceLocation( "thaumadditions","mithminite_ingot"),new AspectList().add(KnowledgeTAR.CAELES, 10).add(Aspect.METAL, 60).add(Aspect.LIFE, 90).add(Aspect.MAGIC, 60), new Object[]{new ItemStack(ItemsTAR.MITHRILLIUM_INGOT), new ItemStack(ItemsTC.quicksilver), new ItemStack(ItemsTAR.MITHRILLIUM_INGOT), new ItemStack(ItemsTC.quicksilver)});

        RecipeApi.changeInfusionRecipe(new ResourceLocation( "thaumadditions","mithrillium_resonator"), org.zeith.thaumicadditions.api.AspectUtil.primals(10).add(KnowledgeTAR.IMPERIUM, 10),new Object[]{ new ItemStack(ItemsTAR.MITHRILLIUM_PLATE), new ItemStack(ItemsTC.mechanismComplex)});

        RecipeApi.changeInfusionRecipe(new ResourceLocation( "thaumadditions","adaminite_sword"), new AspectList().add(KnowledgeTAR.DRACO, 20).add(Aspect.MAGIC, 70).add(Aspect.AVERSION, 150).add(KnowledgeTAR.INFERNUM, 90).add(Aspect.METAL, 60),new Object[]{ "plateAdaminite", "plateAdaminite", primordialPearl, "plateAdaminite"});

        RecipeApi.changeInfusionRecipe(new ResourceLocation( "thaumadditions","mithminite_scythe"), new AspectList().add(Aspect.AVERSION, 250).add(Aspect.TOOL, 150).add(Aspect.MAGIC, 100),new Object[]{ new ItemStack(ItemsTAR.MITHMINITE_BLADE), new ItemStack(ItemsTAR.MITHMINITE_PLATE), new ItemStack(ItemsTAR.MITHMINITE_HANDLE)});
        RecipeApi.changeInfusionRecipe(new ResourceLocation( "thaumadditions","mithminite_blade"), new AspectList().add(Aspect.AVERSION, 150).add(KnowledgeTAR.INFERNUM, 50),new Object[]{ new ItemStack(ItemsTAR.MITHMINITE_PLATE), new ItemStack(ItemsTAR.MITHMINITE_PLATE), new ItemStack(ItemsTAR.MITHRILLIUM_RESONATOR)});
        RecipeApi.changeInfusionRecipe(new ResourceLocation( "thaumadditions","mithminite_handle"), new AspectList().add(Aspect.TOOL, 100).add(Aspect.SOUL, 75),new Object[]{ new ItemStack(ItemsTAR.MITHMINITE_PLATE), new ItemStack(ItemsTAR.MITHMINITE_INGOT)});

        RecipeApi.changeInfusionRecipe(new ResourceLocation( "thaumadditions","aura_disperser"), new AspectList().add(KnowledgeTAR.FLUCTUS, 30).add(Aspect.AURA, 10).add(Aspect.ALCHEMY, 20).add(KnowledgeTAR.VENTUS, 50),new Object[]{ new ItemStack(ItemsTC.mechanismComplex), org.zeith.thaumicadditions.api.AspectUtil.salt(Aspect.AURA), org.zeith.thaumicadditions.api.AspectUtil.salt(Aspect.ALCHEMY), new ItemStack(BlocksTC.shimmerleaf), new ItemStack(ItemsTC.morphicResonator), org.zeith.thaumicadditions.api.AspectUtil.salt(KnowledgeTAR.FLUCTUS), "nitor"});

        RecipeApi.changeInfusionRecipe(new ResourceLocation( "thaumadditions","crystal_crusher"), new AspectList().add(Aspect.CRAFT, 20).add(KnowledgeTAR.EXITIUM, 20).add(Aspect.TOOL, 20),new Object[]{ org.zeith.thaumicadditions.api.AspectUtil.crystalEssence(Aspect.AIR), org.zeith.thaumicadditions.api.AspectUtil.crystalEssence(Aspect.EARTH), org.zeith.thaumicadditions.api.AspectUtil.crystalEssence(Aspect.FIRE), org.zeith.thaumicadditions.api.AspectUtil.crystalEssence(Aspect.WATER), org.zeith.thaumicadditions.api.AspectUtil.crystalEssence(Aspect.ORDER), org.zeith.thaumicadditions.api.AspectUtil.crystalEssence(Aspect.ENTROPY), new ItemStack(ItemsTC.plate, 1, 2), new ItemStack(ItemsTC.plate, 1, 2), new ItemStack(ItemsTC.plate, 1, 2), new ItemStack(BlocksTC.slabArcaneStone), new ItemStack(ItemsTAR.SALT_ESSENCE)});

        RecipeApi.changeInfusionRecipe(new ResourceLocation( "thaumadditions","enchanted_golden_apple"), new AspectList().add(Aspect.DESIRE, 10).add(Aspect.LIFE, 5).add(KnowledgeTAR.VISUM, 20),new Object[]{ new ItemStack(Blocks.GOLD_BLOCK), new ItemStack(Blocks.GOLD_BLOCK), new ItemStack(Blocks.GOLD_BLOCK), new ItemStack(Blocks.GOLD_BLOCK), new ItemStack(Blocks.GOLD_BLOCK), new ItemStack(Blocks.GOLD_BLOCK), new ItemStack(Blocks.GOLD_BLOCK), new ItemStack(Blocks.GOLD_BLOCK)});

        RecipeApi.changeInfusionRecipe(new ResourceLocation( "thaumadditions","growth_chamber"), new AspectList().add(Aspect.ORDER, 20).add(Aspect.MECHANISM, 15).add(KnowledgeTAR.IMPERIUM, 10),new Object[]{ ItemsTC.amber, new ItemStack(ItemsTC.plate, 1, 2), ItemsTC.morphicResonator, new ItemStack(ItemsTC.plate, 1, 2), ItemsTC.visResonator, new ItemStack(ItemsTC.plate, 1, 2), ItemsTC.mechanismSimple, new ItemStack(ItemsTC.plate, 1, 2)});
        RecipeApi.changeInfusionRecipe(new ResourceLocation( "thaumadditions","chester"), new AspectList().add(KnowledgeTAR.IMPERIUM, 80).add(Aspect.LIFE, 40).add(Aspect.VOID, 20).add(Aspect.MECHANISM, 10),new Object[]{ new ItemStack(BlocksTC.plankGreatwood), "ingotThaumium", new ItemStack(BlocksTC.plankGreatwood), new ItemStack(ItemsTC.brain), new ItemStack(BlocksTC.plankGreatwood), new ItemStack(ItemsTC.morphicResonator), "ingotThaumium"});

        RecipeApi.changeInfusionRecipe(new ResourceLocation( "thaumadditions","wormhole_mirror"), new AspectList().add(Aspect.ELDRITCH, 50).add(KnowledgeTAR.IMPERIUM, 50).add(KnowledgeTAR.VISUM, 40), new Object[]{new ItemStack(ItemsTAR.VOID_THAUMOMETER), new ItemStack(ItemsTC.plate, 1, 3), new ItemStack(ItemsTC.plate, 1, 3)});
        RecipeApi.changeInfusionRecipe(new ResourceLocation( "thaumadditions","void_elemental_hoe"), new AspectList().add(Aspect.ELDRITCH, 40).add(Aspect.PLANT, 80).add(Aspect.METAL, 200), new Object[]{primordialPearl, new ItemStack(ItemsTC.plate, 1, 3), new ItemStack(ItemsTC.plate, 1, 3)});
        RecipeApi.changeInfusionRecipe(new ResourceLocation( "thaumadditions","void_elemental_shovel"), new AspectList().add(Aspect.ELDRITCH, 40).add(Aspect.EARTH, 80).add(Aspect.METAL, 200), new Object[]{primordialPearl, new ItemStack(ItemsTC.plate, 1, 3), new ItemStack(ItemsTC.plate, 1, 3)});
        RecipeApi.changeInfusionRecipe(new ResourceLocation( "thaumadditions","void_elemental_axe"),new AspectList().add(Aspect.ELDRITCH, 40).add(Aspect.ENTROPY, 80).add(Aspect.METAL, 200), new Object[]{primordialPearl, new ItemStack(ItemsTC.plate, 1, 3), new ItemStack(ItemsTC.plate, 1, 3)});
        RecipeApi.changeInfusionRecipe(new ResourceLocation( "thaumadditions","void_elemental_pickaxe"), new AspectList().add(Aspect.ELDRITCH, 40).add(Aspect.FIRE, 80).add(Aspect.METAL, 200).add(Aspect.SENSES, 50), new Object[]{primordialPearl, new ItemStack(ItemsTC.plate, 1, 3), new ItemStack(ItemsTC.plate, 1, 3)});

        RecipeApi.changeInfusionRecipe(new ResourceLocation( "thaumadditions","void_crop"), org.zeith.thaumicadditions.api.AspectUtil.primals(20).add(Aspect.DARKNESS, 50).add(KnowledgeTAR.CAELES, 5), new Object[]{primordialPearl, new ItemStack(ItemsTC.voidSeed), new ItemStack(ItemsTC.salisMundus)});
        RecipeApi.changeInfusionRecipe(new ResourceLocation( "thaumadditions","shadow_enchanter"), org.zeith.thaumicadditions.api.AspectUtil.primals(100).add(Aspect.MIND, 300), new Object[]{new ItemStack(ItemsTAR.MITHRILLIUM_PLATE), "ingotThaumium", new ItemStack(ItemsTAR.MITHRILLIUM_RESONATOR), new ItemStack(ItemsTC.mechanismComplex), new ItemStack(ItemsTAR.MITHRILLIUM_PLATE), "ingotThaumium", new ItemStack(ItemsTAR.DISENCHANT_FABRIC)});
        RecipeApi.changeInfusionRecipe(new ResourceLocation( "thaumadditions","shadow_beam_staff"), org.zeith.thaumicadditions.api.AspectUtil.primals(50).add(Aspect.ELDRITCH, 200).add(KnowledgeTAR.DRACO, 50), new Object[]{new ItemStack(ItemsTAR.MITHRILLIUM_PLATE), "plateIron", new ItemStack(ItemsTAR.MITHRILLIUM_PLATE), "plateIron", new ItemStack(ItemsTAR.MITHRILLIUM_PLATE), "plateIron"});
        RecipeApi.changeInfusionRecipe(new ResourceLocation( "thaumadditions","void_anvil"), new AspectList().add(Aspect.ELDRITCH, 100).add(KnowledgeTAR.CAELES, 10), new Object[]{new ItemStack(ItemsTC.plate, 1, 3), new ItemStack(ItemsTC.plate, 1, 3), new ItemStack(BlocksTC.metalBlockVoid), new ItemStack(ItemsTC.plate, 1, 3), new ItemStack(ItemsTC.plate, 1, 3),new ItemStack(ItemsTC.plate, 1, 3), new ItemStack(ItemsTC.plate, 1, 3), new ItemStack(ItemsTC.plate, 1, 3), new ItemStack(ItemsTC.plate, 1, 3), new ItemStack(ItemsTC.plate, 1, 3), new ItemStack(ItemsTC.plate, 1, 3), new ItemStack(BlocksTC.metalBlockVoid)});
        RecipeApi.changeInfusionRecipe(new ResourceLocation( "thaumadditions","the_beheader"), new AspectList().add(Aspect.UNDEAD, 100).add(Aspect.ENTROPY, 70).add(Aspect.MAGIC, 85).add(Aspect.AVERSION, 120).add(Aspect.DEATH, 70), new Object[]{new ItemStack(ItemsTAR.MITHRILLIUM_PLATE), new ItemStack(Items.SKULL, 1, 1), new ItemStack(ItemsTAR.MITHRILLIUM_PLATE), new ItemStack(ItemsTC.plate, 1, 2), new ItemStack(ItemsTAR.MITHRILLIUM_PLATE)});


    }
}
