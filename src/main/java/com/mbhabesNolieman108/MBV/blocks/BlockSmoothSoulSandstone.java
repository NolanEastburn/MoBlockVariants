package com.mbhabesNolieman108.MBV.blocks;

import com.mbhabesNolieman108.MBV.MoBlockVariants;
import com.mbhabesNolieman108.MBV.reference;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockSmoothSoulSandstone extends Block
{
	public BlockSmoothSoulSandstone()
	{
		super(Material.ROCK);
		setUnlocalizedName(reference.MBVBlocks.SMOOTH_SOUL_SANDSTONE.getUnlocalizedName());
		setRegistryName(reference.MBVBlocks.SMOOTH_SOUL_SANDSTONE.getRegistryName());
		setCreativeTab(MoBlockVariants.CREATIVE_TAB);
		this.setHardness(0.8F);
		this.setResistance(4F);
		this.setHarvestLevel("pickaxe", 0);
		this.setSoundType(SoundType.STONE);
	}
}
