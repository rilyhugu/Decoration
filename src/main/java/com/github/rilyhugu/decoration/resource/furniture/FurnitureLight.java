package com.github.rilyhugu.decoration.resource.furniture;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class FurnitureLight extends PropBase {
    public FurnitureLight(Material material, String name, CreativeTabs tab, float hardness, float resistance, String tool, int harvestLevel, SoundType sound, Float lightLevel) {
        super(material, name, tab, hardness, resistance, tool, harvestLevel, sound);
        this.setLightLevel(lightLevel);
    }

    public FurnitureLight(Material material, String name, CreativeTabs tab, float hardness, float resistance, SoundType sound, Float lightLevel) {
        super(material, name, tab, hardness, resistance, sound);
        this.setLightLevel(lightLevel);
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){
        return new AxisAlignedBB(0.25D, 0.8D, 0.25D, 0.75D, 0.0D, 0.75D);
    }
}