package com.mbhabesNolieman108.MBV;

public class reference 
{

	public static final String MOD_ID = "MBV";
	public static final String NAME = "Mo'Block Variants";
	public static final String VERSION = "Alpha 0.1";
	public static final String ACCEPTED_VERSIONS = "[1.10.2]";
	
	public static final String CLIENT_PROXY_CLASS = "com.mbhabesNolieman108.MBV.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.mbhabesNolieman108.MBV.proxy.ServerProxy";
	
	public static enum MBVItems
	{
		CHUNK("chunk", "ItemChunk"),
		DB_SWORD("DBSword", "ToolDBSword"),
		DB_PICKAXE("DBPickaxe", "ToolDBPickaxe"),
		DB_SHOVEL("DBShovel", "ToolDBShovel"),
		DB_HOE("DBHoe", "ToolDBHoe"),
		DB_AXE("DBAxe", "ToolDBAxe");
		
		
		private String unlocalizedName;
		private String registryName;
		
	MBVItems(String unlocalizedName, String registryName)
	{
		this.unlocalizedName = unlocalizedName;
		this.registryName = registryName;
	}
	public String getUnlocalizedName() 
	{
		return unlocalizedName;
	}
	
	
	public String getRegistryName() 
	{
		return registryName;
	}
	
	}
}
