package nukeminecart.thaumictweaker;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import nukeminecart.thaumictweaker.items.ConfigItems;
import nukeminecart.thaumictweaker.recipes.thaumcraft.ThaumcraftAlchemyRecipes;
import nukeminecart.thaumictweaker.recipes.thaumcraft.ThaumcraftArcaneRecipes;
import nukeminecart.thaumictweaker.recipes.thaumcraft.ThaumcraftInfusionRecipes;
import nukeminecart.thaumictweaker.recipes.thaumcraft.ThaumcraftNormalRecipes;
import nukeminecart.thaumictweaker.recipes.thaumicadditions.ThaumicAdditionsAlchemyRecipes;
import nukeminecart.thaumictweaker.recipes.thaumicadditions.ThaumicAdditionsArcaneRecipes;
import nukeminecart.thaumictweaker.recipes.thaumicadditions.ThaumicAdditionsInfusionRecipes;
import nukeminecart.thaumictweaker.recipes.thaumicaugmentation.ThaumicAugmentationAlchemyRecipes;
import nukeminecart.thaumictweaker.recipes.thaumicaugmentation.ThaumicAugmentationInfusionRecipes;
import nukeminecart.thaumictweaker.recipes.thaumictweaker.ThaumicTweakerRecpies;

@Mod.EventBusSubscriber
public final class Registrar {
        public Registrar() {
        }
        @SubscribeEvent(priority = EventPriority.LOW)
        public static void registerItems(RegistryEvent.Register<Item> event) {

            ConfigItems.registerItems(event);
        }

        public static void registerVanillaRecipes() {
                //Thaumcraft
                ThaumcraftAlchemyRecipes.initializeAlchemyRecipes();
                ThaumcraftArcaneRecipes.initializeArcaneRecipes();
                ThaumcraftInfusionRecipes.initializeInfusionRecipes();
                ThaumcraftNormalRecipes.initializeNormalRecipes();
                //Thaumic Additions
                if(ModConfig.ISTHAUMICADDITIONS){
                        ThaumicAdditionsAlchemyRecipes.initializeAlchemyRecipes();
                        ThaumicAdditionsArcaneRecipes.initializeArcaneRecipes();
                        ThaumicAdditionsInfusionRecipes.initializeInfusionRecipes();
                }
                //Thaumic Augmentation
                if(ModConfig.ISTHAUMICAUGMENT){
                        ThaumicAugmentationAlchemyRecipes.initializeAlchemyRecipes();
                        ThaumicAugmentationInfusionRecipes.initializeInfusionRecipes();
                }
                ThaumicTweakerRecpies.initializeRecipes();
        }

}
