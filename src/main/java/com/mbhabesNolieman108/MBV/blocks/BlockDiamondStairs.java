package com.mbhabesNolieman108.MBV.blocks;

import com.mbhabesNolieman108.MBV.MoBlockVariants;
import com.mbhabesNolieman108.MBV.reference;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockDiamondStairs extends BlockStairs
{
	public BlockDiamondStairs(IBlockState state)
	{
		super(state);
		setUnlocalizedName(reference.MBVBlocks.DIAMOND_STAIRS.getUnlocalizedName());
		setRegistryName(reference.MBVBlocks.DIAMOND_STAIRS.getRegistryName());
		setCreativeTab(MoBlockVariants.CREATIVE_TAB);
		this.setHardness(5F);
		this.setResistance(30F);
		this.setHarvestLevel("pickaxe", 2);
		this.setSoundType(SoundType.STONE);
		this.useNeighborBrightness = true;
	}
}
