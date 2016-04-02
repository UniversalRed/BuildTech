package buildtech;

import buildtech.common.items.ModItems;

/**
 * Created by UniversalRed on 15-03-21.
 */
public class ClientProxy extends CommonProxy{

    @Override
    public void renderThings() {
        ModItems.registerRenders();
    }
}
