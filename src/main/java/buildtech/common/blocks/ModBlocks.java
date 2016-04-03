package buildtech.common.blocks;

import buildtech.bases.blocks.BasicBlock;
import buildtech.bases.libs.ModLibs;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by UniversalRed on 15-03-21.
 */
public class ModBlocks {
    public static Block containerIron;
    public static Block chargedContainerIron;

    public static void init () {
        containerIron = new BasicBlock("containerIron");
        chargedContainerIron = new BasicBlock("chargedContainerIron");

    }

    public static void registry () {
        GameRegistry.registerBlock(containerIron, containerIron.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(chargedContainerIron, chargedContainerIron.getUnlocalizedName().substring(5));
    }

    public static void registerRenders () {
        registerRender(containerIron);
        registerRender(chargedContainerIron);
    }

    public static void registerRender (Block block){
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(ModLibs.modID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
