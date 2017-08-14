package com.mbhabesNolieman108.MBV.init;

import com.mbhabesNolieman108.MBV.init.tools.CustomSword;
import com.mbhabesNolieman108.MBV.init.tools.Diamond_Block_Pickaxe;
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
	
	public static final ToolMaterial tutorial = EnumHelper.addToolMaterial("tutorial", 3, 3122, 10.0F, 5.0F, 12);	
	public static Item tutorial_sword;
	public static Item DBPickaxe;
	
	public static void init( ) 
	{
		tutorial_sword = new CustomSword("tutorial_sword",tutorial);
		DBPickaxe = new Diamond_Block_Pickaxe("DBPickaxe", tutorial);
		
	}
	
	public static void register() 
	{
		GameRegistry.register(tutorial_sword);
		GameRegistry.register(DBPickaxe);
		
	}
	
	public static void registerRenders() 
	{
		registerRender(tutorial_sword);
		registerRender(DBPickaxe);
	
	}
	
	private static void registerRender(Item item) 
	{
		ForgeRegistries.ITEMS.register(item);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, 
	    new ModelResourceLocation(reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}
	
}
