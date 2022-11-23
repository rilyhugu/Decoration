package com.github.rilyhugu.decoration.resource.furniture;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class FurnitureConnectableHorizontal extends FurnitureBase {
    public static final PropertyBool LEFT = PropertyBool.create("left");
    public static final PropertyBool RIGHT = PropertyBool.create("right");

    public FurnitureConnectableHorizontal(Material material, String name, CreativeTabs tab, float hardness, float resistance, String tool, int harvestLevel, SoundType sound) {
        super(material, name, tab, hardness, resistance, tool, harvestLevel, sound);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(LEFT, false).withProperty(RIGHT, false));
    }

    public FurnitureConnectableHorizontal(Material material, String name, CreativeTabs tab, float hardness, float resistance, SoundType sound) {
        super(material, name, tab, hardness, resistance, sound);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(LEFT, false).withProperty(RIGHT, false));
    }

    @Override
    public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
        EnumFacing facing = state.getValue(FACING);
        IBlockState stateWest = worldIn.getBlockState(pos.west());
        IBlockState stateEast = worldIn.getBlockState(pos.east());
        IBlockState stateSouth = worldIn.getBlockState(pos.south());
        IBlockState stateNorth = worldIn.getBlockState(pos.north());
        switch (facing) {
            case NORTH:
                if(stateWest.getBlock() == this && stateWest.getValue(FACING) == EnumFacing.NORTH) {
                    state = state.withProperty(RIGHT, true);
                }
                if(stateEast.getBlock() == this && stateEast.getValue(FACING) == EnumFacing.NORTH) {
                    state = state.withProperty(LEFT, true);
                }
                break;
            case SOUTH:
                if(stateEast.getBlock() == this && stateEast.getValue(FACING) == EnumFacing.SOUTH) {
                    state = state.withProperty(RIGHT, true);
                }
                if(stateWest.getBlock() == this && stateWest.getValue(FACING) == EnumFacing.SOUTH) {
                    state = state.withProperty(LEFT, true);
                }
                break;
            case EAST:
                if(stateNorth.getBlock() == this && stateNorth.getValue(FACING) == EnumFacing.EAST) {
                    state = state.withProperty(RIGHT, true);
                }
                if(stateSouth.getBlock() == this && stateSouth.getValue(FACING) == EnumFacing.EAST) {
                    state = state.withProperty(LEFT, true);
                }
                break;
            case WEST:
                if(stateSouth.getBlock() == this && stateSouth.getValue(FACING) == EnumFacing.WEST) {
                    state = state.withProperty(RIGHT, true);
                }
                if(stateNorth.getBlock() == this && stateNorth.getValue(FACING) == EnumFacing.WEST) {
                    state = state.withProperty(LEFT, true);
                }
                break;
        }
        return state;
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, FACING, LEFT, RIGHT);
    }
}
