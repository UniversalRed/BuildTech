package buildtech.common.integrations.buildcraft;

import buildtech.ModBuildTech;
import cpw.mods.fml.common.Mod;

/**
 * Created by UniversalRed on 15-03-21.
 */
public class IntegrationBuildCraft {

    public static void loadObjects() {

        if(ModBuildTech.preInit == true) {



        } else if(ModBuildTech.init == true) {



        } else if(ModBuildTech.postInit) {

            loadPostRecipes();

        }
    }

    //This is where BuildTech registers/removes BC recipes
    public static void loadPostRecipes() {

    }
}
