package com.mbhabesNolieman108.MBV.init.tools;

import com.mbhabesNolieman108.MBV.MoBlockVariants;
import com.mbhabesNolieman108.MBV.reference;

import net.minecraft.item.ItemHoe;

public class ToolDBHoe extends ItemHoe 
{
	public ToolDBHoe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(reference.MBVItems.DB_HOE.getUnlocalizedName());
		setRegistryName(reference.MBVItems.DB_HOE.getRegistryName());
		setCreativeTab(MoBlockVariants.CREATIVE_TAB);
	}
}
