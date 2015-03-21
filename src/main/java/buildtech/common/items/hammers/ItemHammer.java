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

    private int maxDamage, damage;

    public ItemHammer(String name, int maxDamage) {
        super(name, maxDamage);
        this.setMaxDamage(maxDamage);
        this.maxDamage = maxDamage;
    }

    @Override
    public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List p_77624_3_, boolean p_77624_4_) {
        p_77624_3_.add(ModUtils.localizeFormatted("info.damage", maxDamage));
    }
}
