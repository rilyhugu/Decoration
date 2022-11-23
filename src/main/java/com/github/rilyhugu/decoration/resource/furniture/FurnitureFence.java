package com.github.rilyhugu.decoration.resource.furniture;

import com.github.rilyhugu.decoration.init.InitBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class FurnitureFence extends FurnitureBase {
    private String name;
    private Block drop = this;

    public FurnitureFence(Material material, String name, CreativeTabs tab, float hardness, float resistance, String tool, int harvestLevel, SoundType sound) {
        super(material, name, tab, hardness, resistance, tool, harvestLevel, sound);
        this.name = name;
    }

    public FurnitureFence(Material material, String name, CreativeTabs tab, float hardness, float resistance, SoundType sound) {
        super(material, name, tab, hardness, resistance, sound);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDrop(FurnitureFence drop) {
        this.drop = drop;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(this.drop);
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        EnumFacing facing = state.getValue(FACING);

        if (facing == EnumFacing.NORTH || facing == EnumFacing.SOUTH) {
            if (worldIn.getBlockState(pos.west()).getBlock() == this) {
                if (worldIn.getBlockState(pos.west()).getValue(FACING) == facing && worldIn.getBlockState(pos.west()).getBlock() == this) {
                    worldIn.setBlockState(pos, InitBlock.DC_FURNITURE_FENCE.get(this.getName()).getFencePart().getDefaultState().withProperty(FACING, facing));
                }
            } else if (worldIn.getBlockState(pos.east()).getBlock() == this) {
                if (worldIn.getBlockState(pos.east()).getValue(FACING) == facing && worldIn.getBlockState(pos.east()).getBlock() == this) {
                    worldIn.setBlockState(pos, InitBlock.DC_FURNITURE_FENCE.get(this.getName()).getFencePart().getDefaultState().withProperty(FACING, facing));
                }
            }
        } else if (facing == EnumFacing.EAST || facing == EnumFacing.WEST) {
            if (worldIn.getBlockState(pos.north()).getBlock() == this) {
                if (worldIn.getBlockState(pos.north()).getValue(FACING) == facing && worldIn.getBlockState(pos.north()).getBlock() == this) {
                    worldIn.setBlockState(pos, InitBlock.DC_FURNITURE_FENCE.get(this.getName()).getFencePart().getDefaultState().withProperty(FACING, facing));
                }
            } else if (worldIn.getBlockState(pos.south()).getBlock() == this) {
                if (worldIn.getBlockState(pos.south()).getValue(FACING) == facing && worldIn.getBlockState(pos.south()).getBlock() == this) {
                    worldIn.setBlockState(pos, InitBlock.DC_FURNITURE_FENCE.get(this.getName()).getFencePart().getDefaultState().withProperty(FACING, facing));
                }
            }
        }
    }

    public static class FurnitureFencePart extends FurnitureFence {
        private String name;

        public FurnitureFencePart(Material material, String name, CreativeTabs tab, float hardness, float resistance, String tool, int harvestLevel, SoundType sound) {
            super(material, name + "_part", tab, hardness, resistance, tool, harvestLevel, sound);
            this.name = name;
        }

        public FurnitureFencePart(Material material, String name, CreativeTabs tab, float hardness, float resistance, SoundType sound) {
            super(material, name + "_part", tab, hardness, resistance, sound);
            this.name = name;
        }

        @Override
        public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {}
    }
}
