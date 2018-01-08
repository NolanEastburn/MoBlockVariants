package com.mbhabesNolieman108.MBV.blocks;

import com.mbhabesNolieman108.MBV.MoBlockVariants;
import com.mbhabesNolieman108.MBV.reference;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
public class BlockSoulSandstone extends Block
{
	public BlockSoulSandstone()
	{
		super(Material.ROCK);
		setUnlocalizedName(reference.MBVBlocks.SOUL_SANDSTONE.getUnlocalizedName());
		setRegistryName(reference.MBVBlocks.SOUL_SANDSTONE.getRegistryName());
		setCreativeTab(MoBlockVariants.CREATIVE_TAB);
		this.setHardness(0.8F);
		this.setResistance(4F);
		this.setSoundType(SoundType.STONE);
		this.setHarvestLevel("pickaxe", 0);
	}
}
