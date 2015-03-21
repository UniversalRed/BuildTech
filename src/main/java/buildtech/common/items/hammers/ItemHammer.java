package buildtech.common.items.hammers;

import buildtech.bases.items.ItemCraftingDamage;
import buildtech.bases.utils.ModUtils;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created by UniversalRed on 15-03-21.
 */
public class ItemHammer extends ItemCraftingDamage {

    public ItemHammer(String name, int maxDamage) {
        super(name, maxDamage);
        this.setMaxDamage(maxDamage);
        this.setFull3D();
    }
}
