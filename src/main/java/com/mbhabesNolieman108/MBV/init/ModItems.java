package com.mbhabesNolieman108.MBV.init;

import com.mbhabesNolieman108.MBV.reference;
import com.mbhabesNolieman108.MBV.items.ItemChunk;
import com.mbhabesNolieman108.MBV.items.ItemOChunk;
import com.mbhabesNolieman108.MBV.items.ItemOIngot;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems 
{
	
	public static Item chunk;
	public static Item OChunk;
	public static Item OIngot;
	public static void init( ) 
	{
		chunk = new ItemChunk();
		OChunk = new ItemOChunk();
		OIngot = new ItemOIngot();
		
	}
	
	public static void register() 
	{
		GameRegistry.register(chunk);
		GameRegistry.register(OChunk);
		GameRegistry.register(OIngot);
	}
	
	public static void registerRenders() 
	{
		registerRender(chunk);
		registerRender(OChunk);
		registerRender(OIngot);
	
	}
	
	private static void registerRender(Item item) 
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
