package com.github.rilyhugu.decoration.resource.furniture;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class FurnitureStool extends FurnitureBase {

    public FurnitureStool(Material material, String name, CreativeTabs tab, float hardness, float resistance, String tool, int harvestLevel, SoundType sound) {
        super(material, name, tab, hardness, resistance, tool, harvestLevel, sound);
    }

    public FurnitureStool(Material material, String name, CreativeTabs tab, float hardness, float resistance, SoundType sound) {
        super(material, name, tab, hardness, resistance, sound);
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){
        return new AxisAlignedBB(0.2D, 0.6D, 0.2D, 0.8D, 0.0D, 0.8D);
    }
}