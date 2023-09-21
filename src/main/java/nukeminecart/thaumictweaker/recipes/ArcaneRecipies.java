package nukeminecart.thaumictweaker.recipes;

import nukeminecart.thaumictweaker.ItemsTT;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.blocks.BlocksTC;
import thaumcraft.api.crafting.ShapedArcaneRecipe;
import thaumcraft.api.crafting.ShapelessArcaneRecipe;
import thaumcraft.api.items.ItemsTC;
import thaumcraft.common.lib.crafting.ShapedArcaneVoidJar;


public class ArcaneRecipies {
    static ResourceLocation defaultGroup = new ResourceLocation("");

    public static void initializeArcaneRecipes() {
        ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation("thaumcraft:mechanism_simple"), new ShapedArcaneRecipe(defaultGroup, "BASEARTIFICE", 10, (new AspectList()).add(Aspect.FIRE, 2).add(Aspect.WATER, 1), ItemsTC.mechanismSimple, " B ", "ISI", " B ", 'B', "plateBrass", 'I', "plateIron", 'S', ItemsTT.greatwoodStick));
        //RecipeApi.addShapedArcaneRecipe(new ResourceLocation("thaumcraft:mechanism_simple"),-1,new AspectList()," B ", "ISI", " B ", 'B', "plateBrass", 'I', "plateIron", 'S', ItemsTT.greatwoodStick);
        ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation("thaumcraft:mechanism_complex"), new ShapedArcaneRecipe(defaultGroup, "BASEARTIFICE", 50, (new AspectList()).add(Aspect.FIRE, 5).add(Aspect.WATER, 2), ItemsTC.mechanismComplex, " S ", "TMT", " Q ", 'T', "plateThaumium", 'Q', Blocks.PISTON, 'M', new ItemStack(ItemsTC.mechanismSimple),'S', BlocksTC.plankGreatwood));
        ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation("thaumcraft:vis_resonator"), new ShapelessArcaneRecipe(defaultGroup, "UNLOCKAUROMANCY@2", 50, (new AspectList()).add(Aspect.AIR, 1).add(Aspect.WATER, 1), ItemsTC.visResonator, "plateIron", "gemQuartz", "gemQuartz"));
        ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation("thaumcraft:sanitychecker"), new ShapedArcaneRecipe(defaultGroup, "WARP", 20, (new AspectList()).add(Aspect.ORDER, 2).add(Aspect.ENTROPY, 1), ItemsTC.sanityChecker, "NN ", "MBN", "NN ", 'N', "nuggetBrass", 'B', new ItemStack(ItemsTC.brain), 'M', new ItemStack(ItemsTC.mirroredGlass)));
        ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation("thaumcraft:workbenchcharger"), new ShapedArcaneRecipe(defaultGroup, "WORKBENCHCHARGER", 100, (new AspectList()).add(Aspect.AIR, 2).add(Aspect.ORDER, 2), new ItemStack(BlocksTC.arcaneWorkbenchCharger), " R ", "W W", "I I", 'I', "ingotIron", 'R', new ItemStack(ItemsTC.visResonator), 'W', new ItemStack(BlocksTC.plankGreatwood)));
        ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation("thaumcraft:wand_workbench"), new ShapedArcaneRecipe(defaultGroup, "BASEAUROMANCY@2", 75, (new AspectList()).add(Aspect.EARTH, 2).add(Aspect.WATER, 1), new ItemStack(BlocksTC.wandWorkbench), "GSG", "BRB", "ITI", 'S', new ItemStack(BlocksTC.slabArcaneStone), 'T', new ItemStack(BlocksTC.tableStone), 'R', new ItemStack(ItemsTC.visResonator), 'B', new ItemStack(BlocksTC.stoneArcane), 'G', "ingotGold", 'I', "plateIron"));
        ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation("thaumcraft:caster_basic"), new ShapedArcaneRecipe(defaultGroup, "UNLOCKAUROMANCY@2", 100, (new AspectList()).add(Aspect.AIR, 1).add(Aspect.EARTH, 1).add(Aspect.WATER, 1).add(Aspect.FIRE, 1).add(Aspect.ORDER, 1).add(Aspect.ENTROPY, 1), new ItemStack(ItemsTC.casterBasic), "III", "LRL", "LTL", 'T', new ItemStack(Blocks.IRON_BARS), 'R', new ItemStack(ItemsTC.visResonator), 'L', "leather", 'I', "ingotIron"));
        ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation("thaumcraft:Goggles"), new ShapedArcaneRecipe(defaultGroup, "UNLOCKARTIFICE", 50, null, new ItemStack(ItemsTC.goggles), "L L", "L L", "TGT", 'T', new ItemStack(ItemsTC.thaumometer), 'G', "ingotBrass", 'L', "leather"));
        ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation("thaumcraft:mirrorglass"), new ShapelessArcaneRecipe(defaultGroup, "BASEARTIFICE", 50, (new AspectList()).add(Aspect.WATER, 1).add(Aspect.ORDER, 2), new ItemStack(ItemsTC.mirroredGlass), new Object[]{new ItemStack(ItemsTC.quicksilver), "paneGlass",new ItemStack(ItemsTC.quicksilver)}));
        ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation("thaumcraft:Tube"), new ShapedArcaneRecipe(defaultGroup, "TUBES", 10, null, new ItemStack(BlocksTC.tube, 8, 0), " Q ", "IGI", " B ", 'I', "plateIron", 'B', "nuggetBrass", 'G', new ItemStack(Blocks.GLASS_PANE), 'Q', "nuggetQuicksilver"));
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
        ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation("thaumcraft:ArcaneLamp"), new ShapedArcaneRecipe(defaultGroup, "ARCANELAMP", 50, (new AspectList()).add(Aspect.AIR, 1).add(Aspect.FIRE, 4), new ItemStack(BlocksTC.lampArcane), " I ", "IAI", " I ", 'A', new ItemStack(BlocksTC.amberBlock), 'I', "plateIron"));
        ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation("thaumcraft:Levitator"), new ShapedArcaneRecipe(defaultGroup, "LEVITATOR", 35, (new AspectList()).add(Aspect.AIR, 1), new ItemStack(BlocksTC.levitator), "SIS", "BNB", "WGW", 'I', "plateThaumium", 'N', "nitor", 'W', "plankWood", 'B', "plateIron", 'G', new ItemStack(ItemsTC.mechanismSimple),'S',"slabWood"));
        ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation("thaumcraft:InfusionMatrix"), new ShapedArcaneRecipe(defaultGroup, "INFUSION@2", 150, (new AspectList()).add(Aspect.AIR, 1).add(Aspect.EARTH, 1).add(Aspect.WATER, 1).add(Aspect.FIRE, 1).add(Aspect.ORDER, 1).add(Aspect.ENTROPY, 1), new ItemStack(BlocksTC.infusionMatrix), "SDS", "DND", "SDS", 'S', new ItemStack(BlocksTC.stoneArcaneBrick), 'N', "nitor",'D', Items.DIAMOND));
        ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation("thaumcraft:MatrixMotion"), new ShapedArcaneRecipe(defaultGroup, "INFUSIONBOOST", 250, (new AspectList()).add(Aspect.AIR, 1).add(Aspect.ORDER, 1), new ItemStack(BlocksTC.matrixSpeed), "SNS", "NGN", "SNS", 'S', new ItemStack(BlocksTC.stoneArcane), 'N', "plateThaumium", 'G', new ItemStack(Blocks.DIAMOND_BLOCK)));
        ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation("thaumcraft:MatrixCost"), new ShapedArcaneRecipe(defaultGroup, "INFUSIONBOOST", 250, (new AspectList()).add(Aspect.AIR, 1).add(Aspect.WATER, 1).add(Aspect.ENTROPY, 1), new ItemStack(BlocksTC.matrixCost), "SAS", "AGA", "SAS", 'S', new ItemStack(BlocksTC.stoneArcane), 'A',"plateBrass", 'G', new ItemStack(Blocks.DIAMOND_BLOCK)));
        ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation("thaumcraft:ArcanePedestal"), new ShapedArcaneRecipe(defaultGroup, "INFUSION", 10, (new AspectList()).add(Aspect.FIRE,2), new ItemStack(BlocksTC.pedestalArcane), "SSS", " B ", "SSS", 'S', new ItemStack(BlocksTC.slabArcaneStone), 'B', new ItemStack(BlocksTC.stoneArcane)));
        ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation("thaumcraft:AncientPedestal"), new ShapedArcaneRecipe(defaultGroup, "INFUSIONANCIENT", 150, (new AspectList()).add(Aspect.FIRE,2), new ItemStack(BlocksTC.pedestalAncient), "SSS", " B ", "SSS", 'S', new ItemStack(BlocksTC.slabAncient), 'B', new ItemStack(BlocksTC.stoneAncient)));
        ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation("thaumcraft:EldritchPedestal"), new ShapedArcaneRecipe(defaultGroup, "INFUSIONELDRITCH", 150, (new AspectList()).add(Aspect.FIRE,2), new ItemStack(BlocksTC.pedestalEldritch), "SSS", " B ", "SSS", 'S', new ItemStack(BlocksTC.slabEldritch), 'B', new ItemStack(BlocksTC.stoneEldritchTile)));
        ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation("thaumcraft:FocusPouch"), new ShapedArcaneRecipe(defaultGroup, "FOCUSPOUCH", 25, new AspectList(), new ItemStack(ItemsTC.focusPouch), "LGL", "LBL", "LLL", 'B', new ItemStack(ItemsTC.baubles, 1, 2), 'L', "leather", 'G', new ItemStack(Items.DIAMOND)));
        ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation("thaumcraft:HungryChest"), new ShapedArcaneRecipe(defaultGroup, "HUNGRYCHEST", 15, (new AspectList()).add(Aspect.EARTH, 1).add(Aspect.WATER, 1), new ItemStack(BlocksTC.hungryChest), "WTW", "WCW", "WWW", 'W', new ItemStack(BlocksTC.plankGreatwood), 'T', "trapdoorWood",'C',new ItemStack(Blocks.CHEST)));
        ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation("thaumcraft:MorphicResonator"), new ShapedArcaneRecipe(defaultGroup, "BASEALCHEMY", 50, (new AspectList()).add(Aspect.AIR, 1).add(Aspect.FIRE, 1), new ItemStack(ItemsTC.morphicResonator), " S ", "BGB", " S ", 'G', "paneGlass", 'B', "plateBrass", 'S', new ItemStack(ItemsTC.nuggets, 1, 10)));
        ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation("thaumcraft:Alembic"), new ShapedArcaneRecipe(defaultGroup, "ESSENTIASMELTER", 50, (new AspectList()).add(Aspect.WATER, 1).add(Aspect.EARTH,1), new ItemStack(BlocksTC.alembic), "WFW", "SBS", "WFW", 'W', new ItemStack(BlocksTC.plankGreatwood), 'B', Items.BUCKET, 'F', new ItemStack(ItemsTC.filter), 'S', "plateBrass"));
        ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation("thaumcraft:EssentiaSmelter"), new ShapedArcaneRecipe(defaultGroup, "ESSENTIASMELTER@2", 50, (new AspectList()).add(Aspect.FIRE, 1), new ItemStack(BlocksTC.smelterBasic), "BCB", "BFB", "SSS", 'C', new ItemStack(BlocksTC.crucible), 'F', new ItemStack(Blocks.FURNACE), 'S', "cobblestone", 'B', "plateBrass"));
        ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation("thaumcraft:AlchemicalConstruct"), new ShapedArcaneRecipe(defaultGroup, "TUBES", 75, (new AspectList()).add(Aspect.WATER, 1).add(Aspect.ORDER, 1).add(Aspect.ENTROPY, 1), new ItemStack(BlocksTC.metalAlchemical, 2), "IVI", "TWT", "IBI", 'W', new ItemStack(BlocksTC.plankGreatwood), 'V', new ItemStack(ItemsTC.mechanismSimple), 'T', new ItemStack(BlocksTC.tube), 'I', "plateIron" ,'B', "plateBrass"));
        ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation("thaumcraft:Bellows"), new ShapedArcaneRecipe(defaultGroup, "BELLOWS", 25, (new AspectList()).add(Aspect.AIR, 1), new ItemStack(BlocksTC.bellows), "WW ", "LLI", "WW ", 'W', "plankWood", 'I', "ingotBrass", 'L', "leather"));
        ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation("thaumcraft:GrappleGunSpool"), new ShapedArcaneRecipe(defaultGroup, "GRAPPLEGUN", 25, (new AspectList()).add(Aspect.WATER, 1), new ItemStack(ItemsTC.grappleGunSpool), "SHS", "SGS", "SBS", 'G', new ItemStack(ItemsTC.mechanismSimple), 'S', "string", 'H', new ItemStack(Blocks.TRIPWIRE_HOOK), 'B', "plateBrass"));
        ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation("thaumcraft:GrappleGun"), new ShapedArcaneRecipe(defaultGroup, "GRAPPLEGUN", 75, (new AspectList()).add(Aspect.AIR, 1).add(Aspect.FIRE, 1), new ItemStack(ItemsTC.grappleGun), "  S", "TII", " BW", 'B', "plateBrass", 'I', "plateIron", 'T', new ItemStack(ItemsTC.grappleGunTip), 'W', new ItemStack(BlocksTC.logGreatwood), 'S', new ItemStack(ItemsTC.grappleGunSpool)));
        ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation("thaumcraft:CondenserLattice"), new ShapedArcaneRecipe(defaultGroup, "FLUXCLEANUP", 100, (new AspectList()).add(Aspect.EARTH, 3).add(Aspect.AIR, 3), new ItemStack(BlocksTC.condenserlattice), " T ", "QFQ", " T ", 'T', "plateThaumium", 'F', new ItemStack(ItemsTC.filter), 'Q', "gemQuartz"));
        ThaumcraftApi.addArcaneCraftingRecipe(new ResourceLocation("thaumcraft:RedstoneInlay"), new ShapelessArcaneRecipe(defaultGroup, "INFUSIONSTABLE", 12, (new AspectList()).add(Aspect.WATER, 1), new ItemStack(BlocksTC.inlay, 1), new Object[]{"dustRedstone", "ingotGold"}));
    }
}
