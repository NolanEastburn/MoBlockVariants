package com.mbhabesNolieman108.MBV.init;


import com.mbhabesNolieman108.MBV.blocks.BlockLantern;
import com.mbhabesNolieman108.MBV.blocks.BlockSmoothGlowstone;
import com.mbhabesNolieman108.MBV.blocks.BlockSmoothOB;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks
{
	public static Block smoothOB;
	public static Block smoothGlowstone;
	public static Block lantern;
	
	public static void init()
	{
		smoothOB = new BlockSmoothOB();
		smoothGlowstone = new BlockSmoothGlowstone();
		lantern = new BlockLantern();
	}
	
	public static void register() 
	{
		registerBlock(smoothOB);
		registerBlock(smoothGlowstone);
		registerBlock(lantern);
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
	}
	
	private static void registerRender(Block block) 
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
