package buildtech;

import buildtech.bases.libs.ModLibs;
import buildtech.bases.utils.ModUtils;
import buildtech.common.configs.ConfigHandler;
import buildtech.common.integrations.ModIntegrations;
import buildtech.common.recipes.ModRecipes;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;

import java.io.File;

/**
 * Created by UniversalRed on 15-03-21.
 */
@Mod(name = ModLibs.modNAME, modid = ModLibs.modID, version = ModLibs.version, acceptedMinecraftVersions = "1.8.9", dependencies = "required-after:BuildCraft|Core;after:BuildCraft|Silicon;after:BuildCraft|Energy;after:gregtech;required-after:Forge@[1.8.9-11.15.1.1808,);")
public class ModBuildTech {

    public static boolean preInit, init, postInit;
    public static Configuration config;

    public ModBuildTech() {
        preInit = false;
        init = false;
        postInit = false;
    }

    @SidedProxy(clientSide = ModLibs.clientPath, serverSide = ModLibs.serverPath)
    public static CommonProxy proxy;

    @Mod.Instance(ModLibs.modID)
    public static ModBuildTech INSTANCE;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModUtils.logger.info("BuildTech is starting it's Pre-Initialization Phase!");
        preInit = true;

        config = new Configuration(new File(event.getModConfigurationDirectory(), "BuildTech.cfg"));
        ConfigHandler.loadConfig(config);

        proxy.registerObjects();
        //ModRecipes.removeRecipes();
        ModIntegrations.loadList();
        preInit = false;
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModUtils.logger.info("BuildTech is starting it's Initialization Phase!");
        init = true;

        proxy.renderThings(); //renders the objects
        //ModIntegrations.loadList(); //Comment out for now
        init = false;
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        ModUtils.logger.info("BuildTech is starting it's Post-Initialization Phase!");
        postInit = true;

        ModRecipes.registerRecipes(); //DEBUG PURPOSES
        //ModRecipes.removeRecipes(); //DEBUG PURPOSES
        ModIntegrations.loadList();
        postInit = false;
    }
}
