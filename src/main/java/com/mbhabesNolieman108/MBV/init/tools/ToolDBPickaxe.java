package com.mbhabesNolieman108.MBV.init.tools;

import com.mbhabesNolieman108.MBV.MoBlockVariants;
import com.mbhabesNolieman108.MBV.reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ToolDBPickaxe extends ItemPickaxe
{

	public ToolDBPickaxe(ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName(reference.MBVItems.DB_PICKAXE.getUnlocalizedName());
		setRegistryName(reference.MBVItems.DB_PICKAXE.getRegistryName());
		setCreativeTab(MoBlockVariants.CREATIVE_TAB);
	}
}