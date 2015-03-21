package buildtech.common.configs;

import buildtech.bases.utils.VersionChecker;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by UniversalRed on 15-03-21.
 */
public class ConfigHandler {

    public static Configuration config;
    public static boolean toggleHardModeRecipes, shouldPrintChangelog;

    public static void init(File file){
        config = new Configuration(file);
        loadConfig(config);
        toggleHardModeRecipes = false;
    }

    public static void loadConfig(Configuration config)
    {
        try
        {
            config.addCustomCategoryComment("Updates", "Section about updates");
            if (config.get("Updates", "shouldCheckForUpdates", true).getBoolean()) {
                VersionChecker.start();
            }
            shouldPrintChangelog = config.get("Updates", "shouldPrintOutChangelog", true).getBoolean();

            config.addCustomCategoryComment("misc", "Misc. Section");

            config.addCustomCategoryComment("IDS'", "IDS' Section");

            config.addCustomCategoryComment("Recipes", "Recipes Section");

        }finally{

            if(config.hasChanged());
            config.save();
        }
    }
}
