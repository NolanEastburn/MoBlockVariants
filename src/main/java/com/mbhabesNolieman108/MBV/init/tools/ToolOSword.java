package com.mbhabesNolieman108.MBV.init.tools;

import com.mbhabesNolieman108.MBV.reference;

import net.minecraft.item.ItemSword;

public class ToolOSword extends ItemSword 
{
	public ToolOSword(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(reference.MBVItems.O_SWORD.getUnlocalizedName());
		setRegistryName(reference.MBVItems.O_SWORD.getRegistryName());
	}
}
