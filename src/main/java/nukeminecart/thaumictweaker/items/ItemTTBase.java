package nukeminecart.thaumictweaker.items;

import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thaumcraft.common.items.ItemTCBase;

import static thaumcraft.common.config.ConfigItems.TABTC;


public class ItemTTBase extends ItemTCBase {
        protected String[] VARIANTS;
        protected int[] VARIANTS_META;
    @SideOnly(Side.CLIENT)
    public ItemTTBase(String name, String... variants) {
        super(name, variants);
        this.setCreativeTab(TABTC);

    }
        public Item getItem() {
            return this;
        }

        public String[] getVariantNames() {
            return this.VARIANTS;
        }

        public int[] getVariantMeta() {
            return this.VARIANTS_META;
        }

        public ItemMeshDefinition getCustomMesh() {
            return null;
        }
        public ModelResourceLocation getCustomModelResourceLocation(String variant) {
            return variant.equals(this.BASE_NAME) ? new ModelResourceLocation("thaumictweaker:" + this.BASE_NAME) : new ModelResourceLocation("thaumictweaker:" + this.BASE_NAME, variant);
    }
}

