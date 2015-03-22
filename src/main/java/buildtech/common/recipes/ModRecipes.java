package buildtech.common.recipes;

import buildcraft.BuildCraftCore;
import buildcraft.BuildCraftFactory;
import buildcraft.BuildCraftTransport;
import buildcraft.core.CreativeTabBuildCraft;
import buildcraft.core.proxy.CoreProxy;
import buildcraft.transport.pipes.PipeItemsWood;
import buildtech.ModBuildTech;
import buildtech.bases.utils.ModUtils;
import buildtech.bases.utils.RecipeUtils;
import buildtech.common.configs.ConfigHandler;
import buildtech.common.items.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by UniversalRed on 15-03-21.
 */
public class ModRecipes {

    public static void registerRecipes() {
        ModUtils.logger.info("BuildTech has started it's Registration of Recipes!");

        removeRecipes();
        replaceRecipes();
        addRecipes();
        addLaserRecipes();
    }

    public static void removeRecipes() {
        ModUtils.logger.info("BuildTech has started Removing BuildCraft Recipes"/*, to configure this go to the BuildTech Configuration Files!"*/);


        if (ModBuildTech.preInit == true) {
            if (ConfigHandler.togglePipeRecipeChange) {
                RecipeUtils.removeRecipes(new ItemStack(BuildCraftTransport.pipeItemsWood));
                RecipeUtils.removeRecipes(new ItemStack(BuildCraftTransport.pipeItemsStone));
                RecipeUtils.removeRecipes(new ItemStack(BuildCraftTransport.pipeItemsCobblestone));
            }
        }

        if (ModBuildTech.postInit == true) {
            if (ConfigHandler.toggleHardGearRecipes == true) {
                RecipeUtils.removeRecipes(new ItemStack(BuildCraftCore.woodenGearItem));
                RecipeUtils.removeRecipes(new ItemStack(BuildCraftCore.stoneGearItem));
                RecipeUtils.removeRecipes(new ItemStack(BuildCraftCore.ironGearItem));
                RecipeUtils.removeRecipes(new ItemStack(BuildCraftCore.goldGearItem));
                RecipeUtils.removeRecipes(new ItemStack(BuildCraftCore.diamondGearItem));
            }

            if (ConfigHandler.toggleFactoryRecipeChange == true) {
                RecipeUtils.removeRecipes(new ItemStack(BuildCraftFactory.quarryBlock));
                RecipeUtils.removeRecipes(new ItemStack(BuildCraftFactory.miningWellBlock));
                RecipeUtils.removeRecipes(new ItemStack(BuildCraftFactory.floodGateBlock));
            }
        }
    }

    public static void replaceRecipes() {
        ModUtils.logger.info("BuildTech has started implementing recipes For Buildcraft!");

        if (ConfigHandler.toggleHardGearRecipes == true) {
            GameRegistry.addRecipe(new ItemStack(BuildCraftCore.woodenGearItem, 1),
                    "oXo",
                    "XSX",
                    "oXo",
                    'S', ModItems.axleWood, 'X', Items.stick);

            GameRegistry.addRecipe(new ItemStack(BuildCraftCore.stoneGearItem, 1),
                    "oXo",
                    "XSX",
                    "oXo",
                    'S', ModItems.axleStone, 'X', Blocks.cobblestone);

            GameRegistry.addRecipe(new ItemStack(BuildCraftCore.ironGearItem, 1),
                    "oXo",
                    "XSX",
                    "oXo",
                    'S', ModItems.axleIron, 'X', Items.iron_ingot);

            GameRegistry.addRecipe(new ItemStack(BuildCraftCore.goldGearItem, 1),
                    "oXo",
                    "XSX",
                    "oXo",
                    'S', ModItems.axleGold, 'X', Items.gold_ingot);

            GameRegistry.addRecipe(new ItemStack(BuildCraftCore.diamondGearItem, 1),
                    "oXo",
                    "XSX",
                    "oXo",
                    'S', ModItems.axleDiamond, 'X', Items.diamond);
        }

        if (ConfigHandler.toggleFactoryRecipeChange == true) {
            if (BuildCraftFactory.quarryBlock != null) {
                CoreProxy.proxy.addCraftingRecipe(
                        new ItemStack(BuildCraftFactory.quarryBlock, 1),
                        "ipi",
                        "gig",
                        "dDd",
                        'i', "gearIron", 'p', new ItemStack(ModItems.ironHammer, 1, OreDictionary.WILDCARD_VALUE), 'g', "gearGold", 'd', "gearDiamond", 'D', Items.diamond_pickaxe);
            }

            GameRegistry.addRecipe(new ItemStack(BuildCraftFactory.miningWellBlock, 1),
                    "IRI",
                    "IGI",
                    "IPI",
                    'I', Items.iron_ingot, 'R', new ItemStack(ModItems.ironHammer, 1, OreDictionary.WILDCARD_VALUE), 'G', BuildCraftCore.ironGearItem, 'P', Items.iron_pickaxe);

            GameRegistry.addRecipe(new ItemStack(BuildCraftFactory.floodGateBlock, 1),
                    "IHI",
                    "GTG",
                    "IGI",
                    'I', Items.iron_ingot, 'G', BuildCraftCore.ironGearItem, 'T', BuildCraftFactory.tankBlock, 'H', new ItemStack(ModItems.ironHammer, 1, OreDictionary.WILDCARD_VALUE));
        }

        /*removed due to bugs with removing recipes
        if (ConfigHandler.togglePipeRecipeChange) {

            GameRegistry.addRecipe(new ItemStack(BuildCraftTransport.pipeItemsWood, 3),
                    "WGW",
                    "XHX",
                    "XXX",
                    'W', Blocks.planks, 'G', Blocks.glass, 'H', new ItemStack(ModItems.ironHammer, 1, OreDictionary.WILDCARD_VALUE));

            GameRegistry.addRecipe(new ItemStack(BuildCraftTransport.pipeItemsStone, 3),
                    "WGW",
                    "XHX",
                    "XXX",
                    'W', Blocks.stone, 'G', Blocks.glass, 'H', new ItemStack(ModItems.ironHammer, 1, OreDictionary.WILDCARD_VALUE));

            GameRegistry.addRecipe(new ItemStack(BuildCraftTransport.pipeItemsCobblestone, 3),
                    "WGW",
                    "XHX",
                    "XXX",
                    'W', Blocks.cobblestone, 'G', Blocks.glass, 'H', new ItemStack(ModItems.ironHammer, 1, OreDictionary.WILDCARD_VALUE));

        }
        */
    }

