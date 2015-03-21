package buildtech.common.initialization;

import buildtech.common.items.ModItems;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by UniversalRed on 15-03-21.
 */
public class ModOreDictionary {

    public static void registerOreInits() {
        OreDictionary.registerOre("ironHammer", ModItems.ironHammer);

        OreDictionary.registerOre("wireIron", ModItems.wireIron);
        OreDictionary.registerOre("wireGold", ModItems.wireGold);
        OreDictionary.registerOre("wireDiamond", ModItems.wireDiamond);
        OreDictionary.registerOre("wireEmerald", ModItems.wireEmerald);

        OreDictionary.registerOre("plateIron", ModItems.plateIron);
        OreDictionary.registerOre("plateGold", ModItems.plateGold);
        OreDictionary.registerOre("plateEmerald", ModItems.plateEmerald);
        OreDictionary.registerOre("plateDiamond", ModItems.plateDiamond);
    }
}
