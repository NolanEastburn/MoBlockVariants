package com.mbhabesNolieman108.MBV.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting 
{
	public static void registerCrafting()
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
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.smoothOB, 4), "OO ", "OO ", "   ", 'O', Blocks.OBSIDIAN);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.smoothOB, 4), "   ", "OO ", "OO ", 'O', Blocks.OBSIDIAN);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.OChunk),new ItemStack(Blocks.OBSIDIAN));
		
		
		GameRegistry.addShapedRecipe(new ItemStack(ToolInit.OSword), " O ", " O ",  " S ", 'O', ModItems.OIngot, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ToolInit.OSword), "  O", "  O",  "  S", 'O', ModItems.OIngot, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ToolInit.OSword), "O  ", "O  ",  "S  ", 'O', ModItems.OIngot, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ToolInit.OPickaxe), "OOO", " S ",  " S ", 'O', ModItems.OIngot, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ToolInit.OHoe), "OO ", " S ",  " S ", 'O', ModItems.OIngot, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ToolInit.OHoe), " OO", " S ",  " S ", 'O', ModItems.OIngot, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ToolInit.OAxe), " OO", " SO", " S ", 'O', ModItems.OIngot, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ToolInit.OAxe), "OO ", "OS ", " S ", 'O', ModItems.OIngot, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ToolInit.OShovel), " O ", " S ", " S ", 'O', ModItems.OIngot, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ToolInit.OShovel), "  O", "  S", "  S", 'O', ModItems.OIngot, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ToolInit.OShovel), "O  ", "S  ", "S  ", 'O', ModItems.OIngot, 'S', Items.STICK);
		
	}
	public static void registerSmelting() 
	{
		GameRegistry.addSmelting(ModItems.OChunk, new ItemStack(ModItems.OIngot), 10);		
	}
}
