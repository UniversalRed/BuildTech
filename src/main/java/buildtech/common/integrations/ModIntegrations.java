package buildtech.common.integrations;

import buildtech.ModBuildTech;
import buildtech.bases.utils.ModUtils;
import buildtech.common.integrations.buildcraftadditions.BuildCraftAdditionsIntegrations;
import net.minecraftforge.fml.common.Loader;

/**
 * Created by UniversalRed on 15-03-21.
 */
public class ModIntegrations {


    public static void loadList() {
        if(ModBuildTech.preInit == true) {
            if (Loader.isModLoaded("bcadditions")) {
                ModUtils.logger.info("BuildCraft Additions has been spotted! Running integrations involving the mod...");
            }

            if (ModBuildTech.init == true) {
                if (Loader.isModLoaded("bcadditions")) {

                }
            }

            if (ModBuildTech.postInit == true) {
                if (Loader.isModLoaded("bcadditions")) {
                    BuildCraftAdditionsIntegrations.registerChanges();
                }
            }
        }
    }
}
