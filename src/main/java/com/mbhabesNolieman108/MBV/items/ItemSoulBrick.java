package com.mbhabesNolieman108.MBV.items;

import com.mbhabesNolieman108.MBV.MoBlockVariants;
import com.mbhabesNolieman108.MBV.reference;

import net.minecraft.item.Item;
public class ItemSoulBrick extends Item
{
	public ItemSoulBrick()
	{
		setUnlocalizedName(reference.MBVItems.SOUL_BRICK.getUnlocalizedName());
		setRegistryName(reference.MBVItems.SOUL_BRICK.getRegistryName());
		setCreativeTab(MoBlockVariants.CREATIVE_TAB);
	}
}
