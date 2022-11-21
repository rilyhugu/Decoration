package com.github.rilyhugu.decoration.resource.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.github.rilyhugu.decoration.Decoration.MOD_ID;

public class BrickEdging extends Block {
    public static final PropertyEnum<BrickEdging.EnumShape> SHAPE = PropertyEnum.create("shape", BrickEdging.EnumShape.class);
    public static final PropertyDirection FACING = BlockHorizontal.FACING;

    public BrickEdging(Material material, String name, CreativeTabs tab, float hardness, float resistance, String tool, int harvestLevel, SoundType sound) {
        super(material);
        this.setRegistryName(MOD_ID, name);
        this.setTranslationKey(name);
        this.setCreativeTab(tab);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setHarvestLevel(tool, harvestLevel);
        this.setSoundType(sound);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(SHAPE, BrickEdging.EnumShape.STRAIGHT));
    }

    private static final AxisAlignedBB STRAIGHT_N = new AxisAlignedBB(0.0D, 0.4D, 0.0D, 1.0D, 0.0D, 0.4D);
    private static final AxisAlignedBB STRAIGHT_S = new AxisAlignedBB(0.0D, 0.4D, 0.6D, 1.0D, 0.0D, 1.0D);
    private static final AxisAlignedBB STRAIGHT_W = new AxisAlignedBB(0.0D, 0.4D, 0.0D, 0.4D, 0.0D, 1.0D);
    private static final AxisAlignedBB STRAIGHT_E = new AxisAlignedBB(0.6D, 0.4D, 0.0D, 1.0D, 0.0D, 1.0D);

    private static final AxisAlignedBB INNER = new AxisAlignedBB(0.0D, 0.4D, 0.0D, 1.0D, 0.0D, 1.0D);

    private static final AxisAlignedBB OUTER_NW = new AxisAlignedBB(0.6D, 0.4D, 0.6D, 1.0D, 0.0D, 1.0D);
    private static final AxisAlignedBB OUTER_NE = new AxisAlignedBB(0.0D, 0.4D, 0.6D, 0.4D, 0.0D, 1.0D);
    private static final AxisAlignedBB OUTER_SW = new AxisAlignedBB(0.6D, 0.4D, 0.0D, 1.0D, 0.0D, 0.4D);
    private static final AxisAlignedBB OUTER_SE = new AxisAlignedBB(0.0D, 0.4D, 0.0D, 0.4D, 0.0D, 0.4D);


    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){
        AxisAlignedBB axisalignedbb = INNER;

        EnumFacing facing = state.getValue(FACING);
        BrickEdging.EnumShape shape = this.getActualState(state, source, pos).getValue(SHAPE);

        if(shape == BrickEdging.EnumShape.OUTER_LEFT) {
            switch (facing) {
                case NORTH:
                    axisalignedbb = OUTER_SE;
                    break;
                case SOUTH:
                    axisalignedbb = OUTER_NW;
                    break;
                case WEST:
                    axisalignedbb = OUTER_NE;
                    break;
                default:
                    axisalignedbb = OUTER_SW;
                    break;
            }
        } else if(shape == BrickEdging.EnumShape.OUTER_RIGHT) {
            switch (facing) {
                case NORTH:
                    axisalignedbb = OUTER_SW;
                    break;
                case SOUTH:
                    axisalignedbb = OUTER_NE;
                    break;
                case WEST:
                    axisalignedbb = OUTER_SE;
                    break;
                default:
                    axisalignedbb = OUTER_NW;
                    break;
            }
        } else if(shape == BrickEdging.EnumShape.STRAIGHT) {
            switch (facing) {
                case NORTH:
                    axisalignedbb = STRAIGHT_N;
                    break;
                case SOUTH:
                    axisalignedbb = STRAIGHT_S;
                    break;
                case WEST:
                    axisalignedbb = STRAIGHT_W;
                    break;
                default:
                    axisalignedbb = STRAIGHT_E;
                    break;
            }
        }
        return axisalignedbb;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[] {FACING, SHAPE});
    }

    @Override
    public IBlockState withRotation(IBlockState state, Rotation rot) {
        return state.withProperty(FACING, rot.rotate(state.getValue(FACING)));
    }

    @Override
    public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
        EnumFacing enumfacing = state.getValue(FACING);
        BrickEdging.EnumShape enumShape = state.getValue(SHAPE);
        switch (mirrorIn) {
            case LEFT_RIGHT:
                if (enumfacing.getAxis() == EnumFacing.Axis.Z) {
                    switch (enumShape) {
                        case OUTER_LEFT:
                            return state.withRotation(Rotation.CLOCKWISE_180).withProperty(SHAPE, BrickEdging.EnumShape.OUTER_RIGHT);
                        case OUTER_RIGHT:
                            return state.withRotation(Rotation.CLOCKWISE_180).withProperty(SHAPE, BrickEdging.EnumShape.OUTER_LEFT);
                        case INNER_RIGHT:
                            return state.withRotation(Rotation.CLOCKWISE_180).withProperty(SHAPE, BrickEdging.EnumShape.INNER_LEFT);
                        case INNER_LEFT:
                            return state.withRotation(Rotation.CLOCKWISE_180).withProperty(SHAPE, BrickEdging.EnumShape.INNER_RIGHT);
                        default:
                            return state.withRotation(Rotation.CLOCKWISE_180);
                    }
                }
                break;
            case FRONT_BACK:
                if (enumfacing.getAxis() == EnumFacing.Axis.X) {
                    switch (enumShape) {
                        case OUTER_LEFT:
                            return state.withRotation(Rotation.CLOCKWISE_180).withProperty(SHAPE, BrickEdging.EnumShape.OUTER_RIGHT);
                        case OUTER_RIGHT:
                            return state.withRotation(Rotation.CLOCKWISE_180).withProperty(SHAPE, BrickEdging.EnumShape.OUTER_LEFT);
                        case INNER_RIGHT:
                            return state.withRotation(Rotation.CLOCKWISE_180).withProperty(SHAPE, BrickEdging.EnumShape.INNER_RIGHT);
                        case INNER_LEFT:
                            return state.withRotation(Rotation.CLOCKWISE_180).withProperty(SHAPE, BrickEdging.EnumShape.INNER_LEFT);
                        case STRAIGHT:
                            return state.withRotation(Rotation.CLOCKWISE_180);
                    }
                }
        }
        return super.withMirror(state, mirrorIn);
    }

    @Override
    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        IBlockState iblockstate = super.getStateForPlacement(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer);
        iblockstate = iblockstate.withProperty(FACING, placer.getHorizontalFacing()).withProperty(SHAPE, BrickEdging.EnumShape.STRAIGHT);
        return iblockstate;
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        int i = 0;
        i = i | 5 - (state.getValue(FACING)).getIndex();
        return i;
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        IBlockState iblockstate = this.getDefaultState();
        iblockstate = iblockstate.withProperty(FACING, EnumFacing.byIndex(5 - (meta & 3)));
        return iblockstate;
    }

    @Override
    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
        BrickEdging.EnumShape shape = this.getActualState(state, worldIn, pos).getValue(SHAPE);

        if (shape != BrickEdging.EnumShape.OUTER_LEFT && shape != BrickEdging.EnumShape.OUTER_RIGHT) {
            EnumFacing enumfacing = state.getValue(FACING);

            switch (shape) {
                case INNER_RIGHT:
                    return enumfacing != face && enumfacing != face.rotateYCCW() ? BlockFaceShape.UNDEFINED : BlockFaceShape.SOLID;
                case INNER_LEFT:
                    return enumfacing != face && enumfacing != face.rotateY() ? BlockFaceShape.UNDEFINED : BlockFaceShape.SOLID;
                case STRAIGHT:
                    return enumfacing == face ? BlockFaceShape.SOLID : BlockFaceShape.UNDEFINED;
                default:
                    return BlockFaceShape.UNDEFINED;
            }
        } else {
            return BlockFaceShape.UNDEFINED;
        }
    }

    @Override
    public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
        return state.withProperty(SHAPE, getStairsShape(state, worldIn, pos));
    }

    public static boolean isBrickEdging(IBlockState state) {
        return state.getBlock() instanceof BrickEdging;
    }

    private static BrickEdging.EnumShape getStairsShape(IBlockState iBlockState, IBlockAccess iBlockAccess, BlockPos blockPos)
    {
        EnumFacing enumfacing = iBlockState.getValue(FACING);
        IBlockState iblockstate = iBlockAccess.getBlockState(blockPos.offset(enumfacing));
        if (isBrickEdging(iblockstate)) {
            EnumFacing enumfacing1 = iblockstate.getValue(FACING);
            if (enumfacing1 == enumfacing.rotateYCCW()) {
                return BrickEdging.EnumShape.OUTER_LEFT;
            }
            return BrickEdging.EnumShape.OUTER_RIGHT;
        }
        IBlockState iblockstate1 = iBlockAccess.getBlockState(blockPos.offset(enumfacing.getOpposite()));
        if (isBrickEdging(iblockstate1)) {
            EnumFacing enumfacing2 = iblockstate1.getValue(FACING);
            if (enumfacing2.getAxis() != (iBlockState.getValue(FACING)).getAxis()) {
                if (enumfacing2 == enumfacing.rotateYCCW()) {
                    return BrickEdging.EnumShape.INNER_LEFT;
                }
                return BrickEdging.EnumShape.INNER_RIGHT;
            }
        }
        return BrickEdging.EnumShape.STRAIGHT;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }

    public enum EnumShape implements IStringSerializable {
        STRAIGHT("straight"),
        INNER_LEFT("inner_left"),
        INNER_RIGHT("inner_right"),
        OUTER_LEFT("outer_left"),
        OUTER_RIGHT("outer_right");

        private final String name;

        EnumShape(String name) {
            this.name = name;
        }

        public String toString() {
            return this.name;
        }

        public String getName() {
            return this.name;
        }
    }
}