package buildtech.bases.items;

import net.minecraft.item.ItemStack;

/**
 * Created by UniversalRed on 15-03-21.
 */
public class ItemCraftingDamage extends ItemBasic {

    private int maxDamage;
    private int damage = 1;

    public ItemCraftingDamage(String name, int maxDamage) {
        super(name);
        this.setMaxDamage(maxDamage);
        this.maxDamage = maxDamage;
        this.setMaxStackSize(1);
    }

    @Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack)
    {
        return false;
    }

    @Override
    public boolean getShareTag()
    {
        return true;
    }

    @Override
    public boolean hasContainerItem(ItemStack itemStack)
    {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
        ItemStack stack = itemStack.copy();

        stack.setItemDamage(stack.getItemDamage() + damage);
        stack.stackSize = 1;

        return stack;
    }
}
