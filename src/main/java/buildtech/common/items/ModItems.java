package buildtech.common.items;

import buildtech.bases.items.ItemBasic;
import buildtech.bases.libs.ModLibs;
import buildtech.bases.utils.TextureUtils;
import buildtech.common.configs.ConfigHandler;
import buildtech.common.items.hammers.ItemHammer;
import buildtech.common.items.plates.ItemPlate;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by UniversalRed on 15-03-21.
 */
public class ModItems {

    public static Item ironHammer;
    public static Item plateIron, plateGold, plateDiamond, plateEmerald;
    public static Item wireIron, wireGold, wireDiamond, wireEmerald;
    public static Item axleWood, axleStone, axleIron, axleGold, axleDiamond;

    public static void init() {
        ironHammer = new ItemHammer("ironHammer", 30).setFull3D();

        plateIron = new ItemPlate("plateIron");
        plateGold = new ItemPlate("plateGold");
        plateDiamond = new ItemPlate("plateDiamond");
        plateEmerald = new ItemPlate("plateEmerald");

        wireIron = new ItemBasic("wireIron");
        wireGold = new ItemBasic("wireGold");
        wireDiamond = new ItemBasic("wireDiamond");
        wireEmerald = new ItemBasic("wireEmerald");

        if(ConfigHandler.toggleHardGearRecipes == true) {
            axleWood = new ItemBasic("axleWood");
            axleStone = new ItemBasic("axleStone");
            axleIron = new ItemBasic("axleIron");
            axleGold = new ItemBasic("axleGold");
            axleDiamond = new ItemBasic("axleDiamond");
        }
    }

    public static void registry() {
        GameRegistry.registerItem(ironHammer, ironHammer.getUnlocalizedName().substring(5));

        GameRegistry.registerItem(plateIron, plateIron.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(plateGold, plateGold.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(plateDiamond, plateDiamond.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(plateEmerald, plateEmerald.getUnlocalizedName().substring(5));

        GameRegistry.registerItem(wireIron, wireIron.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(wireGold, wireGold.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(wireDiamond, wireDiamond.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(wireEmerald, wireEmerald.getUnlocalizedName().substring(5));

        if(ConfigHandler.toggleHardGearRecipes == true) {
            GameRegistry.registerItem(axleWood, axleWood.getUnlocalizedName().substring(5));
            GameRegistry.registerItem(axleStone, axleStone.getUnlocalizedName().substring(5));
            GameRegistry.registerItem(axleIron, axleIron.getUnlocalizedName().substring(5));
            GameRegistry.registerItem(axleGold, axleGold.getUnlocalizedName().substring(5));
            GameRegistry.registerItem(axleDiamond, axleDiamond.getUnlocalizedName().substring(5));
        }
    }

    public static void registerRenders () {
        registerRender(ironHammer);

        registerRender(plateIron);
        registerRender(plateGold);
        registerRender(plateDiamond);
        registerRender(plateEmerald);

        registerRender(wireIron);
        registerRender(wireGold);
        registerRender(wireDiamond);
        registerRender(wireEmerald);

        registerRender(axleWood);
        registerRender(axleStone);
        registerRender(axleIron);
        registerRender(axleGold);
        registerRender(axleDiamond);
    }

    public static void registerRender (Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(ModLibs.modID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
