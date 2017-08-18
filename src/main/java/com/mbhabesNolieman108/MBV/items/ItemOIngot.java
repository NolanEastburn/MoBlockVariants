package com.mbhabesNolieman108.MBV.items;

import com.mbhabesNolieman108.MBV.MoBlockVariants;
import com.mbhabesNolieman108.MBV.reference;

import net.minecraft.item.Item;

public class ItemOIngot extends Item 
{
	
	public ItemOIngot() 
	{
	setUnlocalizedName(reference.MBVItems.O_Ingot.getUnlocalizedName());
	setRegistryName(reference.MBVItems.O_Ingot.getRegistryName());
	setCreativeTab(MoBlockVariants.CREATIVE_TAB);
	}
}
