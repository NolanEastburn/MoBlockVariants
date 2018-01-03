package com.mbhabesNolieman108.MBV.blocks;

import com.mbhabesNolieman108.MBV.MoBlockVariants;
import com.mbhabesNolieman108.MBV.reference;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockSoulStone extends Block
{
	public BlockSoulStone()
	{
		super(Material.ROCK);
		setUnlocalizedName(reference.MBVBlocks.SOULSTONE.getUnlocalizedName());
		setRegistryName(reference.MBVBlocks.SOULSTONE.getRegistryName());
		setCreativeTab(MoBlockVariants.CREATIVE_TAB);
		this.setHardness(0.8F);
		this.setResistance(4F);
		this.setSoundType(SoundType.STONE);
	}
}
