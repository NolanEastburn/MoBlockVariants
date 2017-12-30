package com.mbhabesNolieman108.MBV.blocks;

import com.mbhabesNolieman108.MBV.MoBlockVariants;
import com.mbhabesNolieman108.MBV.reference;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockSmoothGlowstone extends Block 
{
	public BlockSmoothGlowstone()
	{
		super(Material.GLASS);
		setUnlocalizedName(reference.MBVBlocks.SMOOTH_GLOWSTONE.getUnlocalizedName());
		setRegistryName(reference.MBVBlocks.SMOOTH_GLOWSTONE.getRegistryName());
		setCreativeTab(MoBlockVariants.CREATIVE_TAB);
		setLightLevel(1F);
		setSoundType(SoundType.GLASS);
		
	}
			
}
