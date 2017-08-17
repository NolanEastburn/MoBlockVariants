package com.mbhabesNolieman108.MBV.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting 
{
	public static void registerCrafting()
	{
		//Tools
		//Diamond Block Tools
		GameRegistry.addShapedRecipe(new ItemStack(ModTools.DBSword), "D", "D",  "S", 'D', Blocks.DIAMOND_BLOCK, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModTools.DBPickaxe), "DDD", " S ",  " S ", 'D', Blocks.DIAMOND_BLOCK, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModTools.DBHoe), " DD", " S ",  " S ", 'D', Blocks.DIAMOND_BLOCK, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModTools.DBAxe), "DD ", "DS ", " S ", 'D', Blocks.DIAMOND_BLOCK, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModTools.DBShovel), "D", "S", "S", 'D', Blocks.DIAMOND_BLOCK, 'S', Items.STICK);
		//Obsidian Tools
		GameRegistry.addShapedRecipe(new ItemStack(ModTools.OSword), "O", "O",  "S", 'O', ModItems.OIngot, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModTools.OPickaxe), "OOO", " S ",  " S ", 'O', ModItems.OIngot, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModTools.OHoe), " OO", " S ",  " S ", 'O', ModItems.OIngot, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModTools.OAxe), " OO", " SO", " S ", 'O', ModItems.OIngot, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModTools.OShovel), "O", "S", "S", 'O', ModItems.OIngot, 'S', Items.STICK);
		//Blocks
		//SmoothObsidian
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.smoothOB, 4), "OO ", "OO ", "   ", 'O', Blocks.OBSIDIAN);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.smoothOB, 4), "   ", "OO ", "OO ", 'O', Blocks.OBSIDIAN);
		//Items
		//Obsidian Ingots
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.OChunk),new ItemStack(Blocks.OBSIDIAN));
		
	}
	public static void registerSmelting() 
	{
		GameRegistry.addSmelting(ModItems.OChunk, new ItemStack(ModItems.OIngot), 10);		
	}
}
