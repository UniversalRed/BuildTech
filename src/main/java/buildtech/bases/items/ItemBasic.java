package buildtech.bases.items;

import buildtech.client.creativetab.CreativeTabBuildTech;
import net.minecraft.item.Item;

/**
 * Created by UniversalRed on 15-03-21.
 */
public class ItemBasic extends Item{

    public ItemBasic(String localName) {
        setUnlocalizedName(localName);
        setCreativeTab(CreativeTabBuildTech.BTTab);
        //this.setRegistryName("buildtech", name);
    }
}
