package com.mbhabesNolieman108.MBV;

import com.mbhabesNolieman108.MBV.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MBVTab extends CreativeTabs
{
	public MBVTab() 
	{
		super("tabMBV");
	}
	
	@Override
	public Item getTabIconItem() 
	{
		return ModItems.OIngot;
	}
}
