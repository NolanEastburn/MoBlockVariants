package com.mbhabesNolieman108.MBV.init;

import com.mbhabesNolieman108.MBV.reference;
import com.mbhabesNolieman108.MBV.items.ItemChunk;
import com.mbhabesNolieman108.MBV.items.ItemDBSword;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems 
{
	
	public static Item chunk;
	public static Item DBSword;
	
	public static void init( ) 
	{
		chunk = new ItemChunk();
		DBSword = new ItemDBSword();
		
	}
	
	public static void register() 
	{
		GameRegistry.register(chunk);
		GameRegistry.register(DBSword);
		
	}
	
	public static void registerRenders() 
	{
		registerRender(chunk);
		registerRender(DBSword);
	
	}
	
	private static void registerRender(Item item) 
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		
	}
	
}
