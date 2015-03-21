package buildtech;

import buildtech.bases.libs.ModLibs;
import buildtech.bases.utils.ModUtils;
import buildtech.common.integrations.ModIntegrations;
import buildtech.common.recipes.ModRecipes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by UniversalRed on 15-03-21.
 */
@Mod(name = ModLibs.modNAME, modid = ModLibs.modID, version = ModLibs.version)
public class ModBuildTech {

    public static boolean preInit, init, postInit;

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

        ModIntegrations.loadList();
        proxy.registerObjects();
        preInit = false;
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModUtils.logger.info("BuildTech is starting it's Initialization Phase!");
        init = true;

        ModIntegrations.loadList();
        init = false;
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        ModUtils.logger.info("BuildTech is starting it's Post-Initialization Phase!");
        postInit = true;

        ModRecipes.registerRecipes();
        ModIntegrations.loadList();
        postInit = false;
    }
}
