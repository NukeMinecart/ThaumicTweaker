package nukeminecart.thaumictweaker.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.nbt.NBTTagByte;
import net.minecraft.nbt.NBTTagInt;
import net.minecraft.util.ResourceLocation;
import nukeminecart.thaumictweaker.ItemsTT;
import nukeminecart.thaumictweaker.ModConfig;
import nukeminecart.thaumictweaker.recipes.api.RecipeApi;
import nukeminecart.thaumictweaker.recipes.api.RunicInfusionRecipe;
import nukeminecart.thaumictweaker.recipes.voidarmor.VoidRobeChest;
import nukeminecart.thaumictweaker.recipes.voidarmor.VoidRobeHelm;
import nukeminecart.thaumictweaker.recipes.voidarmor.VoidRobeLegs;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.ThaumcraftApiHelper;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.blocks.BlocksTC;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.crafting.IngredientNBTTC;
import thaumcraft.api.items.ItemsTC;
import thaumcraft.common.config.ConfigItems;
import thaumcraft.common.lib.crafting.InfusionEnchantmentRecipe;
import thaumcraft.common.lib.enchantment.EnumInfusionEnchantment;

public class InfusionRecipes {
    public static void initializeInfusionRecipes() {
        //Thaumcraft
        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:CrystalClusterAir"), new AspectList().add(Aspect.AIR, 10).add(Aspect.CRYSTAL, 5),new Object[]{ new ItemStack(Items.WHEAT_SEEDS), new ItemStack(ItemsTC.salisMundus)});
        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:CrystalClusterFire"), new AspectList().add(Aspect.FIRE, 10).add(Aspect.CRYSTAL, 5),new Object[]{ new ItemStack(Items.WHEAT_SEEDS), new ItemStack(ItemsTC.salisMundus)});
        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:CrystalClusterWater"), new AspectList().add(Aspect.WATER, 10).add(Aspect.CRYSTAL, 5),new Object[]{ new ItemStack(Items.WHEAT_SEEDS), new ItemStack(ItemsTC.salisMundus)});
        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:CrystalClusterEarth"), new AspectList().add(Aspect.EARTH, 10).add(Aspect.CRYSTAL, 5),new Object[]{ new ItemStack(Items.WHEAT_SEEDS), new ItemStack(ItemsTC.salisMundus)});
        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:CrystalClusterOrder"), new AspectList().add(Aspect.ORDER, 10).add(Aspect.CRYSTAL, 5),new Object[]{ new ItemStack(Items.WHEAT_SEEDS), new ItemStack(ItemsTC.salisMundus)});
        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:CrystalClusterEntropy"), new AspectList().add(Aspect.ENTROPY, 10).add(Aspect.CRYSTAL, 10),new Object[]{ new ItemStack(Items.WHEAT_SEEDS), new ItemStack(ItemsTC.salisMundus)});
        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:CrystalClusterFlux"), new AspectList().add(Aspect.FLUX, 10).add(Aspect.CRYSTAL, 10),new Object[]{ new ItemStack(Items.WHEAT_SEEDS), new ItemStack(ItemsTC.salisMundus)});
        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:focus_2"), new AspectList().add(Aspect.MAGIC, 50).add(Aspect.ORDER, 50),new Object[]{ new ItemStack(ItemsTC.quicksilver), "gemDiamond", new ItemStack(ItemsTC.mirroredGlass), new ItemStack(Items.ENDER_EYE)});
        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:VisAmulet"), new AspectList().add(Aspect.AURA, 100).add(Aspect.ENERGY, 200).add(Aspect.VOID, 100),new Object[]{ new ItemStack(ItemsTC.visResonator), ThaumcraftApiHelper.makeCrystal(Aspect.AIR), ThaumcraftApiHelper.makeCrystal(Aspect.FIRE), ThaumcraftApiHelper.makeCrystal(Aspect.WATER), ThaumcraftApiHelper.makeCrystal(Aspect.EARTH), ThaumcraftApiHelper.makeCrystal(Aspect.ORDER)});
        RunicInfusionRecipe ra = new RunicInfusionRecipe();
        ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("thaumcraft:RunicArmor"), ra);

