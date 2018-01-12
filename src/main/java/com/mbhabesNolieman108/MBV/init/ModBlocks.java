package com.mbhabesNolieman108.MBV.init;


import com.mbhabesNolieman108.MBV.blocks.BlockLantern;
import com.mbhabesNolieman108.MBV.blocks.BlockNRCobble;
import com.mbhabesNolieman108.MBV.blocks.BlockNRStone;
import com.mbhabesNolieman108.MBV.blocks.BlockOBStairs;
import com.mbhabesNolieman108.MBV.blocks.BlockSmoothGlowstone;
import com.mbhabesNolieman108.MBV.blocks.BlockSmoothOB;
import com.mbhabesNolieman108.MBV.blocks.BlockSmoothSoulSandstone;
import com.mbhabesNolieman108.MBV.blocks.BlockSoulBrickStairs;
import com.mbhabesNolieman108.MBV.blocks.BlockSoulBricks;
import com.mbhabesNolieman108.MBV.blocks.BlockSoulSandstone;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks
{
	public static Block smoothOB;
	public static Block smoothGlowstone;
	public static Block lantern;
	public static Block NRCobble;
	public static Block NRStone;
	public static Block soulBricks;
	public static BlockSoulBrickStairs soulBrickStairs;
	public static Block smoothSoulSandstone;
	public static Block soulSandstone;
	public static BlockOBStairs OBStairs;
	
	public static void init()
	{
		smoothOB = new BlockSmoothOB();
		smoothGlowstone = new BlockSmoothGlowstone();
		lantern = new BlockLantern();
		NRCobble = new BlockNRCobble();
		NRStone = new BlockNRStone();
		soulBricks = new BlockSoulBricks();
		soulBrickStairs = new BlockSoulBrickStairs(soulBricks.getDefaultState());
		smoothSoulSandstone = new BlockSmoothSoulSandstone();
		soulSandstone = new BlockSoulSandstone();
		OBStairs = new BlockOBStairs(Blocks.OBSIDIAN.getDefaultState());
	}
	
	public static void register() 
	{
		registerBlock(smoothOB);
		registerBlock(smoothGlowstone);
		registerBlock(lantern);
		registerBlock(NRCobble);
		registerBlock(NRStone);
		registerBlock(soulBricks);
		registerBlock(soulBrickStairs);
		registerBlock(smoothSoulSandstone);
		registerBlock(soulSandstone);
		registerBlock(OBStairs);
	}
	
	public static void registerBlock(Block block) 
	{
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() 
	{
		registerRender(smoothOB);
		registerRender(smoothGlowstone);
		registerRender(lantern);
		registerRender(NRCobble);
		registerRender(NRStone);
		registerRender(soulBricks);
		registerRender(soulBrickStairs);
		registerRender(smoothSoulSandstone);
		registerRender(soulSandstone);
		registerRender(OBStairs);
	}
	
	private static void registerRender(Block block) 
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
