package com.mbhabesNolieman108.MBV.blocks;

import com.mbhabesNolieman108.MBV.MoBlockVariants;
import com.mbhabesNolieman108.MBV.reference;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockCHSoulSandstone extends Block
{
	public BlockCHSoulSandstone()
	{
		super(Material.ROCK);
		setUnlocalizedName(reference.MBVBlocks.CH_SOUL_SANDSTONE.getUnlocalizedName());
		setRegistryName(reference.MBVBlocks.CH_SOUL_SANDSTONE.getRegistryName());
		setCreativeTab(MoBlockVariants.CREATIVE_TAB);
		setHardness(0.8F);
		this.setResistance(4F);
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 0);
	}
}
