package com.mbhabesNolieman108.MBV;

import com.mbhabesNolieman108.MBV.init.ModArmor;
import com.mbhabesNolieman108.MBV.init.ModBlocks;
import com.mbhabesNolieman108.MBV.init.ModCrafting;
import com.mbhabesNolieman108.MBV.init.ModItems;
import com.mbhabesNolieman108.MBV.init.ModTools;
import com.mbhabesNolieman108.MBV.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = reference.MOD_ID, name = reference.NAME, version = reference.VERSION, acceptedMinecraftVersions = reference.ACCEPTED_VERSIONS)
public class MoBlockVariants 
{
	
	@Instance 
	public static MoBlockVariants instance;
	
	@SidedProxy(clientSide = reference.CLIENT_PROXY_CLASS, serverSide = reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CreativeTabs CREATIVE_TAB = new MBVTab();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		System.out.println("Pre Init");
		
		ModTools.init();
		ModTools.register();
		ModItems.init();
		ModItems.register();
		ModArmor.init();
		ModArmor.register();
		ModBlocks.init();
		ModBlocks.register();
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		proxy.init();
		System.out.println("Init");
		
		ModCrafting.registerCrafting();
		ModCrafting.registerSmelting();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) 
	{
		System.out.println("Post Init");
	}
}
