package com.mbhabesNolieman108.MBV.init.armor;

import com.mbhabesNolieman108.MBV.MoBlockVariants;
import com.mbhabesNolieman108.MBV.reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorOBoots extends ItemArmor 
{

	public ArmorOBoots(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(reference.MBVArmor.O_BOOTS.getUnlocalizedName());
		setRegistryName(reference.MBVArmor.O_BOOTS.getRegistryName());
		setCreativeTab(MoBlockVariants.CREATIVE_TAB);
	}

}
