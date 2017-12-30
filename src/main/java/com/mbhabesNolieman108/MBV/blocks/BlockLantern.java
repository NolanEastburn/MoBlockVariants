package com.mbhabesNolieman108.MBV.blocks;

import com.mbhabesNolieman108.MBV.MoBlockVariants;
import com.mbhabesNolieman108.MBV.reference;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;

public class BlockLantern extends Block
{
	public BlockLantern()
	{
		super(Material.GLASS);
		setUnlocalizedName(reference.MBVBlocks.LANTERN.getUnlocalizedName());
		setRegistryName(reference.MBVBlocks.LANTERN.getRegistryName());
		setCreativeTab(MoBlockVariants.CREATIVE_TAB);
		setHardness(0.5F);
		setLightLevel(0.9F);
		setSoundType(SoundType.METAL);
	}
     @Override
    public boolean isFullCube(IBlockState state) {
    	return false;    	
    }
     @Override
    public boolean isOpaqueCube(IBlockState state) {
    	return false;
    }
     @Override
    public BlockRenderLayer getBlockLayer() {
    	return BlockRenderLayer.TRANSLUCENT;
    }
}
