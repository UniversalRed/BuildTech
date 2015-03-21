package buildtech.bases.items;

import buildcraft.core.ItemBuildCraft;
import buildtech.api.nbt.INBTSavable;
import buildtech.bases.utils.ModUtils;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import java.util.List;

/**
 * Created by UniversalRed on 15-03-21.
 */
public class ItemCraftingDamage extends ItemBasic implements INBTSavable{

    private int maxDamage;
    private int damage = 1;

    public ItemCraftingDamage(String name, int maxDamage) {
        super(name);
        this.setMaxDamage(maxDamage);
        this.maxDamage = maxDamage;
        this.setMaxStackSize(1);
    }

    @Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack) {
        return false;
    }

    @Override
    public boolean getShareTag() {
        return true;
    }

    @Override
    public boolean hasContainerItem(ItemStack itemStack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        ItemStack stack = itemStack.copy();

        stack.setItemDamage(stack.getItemDamage() + damage);
        stack.stackSize = 1;

        return stack;
    }

    @Override
    public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List p_77624_3_, boolean p_77624_4_) {
        p_77624_3_.add(ModUtils.localizeFormatted("info.damage", maxDamage));
    }

    @Override
    public void writeToNBT(NBTTagCompound tag) {
        tag.setInteger("maxDamage", maxDamage);
        tag.setInteger("damage", damage);
    }

    @Override
    public void readFromNBT(NBTTagCompound tag) {
        maxDamage = tag.getInteger("maxDamage");
        damage = tag.getInteger("damage");
    }

    public ItemStack hammerItem(ItemStack hammer) {
        Item item = new Item();
        if(item instanceof ItemBasic) {
            hammer.setItemDamage(hammer.getItemDamage() + 1);
        } else if(item instanceof ItemBuildCraft) {
            hammer.setItemDamage(hammer.getItemDamage() + 2);
        }
        return hammer;
    }
}
