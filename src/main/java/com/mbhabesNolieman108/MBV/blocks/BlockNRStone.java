package com.mbhabesNolieman108.MBV.blocks;

import java.util.Random;

import com.mbhabesNolieman108.MBV.MoBlockVariants;
import com.mbhabesNolieman108.MBV.reference;
import com.mbhabesNolieman108.MBV.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

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
