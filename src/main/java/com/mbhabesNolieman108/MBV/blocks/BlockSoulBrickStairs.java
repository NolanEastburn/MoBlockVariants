package com.mbhabesNolieman108.MBV.blocks;

import com.mbhabesNolieman108.MBV.MoBlockVariants;
import com.mbhabesNolieman108.MBV.reference;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockSoulBrickStairs extends BlockStairs
{
	public BlockSoulBrickStairs(IBlockState state)
	{
		super(state);
		setUnlocalizedName(reference.MBVBlocks.SOUL_BRICK_STAIRS.getUnlocalizedName());
		setRegistryName(reference.MBVBlocks.SOUL_BRICK_STAIRS.getRegistryName());
		setCreativeTab(MoBlockVariants.CREATIVE_TAB);
		this.setHardness(0.8F);
		this.setResistance(30F);
		this.setHarvestLevel("pickaxe", 0);
		this.setSoundType(SoundType.STONE);
		this.useNeighborBrightness = true;
		
	}
}
