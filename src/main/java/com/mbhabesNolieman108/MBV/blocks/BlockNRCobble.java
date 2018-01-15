package com.mbhabesNolieman108.MBV.blocks;

import com.mbhabesNolieman108.MBV.MoBlockVariants;
import com.mbhabesNolieman108.MBV.reference;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockNRCobble extends Block
{
	public BlockNRCobble()
	{
		super(Material.ROCK);
		setUnlocalizedName(reference.MBVBlocks.NR_COBBLE.getUnlocalizedName());
		setRegistryName(reference.MBVBlocks.NR_COBBLE.getRegistryName());
		setCreativeTab(MoBlockVariants.CREATIVE_TAB);
		setHardness(1.2F);
		this.setResistance(30F);
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 0);
	}
}
