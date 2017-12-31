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
		//SmoothGlowstone
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.smoothGlowstone, 4), "GG ", "GG ", "   ", 'G', Blocks.GLOWSTONE);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.smoothGlowstone, 4), "   ", "GG ", "GG ", 'G', Blocks.GLOWSTONE);
		//Lantern
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.lantern), "III", "GTG", "III", 'I', Items.IRON_INGOT, 'T', Blocks.TORCH, 'G', Blocks.GLASS);
		//NetherCobbelstone
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.NRCobble, 8), "CCC", "CNC", "CCC", 'C', Blocks.COBBLESTONE, 'N', Blocks.NETHERRACK);
		//Items
		//Obsidian Ingots
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.OChunk),new ItemStack(Blocks.OBSIDIAN));
		//Armor
		//Obsidian Armor
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.OBoots), "O O","O O","   ", 'O',ModItems.OIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.OBoots), "   ", "O O",  "O O", 'O',ModItems.OIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.OHelmet), "   ", "OOO",  "O O", 'O',ModItems.OIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.OHelmet), "OOO", "O O",  "   ", 'O',ModItems.OIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.OLeggings), "OOO", "O O",  "O O", 'O',ModItems.OIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ModArmor.OChestplate), "O O", "OOO",  "OOO", 'O',ModItems.OIngot);
		
		
		
		
	}
	public static void registerSmelting() 
	{
		GameRegistry.addSmelting(ModItems.OChunk, new ItemStack(ModItems.OIngot), 10);
		GameRegistry.addSmelting(ModBlocks.NRCobble, new ItemStack(ModBlocks.NRStone), 10);
	}
}
