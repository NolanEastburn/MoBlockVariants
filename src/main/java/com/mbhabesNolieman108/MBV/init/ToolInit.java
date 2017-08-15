package com.mbhabesNolieman108.MBV.init;

import com.mbhabesNolieman108.MBV.init.tools.ToolDBSword;
import com.mbhabesNolieman108.MBV.init.tools.ToolDBAxe;
import com.mbhabesNolieman108.MBV.init.tools.ToolDBHoe;
import com.mbhabesNolieman108.MBV.init.tools.ToolDBPickaxe;
import com.mbhabesNolieman108.MBV.init.tools.ToolDBShovel;
import com.mbhabesNolieman108.MBV.reference;

import java.lang.ref.Reference;

import com.mbhabesNolieman108.MBV.MoBlockVariants;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ToolInit 
{
	
	public static final ToolMaterial DBSMat = EnumHelper.addToolMaterial("DBSMat", 3, 3122, 10.0F, 10.0F, 12);
	public static final ToolMaterial DBToolMat = EnumHelper.addToolMaterial("DBPMat", 3, 3122, 12.0F, 6.0F, 12);
	public static final ToolMaterial DBAMat = EnumHelper.addToolMaterial("DBAxe", 3, 3122, 10.0F, 19.0F, 12);
	public static Item DBSword;
	public static Item DBPickaxe;
	public static Item DBShovel;
	public static Item DBHoe;
	public static Item DBAxe;
	
	public static void init() 
	{
		DBSword = new ToolDBSword(DBSMat);
		DBPickaxe = new ToolDBPickaxe(DBToolMat);
		DBShovel = new ToolDBShovel(DBToolMat);
		DBHoe = new ToolDBHoe(DBToolMat);
		DBAxe = new ToolDBAxe(DBAMat);
	}
	
	public static void register() 
	{
		GameRegistry.register(DBSword);
		GameRegistry.register(DBPickaxe);
		GameRegistry.register(DBShovel);
		GameRegistry.register(DBHoe);
		GameRegistry.register(DBAxe);
	}
	
	public static void registerRenders() 
	{
		registerRender(DBSword);
		registerRender(DBPickaxe);
		registerRender(DBShovel);
		registerRender(DBHoe);
		registerRender(DBAxe);
	}
	
	private static void registerRender(Item item) 
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
