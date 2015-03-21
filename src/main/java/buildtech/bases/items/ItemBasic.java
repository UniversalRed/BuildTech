package buildtech.bases.items;

import buildtech.bases.utils.TextureUtils;
import net.minecraft.item.Item;

/**
 * Created by UniversalRed on 15-03-21.
 */
public class ItemBasic extends Item{

    public ItemBasic(String name) {
        this.setUnlocalizedName(name);
        this.setTextureName(TextureUtils.blockTexture(name));
    }
}