        ItemStack in;
        ItemStack in1;
        for(int a = 0; a < 3; ++a) {
            in = new ItemStack(ItemsTC.baubles, 1, 1);
            in1 = new ItemStack(ItemsTC.baubles, 1, 1);
            if (a > 0) {
                in.setTagInfo("TC.RUNIC", new NBTTagByte((byte)a));

            }
            in1.setTagInfo("TC.RUNIC", new NBTTagByte((byte)(a+1)));
            ThaumcraftApi.addFakeCraftingRecipe(new ResourceLocation("thaumcraft:RunicArmorFake" + a), new RunicInfusionRecipe(in,in1,a));
        }
        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:Mirror"),new AspectList().add(Aspect.MOTION, 50).add(Aspect.DARKNESS, 10).add(Aspect.EXCHANGE, 25),new Object[]{ new ItemStack(ItemsTC.mirroredGlass), "ingotGold", "plateThaumium", "ingotGold", new ItemStack(Items.ENDER_PEARL)});
        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:MirrorHand"),new AspectList().add(Aspect.TOOL, 50).add(Aspect.MOTION, 75),new Object[]{ new ItemStack(ItemsTT.greatwoodStick), new ItemStack(Items.COMPASS), new ItemStack(Items.MAP)});
        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:MirrorEssentia"),new AspectList().add(Aspect.MOTION, 75).add(Aspect.WATER, 25).add(Aspect.EXCHANGE, 50),new Object[]{ new ItemStack(ItemsTC.mirroredGlass), "plateIron", "plateIron", "plateIron", new ItemStack(Items.ENDER_PEARL)});
        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:ElementalAxe"),new AspectList().add(Aspect.WATER, 120).add(Aspect.PLANT, 60), new Object[]{ConfigItems.WATER_CRYSTAL, ConfigItems.WATER_CRYSTAL, new ItemStack(ItemsTC.morphicResonator), new ItemStack(BlocksTC.plankGreatwood)});
        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:ElementalPick"),new AspectList().add(Aspect.FIRE, 60).add(Aspect.METAL, 60).add(Aspect.SENSES, 30),new Object[]{ ConfigItems.FIRE_CRYSTAL, ConfigItems.FIRE_CRYSTAL, new ItemStack(ItemsTC.morphicResonator), new ItemStack(BlocksTC.plankGreatwood)});
        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:ElementalSword"),new AspectList().add(Aspect.AIR, 60).add(Aspect.MOTION, 60).add(Aspect.AVERSION, 30),new Object[]{ ConfigItems.AIR_CRYSTAL, ConfigItems.AIR_CRYSTAL, new ItemStack(ItemsTC.morphicResonator), new ItemStack(BlocksTC.plankGreatwood)});
        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:ElementalShovel"),new AspectList().add(Aspect.EARTH, 120).add(Aspect.CRAFT, 60),new Object[]{ ConfigItems.EARTH_CRYSTAL, ConfigItems.EARTH_CRYSTAL, new ItemStack(ItemsTC.morphicResonator), new ItemStack(BlocksTC.plankGreatwood)});
        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:ElementalHoe"),new AspectList().add(Aspect.ORDER, 60).add(Aspect.PLANT, 30).add(Aspect.ENTROPY, 30),new Object[]{ ConfigItems.ORDER_CRYSTAL, ConfigItems.ENTROPY_CRYSTAL, new ItemStack(ItemsTC.morphicResonator), new ItemStack(BlocksTC.plankGreatwood)});

