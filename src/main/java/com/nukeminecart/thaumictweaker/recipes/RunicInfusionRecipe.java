package com.nukeminecart.thaumictweaker.recipes;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import baubles.api.IBauble;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.nbt.NBTTagByte;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.RecipeMatcher;
import thaumcraft.api.ThaumcraftApiHelper;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.capabilities.ThaumcraftCapabilities;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.items.ItemsTC;
import thaumcraft.common.lib.events.PlayerEvents;
import java.util.List;

public class RunicInfusionRecipe extends InfusionRecipe {
    public RunicInfusionRecipe() {
        super("RUNICSHIELDING", null, 0, null, Ingredient.EMPTY, "gemAmber", ItemsTC.salisMundus);
    }

    public RunicInfusionRecipe(ItemStack in,ItemStack in1,int pwr) {
        super("RUNICSHIELDING", in1, 0, new AspectList()
                        .add(Aspect.CRYSTAL, 20 + (int)(15.0 * Math.pow(3.0, pwr)))
                        .add(Aspect.ENERGY, 20 + (int)(15.0 * Math.pow(3.0, pwr)))
                        .add(Aspect.PROTECT, 20 + (int)(30.0 * Math.pow(3.0, pwr)))
                , in, new ItemStack(ItemsTC.salisMundus), "gemAmber");

        int fc = PlayerEvents.getRunicCharge(in);
        if (fc > 0) {
            this.components.clear();
            this.components.add(Ingredient.fromItem(ItemsTC.salisMundus));
            this.components.add(ThaumcraftApiHelper.getIngredient("gemAmber"));
            int c = 0;

            while(c < fc) {
                ++c;
                this.components.add(ThaumcraftApiHelper.getIngredient("gemAmber"));
            }
        }

    }

    public boolean matches(List<ItemStack> input, ItemStack central, World world, EntityPlayer player) {
        if (this.getRecipeInput() == null) {
            return false;
        } else if (!ThaumcraftCapabilities.getKnowledge(player).isResearchKnown(this.research)) {
            return false;
        } else if (!(central.getItem() instanceof ItemArmor) && !(central.getItem() instanceof IBauble)) {
            return false;
        } else {
            return (this.getRecipeInput() == Ingredient.EMPTY || this.getRecipeInput().apply(central)) && RecipeMatcher.findMatches(input, this.getComponents(central)) != null;
        }
    }

    public Object getRecipeOutput(EntityPlayer player, ItemStack input, List<ItemStack> comps) {
        if (input == null) {
            return null;
        } else {
            ItemStack out = input.copy();
            int base = PlayerEvents.getRunicCharge(input) + 1;
            out.setTagInfo("TC.RUNIC", new NBTTagByte((byte)base));
            return out;
        }
    }

    public AspectList getAspects(EntityPlayer player, ItemStack input, List<ItemStack> comps) {
        AspectList out = new AspectList();
        int vis = 20 + (int)(30.0 * Math.pow(3.0, PlayerEvents.getRunicCharge(input)));
        if (vis > 0) {
            out.add(Aspect.PROTECT, vis);
            out.add(Aspect.CRYSTAL, vis / 2);
            out.add(Aspect.ENERGY, vis / 2);
        }

        return out;
    }

    public int getInstability(EntityPlayer player, ItemStack input, List<ItemStack> comps) {
        return 5 + PlayerEvents.getRunicCharge(input) / 2;
    }

    public NonNullList<Ingredient> getComponents(ItemStack input) {
        NonNullList<Ingredient> com = NonNullList.create();
        com.add(Ingredient.fromItem(ItemsTC.salisMundus));
        com.add(ThaumcraftApiHelper.getIngredient("gemAmber"));
        int fc = PlayerEvents.getRunicCharge(input);
        if (fc > 0) {
            for(int c = 0; c < fc; ++c) {
                com.add(ThaumcraftApiHelper.getIngredient("gemAmber"));
            }
        }

        return com;
    }
}
