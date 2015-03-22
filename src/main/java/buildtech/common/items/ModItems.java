package buildtech.common.items;

import buildtech.bases.items.ItemBasic;
import buildtech.common.configs.ConfigHandler;
import buildtech.common.items.hammers.ItemHammer;
import buildtech.common.items.plates.ItemPlate;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by UniversalRed on 15-03-21.
 */
public class ModItems {

    public static Item ironHammer;
    public static Item plateIron, plateGold, plateDiamond, plateEmerald;
    public static Item wireIron, wireGold, wireDiamond, wireEmerald;
    public static Item axleWood, axleStone, axleIron, axleGold, axleDiamond;

    public static void init() {
        ironHammer = new ItemHammer("ironHammer", 30);

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
        GameRegistry.registerItem(ironHammer, "ironHammer");

        GameRegistry.registerItem(plateIron, "plateIron");
        GameRegistry.registerItem(plateGold, "plateGold");
        GameRegistry.registerItem(plateDiamond, "plateDiamond");
        GameRegistry.registerItem(plateEmerald, "plateEmerald");

        GameRegistry.registerItem(wireIron, "wireIron");
        GameRegistry.registerItem(wireGold, "wireGold");
        GameRegistry.registerItem(wireDiamond, "wireDiamond");
        GameRegistry.registerItem(wireEmerald, "wireEmerald");

        if(ConfigHandler.toggleHardGearRecipes == true) {
            GameRegistry.registerItem(axleWood, "axleWood");
            GameRegistry.registerItem(axleStone, "axleStone");
            GameRegistry.registerItem(axleIron, "axleIron");
            GameRegistry.registerItem(axleGold, "axleGold");
            GameRegistry.registerItem(axleDiamond, "axleDiamond");
        }
    }
}
