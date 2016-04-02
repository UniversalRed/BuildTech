package buildtech.bases.utils;

import java.lang.reflect.Method;
import java.util.ArrayList;

import buildcraft.BuildCraftTransport;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;

public class RecipeUtils{

	public static void removeRecipes(ItemStack resultItem)
	{
	    ArrayList recipes = (ArrayList) CraftingManager.getInstance().getRecipeList();

	    for (int scan = 0; scan < recipes.size(); scan++)
	    {
	        IRecipe tmpRecipe = (IRecipe) recipes.get(scan);
	        ItemStack recipeResult = tmpRecipe.getRecipeOutput();
	        if (ItemStack.areItemStacksEqual(resultItem, recipeResult)){
	        	/*if (tmpRecipe instanceof ShapedOreRecipe) {
                    ShapedOreRecipe recipe = (ShapedOreRecipe)tmpRecipe;
                    recipeResult = recipe.getRecipeOutput();
	        	}
	        	if (tmpRecipe instanceof ShapelessRecipes) {
	                ShapelessRecipes recipe = (ShapelessRecipes)tmpRecipe;
	                recipeResult = recipe.getRecipeOutput();
	            }
                if (tmpRecipe instanceof ShapelessOreRecipe) {
                    ShapelessOreRecipe recipe = (ShapelessOreRecipe)tmpRecipe;
                    recipeResult = recipe.getRecipeOutput();
                }*/
                if (tmpRecipe instanceof IRecipe) {
                    IRecipe recipe = (IRecipe)tmpRecipe;
                    recipeResult = recipe.getRecipeOutput();
                }
	            recipes.remove(scan);
	        }
	    }
	}
}