package com.mbhabesNolieman108.MBV.init.tools;

import com.mbhabesNolieman108.MBV.MoBlockVariants;
import com.mbhabesNolieman108.MBV.reference;

import net.minecraft.item.ItemSpade;

public class ToolOShovel extends ItemSpade 
{
	public ToolOShovel(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(reference.MBVItems.O_SHOVEL.getUnlocalizedName());
		setRegistryName(reference.MBVItems.O_SHOVEL.getRegistryName());
		setCreativeTab(MoBlockVariants.CREATIVE_TAB);
	}
}
