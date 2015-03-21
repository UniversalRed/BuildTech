package buildtech.common.integrations;

import buildtech.ModBuildTech;
import buildtech.common.integrations.buildcraft.IntegrationBuildCraft;
import cpw.mods.fml.common.Loader;

/**
 * Created by UniversalRed on 15-03-21.
 */
public class ModIntegrations {


    public static void loadList() {
        if(ModBuildTech.preInit == true) {
            if(Loader.isModLoaded("buildcraftAdditions")) {

            }

            if(Loader.isModLoaded("BuildCraft|Core")) {
                IntegrationBuildCraft.loadObjects();
            }
        }

        if(ModBuildTech.init == true) {
            if(Loader.isModLoaded("buildcraftAdditions")) {

            }

            if(Loader.isModLoaded("BuildCraft|Core")) {
                IntegrationBuildCraft.loadObjects();
            }
        }

        if(ModBuildTech.postInit == true) {
            if(Loader.isModLoaded("buildcraftAdditions")) {

            }

            if(Loader.isModLoaded("BuildCraft|Core")) {
                IntegrationBuildCraft.loadObjects();
            }
        }
    }
}
