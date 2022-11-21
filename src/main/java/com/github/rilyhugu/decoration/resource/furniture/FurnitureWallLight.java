package com.github.rilyhugu.decoration.resource.furniture;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class FurnitureWallLight extends PropBase{
    public FurnitureWallLight(Material material, String name, CreativeTabs tab, float hardness, float resistance, String tool, int harvestLevel, SoundType sound, Float lightLevel) {
        super(material, name, tab, hardness, resistance, tool, harvestLevel, sound);
        this.setLightLevel(lightLevel);
    }

    public FurnitureWallLight(Material material, String name, CreativeTabs tab, float hardness, float resistance, SoundType sound, Float lightLevel) {
        super(material, name, tab, hardness, resistance, sound);
        this.setLightLevel(lightLevel);
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){
        AxisAlignedBB axisalignedbb;
        if(state.getValue(FACING) == EnumFacing.NORTH) {
            axisalignedbb = new AxisAlignedBB(0.25D, 1.0D, 0.5D, 0.75D, 0.0D, 1.0D);
        } else if(state.getValue(FACING) == EnumFacing.SOUTH) {
            axisalignedbb = new AxisAlignedBB(0.25D, 1.0D, 0.0D, 0.75D, 0.0D, 0.5D);
        } else if(state.getValue(FACING) == EnumFacing.WEST) {
            axisalignedbb = new AxisAlignedBB(0.5D, 1.0D, 0.25D, 1.0D, 0.0D, 0.75D);
        } else {
            axisalignedbb = new AxisAlignedBB(0.0D, 1.0D, 0.25D, 0.5D, 0.0D, 0.75D);
        }
        return axisalignedbb;
    }

    @Override
    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        if (facing.getAxis().isHorizontal() && this.canAttachTo(worldIn, pos.offset(facing.getOpposite()), facing)) {
            return this.getDefaultState().withProperty(FACING, facing);
        }
        else {
            for (EnumFacing enumfacing : EnumFacing.Plane.HORIZONTAL) {
                if (this.canAttachTo(worldIn, pos.offset(enumfacing.getOpposite()), enumfacing)) {
                    return this.getDefaultState().withProperty(FACING, enumfacing);
                }
            }
            return this.getDefaultState();
        }
    }

    @Override
    public boolean canPlaceBlockOnSide(World worldIn, BlockPos pos, EnumFacing side) {
        if (this.canAttachTo(worldIn, pos.west(), side)) {
            return true;
        } else if (this.canAttachTo(worldIn, pos.east(), side)) {
            return true;
        } else if (this.canAttachTo(worldIn, pos.north(), side)) {
            return true;
        } else {
            return this.canAttachTo(worldIn, pos.south(), side);
        }
    }

    private boolean canAttachTo(World p_193392_1_, BlockPos p_193392_2_, EnumFacing p_193392_3_) {
        IBlockState iblockstate = p_193392_1_.getBlockState(p_193392_2_);
        boolean flag = isExceptBlockForAttachWithPiston(iblockstate.getBlock());
        return !flag && iblockstate.getBlockFaceShape(p_193392_1_, p_193392_2_, p_193392_3_) == BlockFaceShape.SOLID && !iblockstate.canProvidePower();
    }
}
