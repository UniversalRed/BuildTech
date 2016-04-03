package buildtech.client.creativetab;

/**
 * Created by UniversalRed on 4/2/2016.
 */
import buildtech.common.items.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabBuildTech
{
    public static CreativeTabs BTTab = new CreativeTabs("BTTab")
    {

        @Override
        public Item getTabIconItem()
        {
            return new ItemStack(ModItems.ironHammer).getItem();
        }
    };

    public static void CreativeTabInit()
    {
        //Creative Tab
        CreativeTabs BTTab = new CreativeTabs("BTTab")
        {

            @Override
            public Item getTabIconItem()
            {
                return ModItems.ironHammer;
            }
        };
    }
}