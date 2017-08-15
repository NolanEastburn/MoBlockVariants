package com.mbhabesNolieman108.MBV.init.tools;

import com.mbhabesNolieman108.MBV.reference;

import net.minecraft.item.ItemSpade;

public class ToolDBShovel extends ItemSpade 
{
	public ToolDBShovel(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(reference.MBVItems.DB_SHOVEL.getUnlocalizedName());
		setRegistryName(reference.MBVItems.DB_SHOVEL.getRegistryName());
	}
}
