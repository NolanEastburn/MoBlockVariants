package com.mbhabesNolieman108.MBV.blocks;

import com.mbhabesNolieman108.MBV.MoBlockVariants;
import com.mbhabesNolieman108.MBV.reference;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockNRStone extends Block
{
	public BlockNRStone()
	{
		super(Material.ROCK);
		setUnlocalizedName(reference.MBVBlocks.NR_STONE.getUnlocalizedName());
		setRegistryName(reference.MBVBlocks.NR_STONE.getRegistryName());
		setCreativeTab(MoBlockVariants.CREATIVE_TAB);
		setHardness(0.8F);
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 0);
	}
}
