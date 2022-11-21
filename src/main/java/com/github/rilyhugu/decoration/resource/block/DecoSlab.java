package com.github.rilyhugu.decoration.resource.block;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class DecoSlab extends BlockSlab {
    public DecoSlab(Material material, String name, CreativeTabs tab, float hardness, float resistance, String tool, int harvestLevel, SoundType sound) {
        super(material);
        this.setRegistryName(name);
        this.setTranslationKey(name);
        this.setCreativeTab(tab);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setHarvestLevel(tool, harvestLevel);
        this.setSoundType(sound);

        IBlockState state = this.blockState.getBaseState().withProperty(VARIANT, DecoSlab.Variant.DEFAULT);
        if (!this.isDouble())
            state = state.withProperty(BlockSlab.HALF, EnumBlockHalf.BOTTOM);
        this.setDefaultState(state);
        this.useNeighborBrightness = !this.isDouble();
    }

    public static final PropertyEnum<DecoSlab.Variant> VARIANT = PropertyEnum.<DecoSlab.Variant>create("variant", DecoSlab.Variant.class);

    @Override
    public String getTranslationKey(int meta) {
        return this.getTranslationKey();
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(this);
    }

    @Override
    public int quantityDropped(IBlockState state, int fortune, Random random) {
        return 1;
    }

    @Override
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
        return new ItemStack(this);
    }

    @Override
    protected net.minecraft.block.state.BlockStateContainer createBlockState() {
        return this.isDouble()
                ? new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{VARIANT})
                : new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{HALF, VARIANT});
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        if (this.isDouble()) {
            return this.getDefaultState();
        } else {
            return this.getDefaultState().withProperty(HALF, BlockSlab.EnumBlockHalf.values()[meta % 2]);
        }
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        if (this.isDouble()) {
            return 0;
        } else {
            return state.getValue(HALF).ordinal();
        }
    }

    @Override
    public IProperty<?> getVariantProperty() {
        return VARIANT;
    }

    @Override
    public Comparable<?> getTypeForItem(ItemStack stack) {
        return DecoSlab.Variant.DEFAULT;
    }

    @Override
    public boolean isDouble() {
        return false;
    }

    @Override
    public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
        if (isDouble()) {
            return true;
        }
        return super.doesSideBlockRendering(state, world, pos, face);
    }

    public enum Variant implements IStringSerializable {
        DEFAULT;
        public String getName() {
            return "default";
        }
    }

    public static class Double extends DecoSlab {
        private DecoSlab block;

        public Double(Material material, String name, CreativeTabs tab, float hardness, float resistance, String tool, int harvestLevel, SoundType sound) {
            super(material, name, tab, hardness, resistance, tool, harvestLevel, sound);
        }

        public void setDrop(DecoSlab drop) {
            this.block = drop;
        }

        @Override
        public boolean isDouble() {
            return true;
        }

        @Override
        public Item getItemDropped(IBlockState state, Random rand, int fortune) {
            return Item.getItemFromBlock(this.block);
        }

        @Override
        public int quantityDropped(IBlockState state, int fortune, Random random) {
            return 2;
        }
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

}
