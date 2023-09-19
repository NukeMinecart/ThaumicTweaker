package com.nukeminecart.thaumictweaker.recipes;

import com.nukeminecart.thaumictweaker.ItemsTT;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.registries.GameData;
import thaumcraft.api.items.ItemsTC;



public class NormalRecipes {
    public static void initializeNormalRecipes() {
        //Thaumcraft
        ResourceLocation thaumiumGroup = new ResourceLocation("thaumcraft", "thaumium_stuff");
        ResourceLocation voidGroup = new ResourceLocation("thaumcraft", "void_stuff");
        ResourceLocation baublesGroup = new ResourceLocation("thaumcraft", "baubles_stuff");
        oreDictRecipe("thaumiumshovel", thaumiumGroup, new ItemStack(ItemsTC.thaumiumShovel, 1), new Object[]{"I", "S", "S", 'I', "ingotThaumium", 'S', new ItemStack(ItemsTT.greatwoodStick)});
        oreDictRecipe("thaumiumpick", thaumiumGroup, new ItemStack(ItemsTC.thaumiumPick, 1), new Object[]{"III", " S ", " S ", 'I', "ingotThaumium", 'S', new ItemStack(ItemsTT.greatwoodStick)});
        oreDictRecipe("thaumiumaxe", thaumiumGroup, new ItemStack(ItemsTC.thaumiumAxe, 1), new Object[]{"II", "SI", "S ", 'I', "ingotThaumium", 'S', new ItemStack(ItemsTT.greatwoodStick)});
        oreDictRecipe("thaumiumhoe", thaumiumGroup, new ItemStack(ItemsTC.thaumiumHoe, 1), new Object[]{"II", "S ", "S ", 'I', "ingotThaumium", 'S', new ItemStack(ItemsTT.greatwoodStick)});
        oreDictRecipe("thaumiumsword", thaumiumGroup, new ItemStack(ItemsTC.thaumiumSword, 1), new Object[]{"I", "I", "S", 'I', "ingotThaumium", 'S', new ItemStack(ItemsTT.greatwoodStick)});
        oreDictRecipe("voidshovel", voidGroup, new ItemStack(ItemsTC.voidShovel, 1), new Object[]{"I", "S", "S", 'I', "ingotVoid", 'S', new ItemStack(ItemsTT.greatwoodStick)});
        oreDictRecipe("voidpick", voidGroup, new ItemStack(ItemsTC.voidPick, 1), new Object[]{"III", " S ", " S ", 'I', "ingotVoid", 'S', new ItemStack(ItemsTT.greatwoodStick)});
        oreDictRecipe("voidaxe", voidGroup, new ItemStack(ItemsTC.voidAxe, 1), new Object[]{"II", "SI", "S ", 'I', "ingotVoid", 'S', new ItemStack(ItemsTT.greatwoodStick)});
        oreDictRecipe("voidhoe", voidGroup, new ItemStack(ItemsTC.voidHoe, 1), new Object[]{"II", "S ", "S ", 'I', "ingotVoid", 'S', new ItemStack(ItemsTT.greatwoodStick)});
        oreDictRecipe("voidsword", voidGroup, new ItemStack(ItemsTC.voidSword, 1), new Object[]{"I", "I", "S", 'I', "ingotVoid", 'S', new ItemStack(ItemsTT.greatwoodStick)});
        oreDictRecipe("babuleamulet", baublesGroup, new ItemStack(ItemsTC.baubles, 1, 0), new Object[]{" S ", "S S", "SIS", 'S', "string", 'I', "ingotBrass"});

    }
    static void oreDictRecipe(String name, ResourceLocation optionalGroup, ItemStack res, Object[] params) {
        IRecipe rec = new ShapedOreRecipe(optionalGroup, res, params);
        rec.setRegistryName(new ResourceLocation("thaumcraft", name));
        GameData.register_impl(rec);
    }
}
