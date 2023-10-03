package nukeminecart.thaumictweaker.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import nukeminecart.thaumictweaker.ItemsTT;
import nukeminecart.thaumictweaker.ModConfig;
import nukeminecart.thaumictweaker.recipes.api.RecipeApi;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.blocks.BlocksTC;
import thaumcraft.api.crafting.ShapedArcaneRecipe;
import thaumcraft.api.items.ItemsTC;
import thaumcraft.common.lib.crafting.ShapedArcaneVoidJar;

public class ArcaneRecipies {
    static ResourceLocation defaultGroup = new ResourceLocation("");

    public static void initializeArcaneRecipes() {
        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumcraft:mechanism_simple"),new AspectList().add(Aspect.FIRE, 2).add(Aspect.WATER, 1),new Object[]{ " B ", "ISI", " B ", 'B', "plateBrass", 'I', "plateIron", 'S', ItemsTT.greatwoodStick});
        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumcraft:mechanism_complex"),50, (new AspectList()).add(Aspect.FIRE, 5).add(Aspect.WATER, 2),new Object[]{ " S ", "TMT", " Q ", 'T', "plateThaumium", 'Q', Blocks.PISTON, 'M', new ItemStack(ItemsTC.mechanismSimple),'S', BlocksTC.plankGreatwood});

        RecipeApi.changeShapelessArcaneRecipe(new ResourceLocation("thaumcraft:vis_resonator"),50, (new AspectList()).add(Aspect.AIR, 1).add(Aspect.WATER, 1), "plateIron", "gemQuartz", "gemQuartz");
        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumcraft:sanitychecker"),20, (new AspectList()).add(Aspect.ORDER, 2).add(Aspect.ENTROPY, 1),new Object[]{  "NN ", "MBN", "NN ", 'N', "nuggetBrass", 'B', new ItemStack(ItemsTC.brain), 'M', new ItemStack(ItemsTC.mirroredGlass)});
        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumcraft:workbenchcharger"),100,new Object[]{" R ", "W W", "I I", 'I', "ingotIron", 'R', new ItemStack(ItemsTC.visResonator), 'W', new ItemStack(BlocksTC.plankGreatwood)});

        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumcraft:wand_workbench"),75, (new AspectList()).add(Aspect.EARTH, 2).add(Aspect.WATER, 1),new Object[]{  "GSG", "BRB", "ITI", 'S', new ItemStack(BlocksTC.slabArcaneStone), 'T', new ItemStack(BlocksTC.tableStone), 'R', new ItemStack(ItemsTC.visResonator), 'B', new ItemStack(BlocksTC.stoneArcane), 'G', "ingotGold", 'I', "plateIron"});
        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumcraft:caster_basic"),100,new Object[]{ "III", "LRL", "LTL", 'T', new ItemStack(Blocks.IRON_BARS), 'R', new ItemStack(ItemsTC.visResonator), 'L', "leather", 'I', "ingotIron"});

        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumcraft:Goggles"),50,new Object[]{ "L L", "L L", "TGT", 'T', new ItemStack(ItemsTC.thaumometer), 'G', "ingotBrass", 'L', "leather"});
        RecipeApi.changeShapelessArcaneRecipe(new ResourceLocation("thaumcraft:mirrorglass"), 50, (new AspectList()).add(Aspect.WATER, 1).add(Aspect.ORDER, 2), new ItemStack(ItemsTC.quicksilver), "paneGlass",new ItemStack(ItemsTC.quicksilver));
        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumcraft:Tube"), 10,new Object[]{ " Q ", "IGI", " B ", 'I', "plateIron", 'B', "nuggetBrass", 'G', new ItemStack(Blocks.GLASS_PANE), 'Q', "nuggetQuicksilver"});

        ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation("thaumcraft:JarVoid"), new ShapedArcaneVoidJar(defaultGroup, "WARDEDJARS", 25, (new AspectList()).add(Aspect.ENTROPY, 2), new ItemStack(BlocksTC.jarVoid), "J", 'J', new ItemStack(BlocksTC.jarNormal)));
        ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation("thaumictweaker:greatwood_stick"),new ShapedArcaneRecipe(defaultGroup,"BASEARTIFICE",1,(new AspectList()).add(Aspect.WATER, 1),new ItemStack(ItemsTT.greatwoodStick,4), "x", "x", 'x',new ItemStack(BlocksTC.plankGreatwood)));

        ResourceLocation bannerGroup = new ResourceLocation("thaumcraft", "banners");
        int a = 0;
        EnumDyeColor[] var3 = EnumDyeColor.values();

        for (EnumDyeColor d : var3) {
            ItemStack banner = new ItemStack(BlocksTC.banners.get(d));
            ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation("thaumcraft:Banner" + d.getDyeColorName().toLowerCase()), new ShapedArcaneRecipe(bannerGroup, "BASEINFUSION", 10, null, banner, " WS", "WWS", "WWB", 'W', new ItemStack(Blocks.WOOL, 1, a), 'S', ItemsTT.greatwoodStick, 'B', BlocksTC.plankGreatwood));
            ++a;
        }

        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumcraft:ArcaneLamp"), 50, (new AspectList()).add(Aspect.AIR, 1).add(Aspect.FIRE, 4),new Object[]{ " I ", "IAI", " I ", 'A', new ItemStack(BlocksTC.amberBlock), 'I', "plateIron"});
        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumcraft:Levitator"), 35,new Object[]{ "SIS", "BNB", "WGW", 'I', "plateThaumium", 'N', "nitor", 'W', "plankWood", 'B', "plateIron", 'G', new ItemStack(ItemsTC.mechanismSimple),'S',"slabWood"});

        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumcraft:InfusionMatrix"), 150,new Object[]{ "SDS", "DND", "SDS", 'S', new ItemStack(BlocksTC.stoneArcaneBrick), 'N', "nitor",'D', Items.DIAMOND});
        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumcraft:MatrixMotion"), 250, new Object[]{"SNS", "NGN", "SNS", 'S', new ItemStack(BlocksTC.stoneArcane), 'N', "plateThaumium", 'G', new ItemStack(Blocks.DIAMOND_BLOCK)});
        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumcraft:MatrixCost"), 250,new Object[]{"SAS", "AGA", "SAS", 'S', new ItemStack(BlocksTC.stoneArcane), 'A',"plateBrass", 'G', new ItemStack(Blocks.DIAMOND_BLOCK)});

        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumcraft:ArcanePedestal"), 10, (new AspectList()).add(Aspect.FIRE,2),new Object[]{ "SSS", " B ", "SSS", 'S', new ItemStack(BlocksTC.slabArcaneStone), 'B', new ItemStack(BlocksTC.stoneArcane)});
        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumcraft:AncientPedestal"), 150, (new AspectList()).add(Aspect.FIRE,2),new Object[]{ "SSS", " B ", "SSS", 'S', new ItemStack(BlocksTC.slabAncient), 'B', new ItemStack(BlocksTC.stoneAncient)});
        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumcraft:EldritchPedestal"), 150, (new AspectList()).add(Aspect.FIRE,2),new Object[]{ "SSS", " B ", "SSS", 'S', new ItemStack(BlocksTC.slabEldritch), 'B', new ItemStack(BlocksTC.stoneEldritchTile)});

        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumcraft:FocusPouch"), 25,new Object[]{ "LGL", "LBL", "LLL", 'B', new ItemStack(ItemsTC.baubles, 1, 2), 'L', "leather", 'G', new ItemStack(Items.DIAMOND)});
        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumcraft:HungryChest"), 15,new Object[]{ "WTW", "WCW", "WWW", 'W', new ItemStack(BlocksTC.plankGreatwood), 'T', "trapdoorWood",'C',new ItemStack(Blocks.CHEST)});
        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumcraft:MorphicResonator"), 50,new Object[]{ " S ", "BGB", " S ", 'G', "paneGlass", 'B', "plateBrass", 'S', new ItemStack(ItemsTC.nuggets, 1, 10)});

        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumcraft:Alembic"), 50, (new AspectList()).add(Aspect.WATER, 1).add(Aspect.EARTH,1),new Object[]{ "WFW", "SBS", "WFW", 'W', new ItemStack(BlocksTC.plankGreatwood), 'B', Items.BUCKET, 'F', new ItemStack(ItemsTC.filter), 'S', "plateBrass"});
        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumcraft:EssentiaSmelter"), 50,new Object[]{ "BCB", "BFB", "SSS", 'C', new ItemStack(BlocksTC.crucible), 'F', new ItemStack(Blocks.FURNACE), 'S', "cobblestone", 'B', "plateBrass"});
        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumcraft:AlchemicalConstruct"), 75,new Object[]{ "IVI", "TWT", "IBI", 'W', new ItemStack(BlocksTC.plankGreatwood), 'V', new ItemStack(ItemsTC.mechanismSimple), 'T', new ItemStack(BlocksTC.tube), 'I', "plateIron" ,'B', "plateBrass"});
        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumcraft:Bellows"), 25,new Object[]{ "WW ", "LLI", "WW ", 'W', "plankWood", 'I', "ingotBrass", 'L', "leather"});

        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumcraft:GrappleGunSpool"), 25,new Object[]{ "SHS", "SGS", "SBS", 'G', new ItemStack(ItemsTC.mechanismSimple), 'S', "string", 'H', new ItemStack(Blocks.TRIPWIRE_HOOK), 'B', "plateBrass"});
        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumcraft:GrappleGun"), 75,new Object[]{ "  S", "TII", " BW", 'B', "plateBrass", 'I', "plateIron", 'T', new ItemStack(ItemsTC.grappleGunTip), 'W', new ItemStack(BlocksTC.logGreatwood), 'S', new ItemStack(ItemsTC.grappleGunSpool)});

        RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumcraft:CondenserLattice"), 100,new Object[]{ " T ", "QFQ", " T ", 'T', "plateThaumium", 'F', new ItemStack(ItemsTC.filter), 'Q', "gemQuartz"});
        RecipeApi.changeShapelessArcaneRecipe(new ResourceLocation("thaumcraft:RedstoneInlay"), 12,new AspectList().add(Aspect.EARTH,1).add(Aspect.FIRE,2), "dustRedstone", "ingotGold");
        //Thaumic Additions
        if(ModConfig.ISTHAUMICADDITIONS) {
            RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumadditions", "dna_sample"), 100, new Object[]{"tmt", "rpr", "tmt", 'r', ItemsTC.mechanismSimple, 't', "ingotThaumium", 'm', ItemsTC.morphicResonator, 'p', "plateThaumium"});

            RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumadditions", "brass_jar"), 7, new Object[]{"p", "j", 'p', "plateBrass", 'j', BlocksTC.jarNormal});
            RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumadditions", "thaumium_jar"), 15, new Object[]{"p", "j", 'p', new ItemStack(ItemsTC.plate, 1, 2), 'j', org.zeith.thaumicadditions.init.BlocksTAR.BRASS_JAR});
            RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumadditions", "eldritch_jar"), 150, new Object[]{"p", "j", 'p', new ItemStack(ItemsTC.plate, 1, 3), 'j', org.zeith.thaumicadditions.init.BlocksTAR.THAUMIUM_JAR});
            RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumadditions", "mithrillium_jar"), 750, new Object[]{"p", "j", 'p', new ItemStack(org.zeith.thaumicadditions.init.ItemsTAR.MITHRILLIUM_PLATE), 'j', org.zeith.thaumicadditions.init.BlocksTAR.ELDRITCH_JAR});
            RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumadditions", "adaminite_jar"), 1000, new Object[]{"p", "j", 'p', new ItemStack(org.zeith.thaumicadditions.init.ItemsTAR.ADAMINITE_PLATE), 'j', org.zeith.thaumicadditions.init.BlocksTAR.MITHRILLIUM_JAR});

            RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumadditions", "adaminite_fabric"), 200, new Object[]{" f ", "faf", " f ", 'f', new ItemStack(ItemsTC.fabric), 'a', new ItemStack(org.zeith.thaumicadditions.init.ItemsTAR.ADAMINITE_INGOT)});
            RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumadditions", "adaminite_hood"), 200, new Object[]{"fff", "fmf", 'f', new ItemStack(org.zeith.thaumicadditions.init.ItemsTAR.ADAMINITE_FABRIC), 'm', new ItemStack(ItemsTC.voidRobeHelm)});
            RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumadditions", "adaminite_robe"), 200, new Object[]{"f f", "fmf", "fff", 'f', new ItemStack(org.zeith.thaumicadditions.init.ItemsTAR.ADAMINITE_FABRIC), 'm', new ItemStack(ItemsTC.voidRobeChest)});
            RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumadditions", "adaminite_belt"), 200, new Object[]{" f ", "fmf", 'f', new ItemStack(org.zeith.thaumicadditions.init.ItemsTAR.ADAMINITE_FABRIC), 'm', new ItemStack(ItemsTC.voidRobeLegs)});
            RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumadditions", "adaminite_boots"), 200, new Object[]{"f f", "fmf", 'f', new ItemStack(org.zeith.thaumicadditions.init.ItemsTAR.ADAMINITE_FABRIC), 'm', new ItemStack(thecodex6824.thaumicaugmentation.api.TAItems.VOID_BOOTS)});

            RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumadditions", "mithminite_fabric"), 400, new Object[]{" a ", "ama", " a ", 'm', new ItemStack(org.zeith.thaumicadditions.init.ItemsTAR.MITHMINITE_INGOT), 'a', new ItemStack(org.zeith.thaumicadditions.init.ItemsTAR.ADAMINITE_FABRIC)});
            RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumadditions", "mithrillium_smelter"), 500, new Object[]{"bsb", "mcm", "mmm", 'b', "plateBrass", 's', BlocksTC.smelterVoid, 'm', org.zeith.thaumicadditions.init.ItemsTAR.MITHRILLIUM_PLATE, 'c', BlocksTC.metalAlchemicalAdvanced});
            RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumadditions", "adaminite_smelter"), 600, new Object[]{"bsb", "mcm", "mmm", 'b', "plateBrass", 's', org.zeith.thaumicadditions.init.BlocksTAR.MITHRILLIUM_SMELTER, 'm', org.zeith.thaumicadditions.init.ItemsTAR.ADAMINITE_PLATE, 'c', BlocksTC.metalAlchemicalAdvanced});
            RecipeApi.changeShapedArcaneRecipe(new ResourceLocation("thaumadditions", "mithminite_smelter"), 750, new Object[]{"bsb", "mcm", "mmm", 'b', "plateBrass", 's', org.zeith.thaumicadditions.init.BlocksTAR.ADAMINITE_SMELTER, 'm', org.zeith.thaumicadditions.init.ItemsTAR.MITHMINITE_PLATE, 'c', BlocksTC.metalAlchemicalAdvanced});
        }
    }
}
