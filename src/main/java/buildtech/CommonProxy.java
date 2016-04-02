package buildtech;

import buildtech.bases.utils.ModUtils;
import buildtech.common.blocks.ModBlocks;
import buildtech.common.initialization.ModOreDictionary;
import buildtech.common.items.ModItems;

/**
 * Created by UniversalRed on 15-03-21.
 */
public class CommonProxy {

    public void registerObjects() {
        ModUtils.logger.info("BuildTech is starting it's Registration of Objects");

        registerBlocks();
        registerItems();
        //renderThings(); //This will be in a separate registerObjects format

        ModOreDictionary.registerOreInits();
    }

    public void registerItems() {
        ModUtils.logger.info("BuildTech is starting it's Registration of Items!");
        ModItems.init();
        ModItems.registry();
    }

    public void registerBlocks() {
        ModUtils.logger.info("BuildTech is starting it's Registration of Blocks!");
        ModBlocks.init();
        ModBlocks.registry();
    }

    public void renderThings() {
        ModUtils.logger.info("BuildTech is starting it's Registration of Renders!");

    }
}
