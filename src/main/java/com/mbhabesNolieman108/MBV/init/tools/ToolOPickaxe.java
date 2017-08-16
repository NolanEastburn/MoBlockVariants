package com.mbhabesNolieman108.MBV.init.tools;

import com.mbhabesNolieman108.MBV.reference;

import net.minecraft.item.ItemPickaxe;

public class ToolOPickaxe extends ItemPickaxe 
{
	public ToolOPickaxe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(reference.MBVItems.O_PICKAXE.getUnlocalizedName());
		setRegistryName(reference.MBVItems.O_PICKAXE.getRegistryName());
	}
}
