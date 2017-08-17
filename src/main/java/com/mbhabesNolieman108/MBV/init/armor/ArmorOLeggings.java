package com.mbhabesNolieman108.MBV.init.armor;

import com.mbhabesNolieman108.MBV.reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorOLeggings extends ItemArmor 
{

	public ArmorOLeggings(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(reference.MBVArmor.O_LEGGINGS.getUnlocalizedName());
		setRegistryName(reference.MBVArmor.O_LEGGINGS.getRegistryName());
	}

}
