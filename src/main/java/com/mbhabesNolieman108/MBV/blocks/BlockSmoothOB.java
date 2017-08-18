package com.mbhabesNolieman108.MBV.blocks;

import com.mbhabesNolieman108.MBV.MoBlockVariants;
import com.mbhabesNolieman108.MBV.reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSmoothOB extends Block 
{
	public BlockSmoothOB()
	{
		super(Material.ROCK);
		setUnlocalizedName(reference.MBVBlocks.SMOOTH_OB.getUnlocalizedName());
		setRegistryName(reference.MBVBlocks.SMOOTH_OB.getRegistryName());
		setCreativeTab(MoBlockVariants.CREATIVE_TAB);
		setHardness(25.0F);
	}
}
