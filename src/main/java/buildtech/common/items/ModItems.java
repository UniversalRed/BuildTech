package buildtech.common.items;

import buildtech.bases.items.ItemBasic;
import buildtech.common.items.hammers.ItemHammer;
import buildtech.common.items.plates.ItemPlate;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by UniversalRed on 15-03-21.
 */
public class ModItems {

    public static Item woodHammer, stoneHammer, ironHammer, diamondHammer;
    public static Item plateIron, plateGold, plateDiamond, plateEmerald;
    public static Item wireIron, wireGold, wireDiamond, wireEmerald;

    public static void init() {
        woodHammer = new ItemHammer("woodHammer", 10);
        stoneHammer = new ItemHammer("stoneHammer", 20);
        ironHammer = new ItemHammer("ironHammer", 30);
        diamondHammer = new ItemHammer("diamondHammer", 40);

        plateIron = new ItemPlate("plateIron");
        plateGold = new ItemPlate("plateGold");
        plateDiamond = new ItemPlate("plateDiamond");
        plateEmerald = new ItemPlate("plateEmerald");

        wireIron = new ItemBasic("wireIron");
        wireGold = new ItemBasic("wireGold");
        wireDiamond = new ItemBasic("wireDiamond");
        wireEmerald = new ItemBasic("wireEmerald");

    }

    public static void registry() {
        GameRegistry.registerItem(woodHammer, "woodHammer");
        GameRegistry.registerItem(stoneHammer, "stoneHammer");
        GameRegistry.registerItem(ironHammer, "ironHammer");
        GameRegistry.registerItem(diamondHammer, "diamondHammer");

        GameRegistry.registerItem(plateIron, "plateIron");
        GameRegistry.registerItem(plateGold, "plateGold");
        GameRegistry.registerItem(plateDiamond, "plateDiamond");
        GameRegistry.registerItem(plateEmerald, "plateEmerald");

        GameRegistry.registerItem(wireIron, "wireIron");
        GameRegistry.registerItem(wireGold, "wireGold");
        GameRegistry.registerItem(wireDiamond, "wireDiamond");
        GameRegistry.registerItem(wireEmerald, "wireEmerald");
    }
}
