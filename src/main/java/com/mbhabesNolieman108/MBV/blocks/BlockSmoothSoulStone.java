package com.mbhabesNolieman108.MBV.blocks;

import com.mbhabesNolieman108.MBV.MoBlockVariants;
import com.mbhabesNolieman108.MBV.reference;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockSmoothSoulStone extends Block
{
	public BlockSmoothSoulStone()
	{
		super(Material.ROCK);
		setUnlocalizedName(reference.MBVBlocks.SMOOTH_SOUL_STONE.getUnlocalizedName());
		setRegistryName(reference.MBVBlocks.SMOOTH_SOUL_STONE.getRegistryName());
		setCreativeTab(MoBlockVariants.CREATIVE_TAB);
		this.setHardness(0.8F);
		this.setResistance(4F);
		this.setHarvestLevel("pickaxe", 0);
		this.setSoundType(SoundType.STONE);
	}
}