        InfusionEnchantmentRecipe IEBURROWING = new InfusionEnchantmentRecipe(EnumInfusionEnchantment.BURROWING, (new AspectList()).add(Aspect.SENSES, 80).add(Aspect.EARTH, 150).add(Aspect.TOOL,50), new IngredientNBTTC(new ItemStack(Items.ENCHANTED_BOOK)), new ItemStack(Items.RABBIT_FOOT));
        ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("thaumcraft:IEBURROWING"), IEBURROWING);
        ThaumcraftApi.addFakeCraftingRecipe(new ResourceLocation("thaumcraft:IEBURROWINGFAKE"), new InfusionEnchantmentRecipe(IEBURROWING, new ItemStack(Items.WOODEN_PICKAXE)));

        InfusionEnchantmentRecipe IECOLLECTOR = new InfusionEnchantmentRecipe(EnumInfusionEnchantment.COLLECTOR, (new AspectList()).add(Aspect.DESIRE, 120).add(Aspect.WATER, 100).add(Aspect.VOID,75), new IngredientNBTTC(new ItemStack(Items.ENCHANTED_BOOK)), new ItemStack(Items.LEAD));
        ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("thaumcraft:IECOLLECTOR"), IECOLLECTOR);
        ThaumcraftApi.addFakeCraftingRecipe(new ResourceLocation("thaumcraft:IECOLLECTORFAKE"), new InfusionEnchantmentRecipe(IECOLLECTOR, new ItemStack(Items.STONE_AXE)));

        InfusionEnchantmentRecipe IEDESTRUCTIVE = new InfusionEnchantmentRecipe(EnumInfusionEnchantment.DESTRUCTIVE, (new AspectList()).add(Aspect.AVERSION, 200).add(Aspect.ENTROPY, 250).add(Aspect.TOOL,75).add(Aspect.ENERGY,50), new IngredientNBTTC(new ItemStack(Items.ENCHANTED_BOOK)), new ItemStack(Blocks.TNT));
        ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("thaumcraft:IEDESTRUCTIVE"), IEDESTRUCTIVE);
        ThaumcraftApi.addFakeCraftingRecipe(new ResourceLocation("thaumcraft:IEDESTRUCTIVEFAKE"), new InfusionEnchantmentRecipe(IEDESTRUCTIVE, new ItemStack(Items.STONE_PICKAXE)));

        InfusionEnchantmentRecipe IEREFINING = new InfusionEnchantmentRecipe(EnumInfusionEnchantment.REFINING, (new AspectList()).add(Aspect.ORDER, 40).add(Aspect.EXCHANGE, 60).add(Aspect.METAL,80), new IngredientNBTTC(new ItemStack(Items.ENCHANTED_BOOK)), new ItemStack(ItemsTC.salisMundus));
        ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("thaumcraft:IEREFINING"), IEREFINING);
        ThaumcraftApi.addFakeCraftingRecipe(new ResourceLocation("thaumcraft:IEREFININGFAKE"), new InfusionEnchantmentRecipe(IEREFINING, new ItemStack(Items.IRON_PICKAXE)));

        InfusionEnchantmentRecipe IESOUNDING = new InfusionEnchantmentRecipe(EnumInfusionEnchantment.SOUNDING, (new AspectList()).add(Aspect.SENSES, 80).add(Aspect.FIRE, 60).add(Aspect.LIGHT,50), new IngredientNBTTC(new ItemStack(Items.ENCHANTED_BOOK)), new ItemStack(Items.MAP));
        ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("thaumcraft:IESOUNDING"), IESOUNDING);
        ThaumcraftApi.addFakeCraftingRecipe(new ResourceLocation("thaumcraft:IESOUNDINGFAKE"), new InfusionEnchantmentRecipe(IESOUNDING, new ItemStack(Items.GOLDEN_PICKAXE)));

        InfusionEnchantmentRecipe IEARCING = new InfusionEnchantmentRecipe(EnumInfusionEnchantment.ARCING, (new AspectList()).add(Aspect.ENERGY, 40).add(Aspect.AIR, 60).add(Aspect.AVERSION,70), new IngredientNBTTC(new ItemStack(Items.ENCHANTED_BOOK)), new ItemStack(Blocks.REDSTONE_BLOCK));
        ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("thaumcraft:IEARCING"), IEARCING);
        ThaumcraftApi.addFakeCraftingRecipe(new ResourceLocation("thaumcraft:IEARCINGFAKE"), new InfusionEnchantmentRecipe(IEARCING, new ItemStack(Items.WOODEN_SWORD)));

        InfusionEnchantmentRecipe IEESSENCE = new InfusionEnchantmentRecipe(EnumInfusionEnchantment.ESSENCE, (new AspectList()).add(Aspect.BEAST, 40).add(Aspect.FLUX, 60).add(Aspect.MAGIC,30), new IngredientNBTTC(new ItemStack(Items.ENCHANTED_BOOK)), new ItemStack(ItemsTC.crystalEssence));
        ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("thaumcraft:IEESSENCE"), IEESSENCE);
        ThaumcraftApi.addFakeCraftingRecipe(new ResourceLocation("thaumcraft:IEESSENCEFAKE"), new InfusionEnchantmentRecipe(IEESSENCE, new ItemStack(Items.STONE_SWORD)));

        InfusionEnchantmentRecipe IELAMPLIGHT = new InfusionEnchantmentRecipe(EnumInfusionEnchantment.LAMPLIGHT, (new AspectList()).add(Aspect.LIGHT, 80).add(Aspect.AIR, 20).add(Aspect.MAGIC,25), new IngredientNBTTC(new ItemStack(Items.ENCHANTED_BOOK)), "nitor");
        ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation("thaumcraft:IELAMPLIGHT"), IELAMPLIGHT);
        ThaumcraftApi.addFakeCraftingRecipe(new ResourceLocation("thaumcraft:IELAMPLIGHTFAKE"), new InfusionEnchantmentRecipe(IELAMPLIGHT, new ItemStack(Items.GOLDEN_PICKAXE)));

        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:BootsTraveller"), new InfusionRecipe("BOOTSTRAVELLER", new ItemStack(ItemsTC.travellerBoots), 1, (new AspectList()).add(Aspect.FLIGHT, 75).add(Aspect.MOTION, 75).add(Aspect.CRAFT,25), new ItemStack(Items.LEATHER_BOOTS, 1, 32767), ConfigItems.AIR_CRYSTAL, new ItemStack(ItemsTC.fabric), new ItemStack(ItemsTC.fabric), new ItemStack(Items.FEATHER),new ItemStack(Items.FEATHER), new ItemStack(Items.FISH, 1, 32767)));
        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:LampGrowth"), new InfusionRecipe("LAMPGROWTH", new ItemStack(BlocksTC.lampGrowth), 4, (new AspectList()).add(Aspect.PLANT, 30).add(Aspect.LIGHT, 15).add(Aspect.LIFE, 15), new ItemStack(BlocksTC.lampArcane), new ItemStack(Items.GOLD_INGOT), new ItemStack(Items.DYE, 1, 15), ConfigItems.EARTH_CRYSTAL, new ItemStack(Items.GOLD_INGOT), new ItemStack(Items.DYE, 1, 15), ConfigItems.EARTH_CRYSTAL));
        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:LampFertility"), new InfusionRecipe("LAMPFERTILITY", new ItemStack(BlocksTC.lampFertility), 4, (new AspectList()).add(Aspect.BEAST, 20).add(Aspect.LIGHT, 15).add(Aspect.LIFE, 15), new ItemStack(BlocksTC.lampArcane), new ItemStack(Items.GOLD_INGOT), new ItemStack(Items.WHEAT), ConfigItems.FIRE_CRYSTAL, new ItemStack(Items.GOLD_INGOT), new ItemStack(Items.CARROT), ConfigItems.FIRE_CRYSTAL));

        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:ThaumiumFortressHelm"), new InfusionRecipe("ARMORFORTRESS", new ItemStack(ItemsTC.fortressHelm), 3, (new AspectList()).add(Aspect.METAL, 25).add(Aspect.PROTECT, 15).add(Aspect.ENERGY, 15), new ItemStack(ItemsTC.thaumiumHelm, 1, 32767),  "plateThaumium", new ItemStack(Items.GOLD_INGOT), new ItemStack(Items.DIAMOND)));
        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:ThaumiumFortressChest"), new InfusionRecipe("ARMORFORTRESS", new ItemStack(ItemsTC.fortressChest), 3, (new AspectList()).add(Aspect.METAL, 25).add(Aspect.PROTECT, 20).add(Aspect.ENERGY, 15), new ItemStack(ItemsTC.thaumiumChest, 1, 32767),  "plateThaumium", "plateThaumium", "plateThaumium", new ItemStack(Items.GOLD_INGOT), "leather"));
        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:ThaumiumFortressLegs"), new InfusionRecipe("ARMORFORTRESS", new ItemStack(ItemsTC.fortressLegs), 3, (new AspectList()).add(Aspect.METAL, 25).add(Aspect.PROTECT, 15).add(Aspect.ENERGY, 15), new ItemStack(ItemsTC.thaumiumLegs, 1, 32767),  "plateThaumium", "plateThaumium", new ItemStack(Items.GOLD_INGOT), "leather"));

        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:VoidRobeHelm"), new VoidRobeHelm());
        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:VoidRobeChest"), new VoidRobeChest());
        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:VoidRobeLegs"), new VoidRobeLegs());

        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:HelmGoggles"), new InfusionRecipe("FORTRESSMASK", new Object[]{"goggles", new NBTTagByte((byte)1)}, 5, (new AspectList()).add(Aspect.SENSES, 20).add(Aspect.AURA, 10).add(Aspect.PROTECT, 10), new ItemStack(ItemsTC.fortressHelm, 1, 32767), new ItemStack(Items.DYE), new ItemStack(ItemsTC.goggles, 1, 32767)));
        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:MaskGrinningDevil"), new InfusionRecipe("FORTRESSMASK", new Object[]{"mask", new NBTTagInt(0)}, 8, (new AspectList()).add(Aspect.MIND, 40).add(Aspect.LIFE, 40).add(Aspect.PROTECT, 10), new ItemStack(ItemsTC.fortressHelm, 1, 32767), new ItemStack(Items.DYE, 1, 0), "plateIron", "leather", new ItemStack(BlocksTC.shimmerleaf), new ItemStack(ItemsTC.brain), "plateIron"));
        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:MaskAngryGhost"), new InfusionRecipe("FORTRESSMASK", new Object[]{"mask", new NBTTagInt(1)}, 8, (new AspectList()).add(Aspect.ENTROPY, 40).add(Aspect.DEATH, 40).add(Aspect.PROTECT, 10), new ItemStack(ItemsTC.fortressHelm, 1, 32767), new ItemStack(Items.DYE, 1, 15), "plateIron", "leather", new ItemStack(Items.POISONOUS_POTATO), new ItemStack(Items.SKULL, 1, 1), "plateIron"));
        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:MaskSippingFiend"), new InfusionRecipe("FORTRESSMASK", new Object[]{"mask", new NBTTagInt(2)}, 8, (new AspectList()).add(Aspect.UNDEAD, 40).add(Aspect.LIFE, 40).add(Aspect.PROTECT, 10), new ItemStack(ItemsTC.fortressHelm, 1, 32767), new ItemStack(Items.DYE, 1, 1), "plateIron", "leather", new ItemStack(Items.GHAST_TEAR), new ItemStack(Items.MILK_BUCKET), "plateIron"));
        ItemStack isPC = new ItemStack(ItemsTC.primalCrusher);
        EnumInfusionEnchantment.addInfusionEnchantment(isPC, EnumInfusionEnchantment.DESTRUCTIVE, 1);
        EnumInfusionEnchantment.addInfusionEnchantment(isPC, EnumInfusionEnchantment.REFINING, 1);
        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:PrimalCrusher"), new InfusionRecipe("PRIMALCRUSHER", isPC, 6, (new AspectList()).add(Aspect.EARTH, 150).add(Aspect.TOOL, 150).add(Aspect.ENTROPY, 100).add(Aspect.VOID, 100).add(Aspect.AVERSION, 100).add(Aspect.ELDRITCH, 50).add(Aspect.DESIRE, 150), Ingredient.fromItem(ItemsTC.primordialPearl), Ingredient.fromItem(ItemsTC.voidPick), Ingredient.fromItem(ItemsTC.voidShovel), Ingredient.fromItem(ItemsTC.elementalPick), Ingredient.fromItem(ItemsTC.elementalShovel)));

        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:CLOUDRING"), new InfusionRecipe("CLOUDRING", new ItemStack(ItemsTC.ringCloud), 1, (new AspectList()).add(Aspect.AIR, 50).add(Aspect.ENERGY,25).add(Aspect.MAGIC,10), new ItemStack(ItemsTC.baubles, 1, 1), ConfigItems.AIR_CRYSTAL, new ItemStack(Items.FEATHER)));
        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:CuriosityBand"), new InfusionRecipe("CURIOSITYBAND", new ItemStack(ItemsTC.bandCuriosity), 3, (new AspectList()).add(Aspect.MIND, 50).add(Aspect.VOID, 25).add(Aspect.TRAP, 75), new ItemStack(ItemsTC.baubles, 1, 6), new ItemStack(Items.EMERALD), new ItemStack(Items.WRITABLE_BOOK), new ItemStack(Items.EMERALD), new ItemStack(Items.WRITABLE_BOOK)));

        int a = 0;
        ItemStack[] nitorStacks = new ItemStack[16];
        EnumDyeColor[] var18 = EnumDyeColor.values();

        for (EnumDyeColor d : var18) {
            nitorStacks[a] = new ItemStack(BlocksTC.nitor.get(d));
            ++a;
        }

        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:CausalityCollapser"), new InfusionRecipe("RIFTCLOSER", new ItemStack(ItemsTC.causalityCollapser), 8, (new AspectList()).add(Aspect.ELDRITCH, 25).add(Aspect.FLUX, 25), new ItemStack(Blocks.TNT), new ItemStack(ItemsTC.morphicResonator), new ItemStack(Blocks.REDSTONE_BLOCK), new ItemStack(ItemsTC.alumentum), Ingredient.fromStacks(nitorStacks), new ItemStack(ItemsTC.visResonator), new ItemStack(Blocks.REDSTONE_BLOCK)));
        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:VoidSiphon"), new InfusionRecipe("VOIDSIPHON", new ItemStack(BlocksTC.voidSiphon), 7, (new AspectList()).add(Aspect.ELDRITCH, 100).add(Aspect.ENTROPY, 100).add(Aspect.VOID, 200).add(Aspect.CRAFT, 100).add(Aspect.FLUX,100), new ItemStack(BlocksTC.metalBlockVoid), new ItemStack(BlocksTC.stoneArcane), new ItemStack(BlocksTC.stoneArcane), new ItemStack(ItemsTC.mechanismComplex), "plateVoid", "plateVoid", new ItemStack(Items.NETHER_STAR)));
        RecipeApi.changeInfusionRecipe(new ResourceLocation("thaumcraft:VoidseerPearl"), new InfusionRecipe("VOIDSEERPEARL", new ItemStack(ItemsTC.charmVoidseer), 8, (new AspectList()).add(Aspect.MIND, 75).add(Aspect.VOID, 75).add(Aspect.MAGIC, 50), new ItemStack(ItemsTC.baubles, 1, 4), new ItemStack(ItemsTC.brain), new ItemStack(ItemsTC.voidSeed), new ItemStack(ItemsTC.brain), Ingredient.fromItem(ItemsTC.primordialPearl)));
        RecipeApi.changeInfusionRecipe(new ResourceLocation("minecraft:totem_of_undying"),new InfusionRecipe("BASEAUROMANCY",new ItemStack(Items.TOTEM_OF_UNDYING),3,(new AspectList().add(Aspect.LIFE,100).add(Aspect.MAGIC,50).add(Aspect.PROTECT,30)),new ItemStack(Items.NETHER_STAR),new ItemStack(ItemsTC.fabric),"plateBrass",new ItemStack(ItemsTC.fabric),"plateBrass",new ItemStack(ItemsTC.fabric),"plateBrass",new ItemStack(ItemsTC.fabric),"plateBrass"));

        if(ModConfig.ISTHAUMICAUGMENT) {
            //Thaumic Augmentation
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
}
