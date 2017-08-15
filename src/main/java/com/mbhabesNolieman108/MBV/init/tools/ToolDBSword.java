package com.mbhabesNolieman108.MBV.init.tools;

import com.mbhabesNolieman108.MBV.reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class ToolDBSword extends ItemSword{
	public ToolDBSword(ToolMaterial material) {
		super(material);
		setUnlocalizedName(reference.MBVItems.DB_SWORD.getUnlocalizedName());
		setRegistryName(reference.MBVItems.DB_SWORD.getRegistryName());
	}
	
}
	
