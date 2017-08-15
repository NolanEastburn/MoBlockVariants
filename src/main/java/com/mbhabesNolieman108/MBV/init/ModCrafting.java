package com.mbhabesNolieman108.MBV.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting 
{
	public static void register()
	{
		GameRegistry.addShapedRecipe(new ItemStack(ToolInit.DBSword), " D ", " D ",  " S ", 'D', Blocks.DIAMOND_BLOCK, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ToolInit.DBSword), "  D", "  D",  "  S", 'D', Blocks.DIAMOND_BLOCK, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ToolInit.DBSword), "D  ", "D  ",  "S  ", 'D', Blocks.DIAMOND_BLOCK, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ToolInit.DBPickaxe), "DDD", " S ",  " S ", 'D', Blocks.DIAMOND_BLOCK, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ToolInit.DBHoe), "DD ", " S ",  " S ", 'D', Blocks.DIAMOND_BLOCK, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ToolInit.DBHoe), " DD", " S ",  " S ", 'D', Blocks.DIAMOND_BLOCK, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ToolInit.DBAxe), " DD", " SD", " S ", 'D', Blocks.DIAMOND_BLOCK, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ToolInit.DBAxe), "DD ", "DS ", " S ", 'D', Blocks.DIAMOND_BLOCK, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ToolInit.DBShovel), " D ", " S ", " S ", 'D', Blocks.DIAMOND_BLOCK, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ToolInit.DBShovel), "  D", "  S", "  S", 'D', Blocks.DIAMOND_BLOCK, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ToolInit.DBShovel), "D  ", "S  ", "S  ", 'D', Blocks.DIAMOND_BLOCK, 'S', Items.STICK);
		
	}
}
