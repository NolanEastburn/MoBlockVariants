package com.mbhabesNolieman108.MBV.blocks;

import com.mbhabesNolieman108.MBV.MoBlockVariants;
import com.mbhabesNolieman108.MBV.reference;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockOBStairs extends BlockStairs
{
	public BlockOBStairs(IBlockState state)
	{
		super(state);
		setUnlocalizedName(reference.MBVBlocks.OB_STAIRS.getUnlocalizedName());
		setRegistryName(reference.MBVBlocks.OB_STAIRS.getRegistryName());
		setCreativeTab(MoBlockVariants.CREATIVE_TAB);
		this.setHardness(50F);
		this.setResistance(6000F);
		this.setHarvestLevel("pickaxe", 3);
		this.setSoundType(SoundType.STONE);
		this.useNeighborBrightness = true;
		this.setResistance(6000F);
	}
}
