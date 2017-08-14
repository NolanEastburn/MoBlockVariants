package com.mbhabesNolieman108.MBV.init.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class Diamond_Block_Pickaxe extends ItemPickaxe{

	public Diamond_Block_Pickaxe(String name,ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
}