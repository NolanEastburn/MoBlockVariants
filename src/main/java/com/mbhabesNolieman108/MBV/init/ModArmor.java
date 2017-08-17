package com.mbhabesNolieman108.MBV.init;

import com.mbhabesNolieman108.MBV.reference;
import com.mbhabesNolieman108.MBV.init.armor.ArmorOBoots;
import com.mbhabesNolieman108.MBV.init.armor.ArmorOChestplate;
import com.mbhabesNolieman108.MBV.init.armor.ArmorOHelmet;
import com.mbhabesNolieman108.MBV.init.armor.ArmorOLeggings;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModArmor 
{
	public static final ArmorMaterial OBAMat = EnumHelper.addArmorMaterial("OBAMat", reference.MOD_ID + ":test", 33, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	public static Item OHelmet;
	public static Item OChestplate;
	public static Item OLeggings;
	public static Item OBoots;
	
	public static void init()
	{
		OHelmet = new ArmorOHelmet(OBAMat, 1, EntityEquipmentSlot.HEAD);
		OChestplate = new ArmorOChestplate(OBAMat, 1, EntityEquipmentSlot.CHEST);
		OLeggings = new ArmorOLeggings(OBAMat, 1, EntityEquipmentSlot.LEGS);
		OBoots = new ArmorOBoots(OBAMat, 1, EntityEquipmentSlot.FEET);
	}
	
	public static void register() 
	{
		GameRegistry.register(OHelmet);
		GameRegistry.register(OChestplate);
		GameRegistry.register(OLeggings);
		GameRegistry.register(OBoots);
	}
	
	public static void registerRenders() 
	{
		registerItem(OHelmet);
		registerItem(OChestplate);
		registerItem(OLeggings);
		registerItem(OBoots);
	}
	
	public static void registerItem(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
