package com.github.rilyhugu.decoration.resource.furniture;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class FurnitureWallBoard extends FurnitureBase {
    public FurnitureWallBoard(Material material, String name, CreativeTabs tab, float hardness, float resistance, String tool, int harvestLevel, SoundType sound) {
        super(material, name, tab, hardness, resistance, tool, harvestLevel, sound);
    }

    public FurnitureWallBoard(Material material, String name, CreativeTabs tab, float hardness, float resistance, SoundType sound) {
        super(material, name, tab, hardness, resistance, sound);
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        AxisAlignedBB axisalignedbb;
        switch (state.getValue(FACING)) {
            case NORTH:
            default:
                axisalignedbb = new AxisAlignedBB(0.0D, 0.0D, 0.8125D, 1.0D, 1.0D, 1.0D);
                break;
            case SOUTH:
                axisalignedbb = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.1875D);
                break;
            case WEST:
                axisalignedbb = new AxisAlignedBB(0.8125D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
                break;
            case EAST:
                axisalignedbb = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.1875D, 1.0D, 1.0D);
        }
        return axisalignedbb;
    }
}
