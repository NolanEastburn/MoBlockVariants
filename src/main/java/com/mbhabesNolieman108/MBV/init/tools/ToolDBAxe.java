package com.mbhabesNolieman108.MBV.init.tools;

import java.util.Set;

import com.google.common.collect.Sets;
import com.mbhabesNolieman108.MBV.MoBlockVariants;
import com.mbhabesNolieman108.MBV.reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ToolDBAxe extends ItemTool
{
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE});
    public ToolDBAxe(Item.ToolMaterial material)
    {
        super(material, EFFECTIVE_ON);
        setUnlocalizedName(reference.MBVItems.DB_AXE.getUnlocalizedName());
        setRegistryName(reference.MBVItems.DB_AXE.getRegistryName());
        setCreativeTab(MoBlockVariants.CREATIVE_TAB);
    }

    public float getStrVsBlock(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;
    }
}
