package com.nukeminecart.thaumictweaker.recipes.voidarmor;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.items.ItemsTC;
import thecodex6824.thaumicaugmentation.api.TAItems;

import java.util.List;

public class VoidRobeLegs extends InfusionRecipe {
    public VoidRobeLegs() {
        super("VOIDROBEARMOR", new ItemStack(ItemsTC.voidRobeLegs), 6,
        new AspectList().add(Aspect.METAL, 60)
                .add(Aspect.PROTECT, 60)
                .add(Aspect.ENERGY, 50)
                .add(Aspect.ELDRITCH, 75)
                .add(Aspect.VOID, 60)
                ,new ItemStack(ItemsTC.fortressLegs),
                new ItemStack(ItemsTC.voidLegs),
                new ItemStack(TAItems.THAUMIUM_ROBES_LEGGINGS),
                "plateVoid", "plateVoid", "plateVoid",
                new ItemStack(ItemsTC.salisMundus),
                new ItemStack(ItemsTC.fabric));
    }
    public Object getRecipeOutput(EntityPlayer player, ItemStack input, List<ItemStack> comps) {
        if (input == null) {
            return null;
        } else {
            ItemStack out = new ItemStack(ItemsTC.voidRobeLegs,1);
            out.setTagCompound(input.getTagCompound());
            return out;
        }
    }
}
