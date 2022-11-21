package com.github.rilyhugu.decoration.resource.furniture;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class FurnitureFullCube extends FurnitureBase{
    public FurnitureFullCube(Material material, String name, CreativeTabs tab, float hardness, float resistance, String tool, int harvestLevel, SoundType sound) {
        super(material, name, tab, hardness, resistance, tool, harvestLevel, sound);
    }

    public FurnitureFullCube(Material material, String name, CreativeTabs tab, float hardness, float resistance, SoundType sound) {
        super(material, name, tab, hardness, resistance, sound);
    }
}
