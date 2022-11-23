package com.github.rilyhugu.decoration.resource.furniture;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class FurnitureWallRack extends FurnitureConnectableHorizontal {

    public FurnitureWallRack(Material material, String name, CreativeTabs tab, float hardness, float resistance, String tool, int harvestLevel, SoundType sound) {
        super(material, name, tab, hardness, resistance, tool, harvestLevel, sound);
    }

    public FurnitureWallRack(Material material, String name, CreativeTabs tab, float hardness, float resistance, SoundType sound) {
        super(material, name, tab, hardness, resistance, sound);
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){
        AxisAlignedBB axisalignedbb;
        if(state.getValue(FACING) == EnumFacing.NORTH) {
            axisalignedbb = new AxisAlignedBB(0.0D, 1.0D, 0.5D, 1.0D, 0.4D, 1.0D);
        } else if(state.getValue(FACING) == EnumFacing.SOUTH) {
            axisalignedbb = new AxisAlignedBB(0.0D, 1.0D, 0.0D, 1.0D, 0.4D, 0.5D);
        } else if(state.getValue(FACING) == EnumFacing.WEST) {
            axisalignedbb = new AxisAlignedBB(0.5D, 1.0D, 0.0D, 1.0D, 0.4D, 1.0D);
        } else {
            axisalignedbb = new AxisAlignedBB(0.0D, 1.0D, 0.0D, 0.5D, 0.4D, 1.0D);
        }
        return axisalignedbb;
    }
}