    public static void addRecipes() {
        ModUtils.logger.info("BuildTech has started adding It's Recipes!");

        //PLATES
        GameRegistry.addRecipe(new ItemStack(ModItems.plateIron, 1),
                "IIX",
                "IIX",
                "XXX",
                'I', Items.iron_ingot);

        GameRegistry.addRecipe(new ItemStack(ModItems.plateGold, 1),
                "IIX",
                "IIX",
                "XXX",
                'I', Items.gold_ingot);

        GameRegistry.addRecipe(new ItemStack(ModItems.plateDiamond, 1),
                "IIX",
                "IIX",
                "XXX",
                'I', Items.diamond);

        GameRegistry.addRecipe(new ItemStack(ModItems.plateEmerald, 1),
                "IIX",
                "IIX",
                "XXX",
                'I', Items.emerald);

        //HAMMERS
        GameRegistry.addRecipe(new ItemStack(ModItems.ironHammer, 1),
                "WWX",
                "WSX",
                "XXS",
                'W', Items.iron_ingot, 'S', Items.stick);

        //WIRES
        GameRegistry.addRecipe(new ItemStack(ModItems.wireIron, 3),
                "XXX",
                "III",
                "XHX",
                'I', Items.iron_ingot, 'H', new ItemStack(ModItems.ironHammer, 1, OreDictionary.WILDCARD_VALUE));

        GameRegistry.addRecipe(new ItemStack(ModItems.wireGold, 3),
                "XXX",
                "III",
                "XHX",
                'I', Items.gold_ingot, 'H', new ItemStack(ModItems.ironHammer, 1, OreDictionary.WILDCARD_VALUE));

        GameRegistry.addRecipe(new ItemStack(ModItems.wireDiamond, 3),
                "XXX",
                "III",
                "XHX",
                'I', Items.diamond, 'H', new ItemStack(ModItems.ironHammer, 1, OreDictionary.WILDCARD_VALUE));

        GameRegistry.addRecipe(new ItemStack(ModItems.wireEmerald, 3),
                "XXX",
                "III",
                "XHX",
                'I', Items.emerald, 'H', new ItemStack(ModItems.ironHammer, 1, OreDictionary.WILDCARD_VALUE));

        if (ConfigHandler.toggleHardGearRecipes == true) {
            //AXLES
            GameRegistry.addRecipe(new ItemStack(ModItems.axleWood, 1),
                    "XWX",
                    "WXW",
                    "XWX",
                    'W', Blocks.planks);

            GameRegistry.addRecipe(new ItemStack(ModItems.axleStone, 1),
                    "XWX",
                    "WIW",
                    "XWX",
                    'W', Blocks.cobblestone, 'I', ModItems.axleWood);

            GameRegistry.addRecipe(new ItemStack(ModItems.axleStone, 1),
                    "XWX",
                    "WIW",
                    "XWX",
                    'W', Blocks.stone, 'I', ModItems.axleWood);

            GameRegistry.addRecipe(new ItemStack(ModItems.axleIron, 1),
                    "XWX",
                    "WIW",
                    "XWX",
                    'W', Items.iron_ingot, 'I', ModItems.axleStone);

            GameRegistry.addRecipe(new ItemStack(ModItems.axleGold, 1),
                    "XWX",
                    "WIW",
                    "XWX",
                    'W', Items.gold_ingot, 'I', ModItems.axleIron);

            GameRegistry.addRecipe(new ItemStack(ModItems.axleDiamond, 1),
                    "XWX",
                    "WIW",
                    "XWX",
                    'W', Items.diamond, 'I', ModItems.axleGold);

        }
    }

    public static void addLaserRecipes() {
        ModUtils.logger.info("BuildTech has started adding it's Laser Recipes!");

    }
}
