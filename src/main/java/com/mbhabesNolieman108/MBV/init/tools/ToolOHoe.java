package com.mbhabesNolieman108.MBV.init.tools;

import com.mbhabesNolieman108.MBV.reference;

import net.minecraft.item.ItemHoe;

public class ToolOHoe extends ItemHoe 
{
	public ToolOHoe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(reference.MBVItems.O_HOE.getUnlocalizedName());
		setRegistryName(reference.MBVItems.O_HOE.getRegistryName());
	}
}
