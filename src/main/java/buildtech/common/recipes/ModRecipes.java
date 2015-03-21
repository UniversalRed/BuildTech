package buildtech.common.recipes;

import buildcraft.BuildCraftCore;
import buildtech.bases.utils.ModUtils;
import buildtech.bases.utils.RecipeUtils;
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
        ModUtils.logger.info("BuildTech has started Removing Buildcraft Recipes, to configure this go to the BuildTech Configuration Files!!");

        RecipeUtils.removeRecipes(new ItemStack(BuildCraftCore.woodenGearItem));
        RecipeUtils.removeRecipes(new ItemStack(BuildCraftCore.stoneGearItem));
        RecipeUtils.removeRecipes(new ItemStack(BuildCraftCore.ironGearItem));
        RecipeUtils.removeRecipes(new ItemStack(BuildCraftCore.goldGearItem));
        RecipeUtils.removeRecipes(new ItemStack(BuildCraftCore.diamondGearItem));


    }

    public static void replaceRecipes() {
        ModUtils.logger.info("BuildTech has started Implementing Recipes For Buildcraft!");

        GameRegistry.addShapedRecipe(new ItemStack(BuildCraftCore.woodenGearItem, 1),
                "oXo",
                "XSX",
                "oXH",
                'S', ModItems.axleWood, 'X', Items.stick, 'H', new ItemStack(ModItems.ironHammer, 1, OreDictionary.WILDCARD_VALUE));

        GameRegistry.addShapedRecipe(new ItemStack(BuildCraftCore.stoneGearItem, 1),
                "oXo",
                "XSX",
                "oXH",
                'S', ModItems.axleStone, 'X', Blocks.cobblestone, 'H', new ItemStack(ModItems.ironHammer, 1, OreDictionary.WILDCARD_VALUE));

        GameRegistry.addShapedRecipe(new ItemStack(BuildCraftCore.ironGearItem, 1),
                "oXo",
                "XSX",
                "oXH",
                'S', ModItems.axleIron, 'X', Items.iron_ingot, 'H', new ItemStack(ModItems.ironHammer, 1, OreDictionary.WILDCARD_VALUE));

        GameRegistry.addShapedRecipe(new ItemStack(BuildCraftCore.goldGearItem, 1),
                "oXo",
                "XSX",
                "oXH",
                'S', ModItems.axleGold, 'X', Items.gold_ingot, 'H', new ItemStack(ModItems.ironHammer, 1, OreDictionary.WILDCARD_VALUE));

        GameRegistry.addShapedRecipe(new ItemStack(BuildCraftCore.diamondGearItem, 1),
                "oXo",
                "XSX",
                "oXH",
                'S', ModItems.axleDiamond, 'X', Items.diamond, 'H', new ItemStack(ModItems.ironHammer, 1, OreDictionary.WILDCARD_VALUE));

    }

    public static void addRecipes() {
        ModUtils.logger.info("BuildTech has started it's Adding It's Recipes!");


        //PLATES
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.plateIron, 1),
                "IIX",
                "IIX",
                "XXX",
                'I', Items.iron_ingot);

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.plateGold, 1),
                "IIX",
                "IIX",
                "XXX",
                'I', Items.gold_ingot);

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.plateDiamond, 1),
                "IIX",
                "IIX",
                "XXX",
                'I', Items.diamond);

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.plateEmerald, 1),
                "IIX",
                "IIX",
                "XXX",
                'I', Items.emerald);

        //HAMMERS
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.ironHammer, 1),
                "WWX",
                "WSX",
                "XXS",
                'W', Items.iron_ingot, 'S', Items.stick);

        //WIRES
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.wireIron, 3),
                "XXX",
                "III",
                "XHX",
                'I', Items.iron_ingot, 'H', new ItemStack(ModItems.ironHammer, 1, OreDictionary.WILDCARD_VALUE));

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.wireGold, 3),
                "XXX",
                "III",
                "XHX",
                'I', Items.gold_ingot, 'H', new ItemStack(ModItems.ironHammer, 1, OreDictionary.WILDCARD_VALUE));

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.wireDiamond, 3),
                "XXX",
                "III",
                "XHX",
                'I', Items.diamond, 'H', new ItemStack(ModItems.ironHammer, 1, OreDictionary.WILDCARD_VALUE));

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.wireEmerald, 3),
                "XXX",
                "III",
                "XHX",
                'I', Items.emerald, 'H', new ItemStack(ModItems.ironHammer, 1, OreDictionary.WILDCARD_VALUE));

        //AXLES
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.axleWood, 1),
                "XWX",
                "WXW",
                "XWH",
                'W', Blocks.planks, 'H', new ItemStack(ModItems.ironHammer, 1, OreDictionary.WILDCARD_VALUE));

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.axleStone, 1),
                "XWX",
                "WIW",
                "XWH",
                'W', Blocks.cobblestone, 'I', ModItems.axleWood, 'H', new ItemStack(ModItems.ironHammer, 1, OreDictionary.WILDCARD_VALUE));

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.axleStone, 1),
                "XWX",
                "WIW",
                "XWH",
                'W', Blocks.stone, 'I', ModItems.axleWood, 'H', new ItemStack(ModItems.ironHammer, 1, OreDictionary.WILDCARD_VALUE));

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.axleIron, 1),
                "XWX",
                "WIW",
                "XWH",
                'W', Items.iron_ingot, 'I', ModItems.axleStone, 'H', new ItemStack(ModItems.ironHammer, 1, OreDictionary.WILDCARD_VALUE));

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.axleGold, 1),
                "XWX",
                "WIW",
                "XWH",
                'W', Items.gold_ingot, 'I', ModItems.axleIron, 'H', new ItemStack(ModItems.ironHammer, 1, OreDictionary.WILDCARD_VALUE));

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.axleDiamond, 1),
                "XWX",
                "WIW",
                "XWH",
                'W', Items.diamond, 'I', ModItems.axleGold, 'H', new ItemStack(ModItems.ironHammer, 1, OreDictionary.WILDCARD_VALUE));


    }

    public static void addLaserRecipes() {
        ModUtils.logger.info("BuildTech has started it's Adding it's Laser Recipes!");

    }
}
