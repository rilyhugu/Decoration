package com.github.rilyhugu.decoration.resource.furniture;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class FurniturePropTranslucent extends FurnitureBase {
    public FurniturePropTranslucent(Material material, String name, CreativeTabs tab, float hardness, float resistance, String tool, int harvestLevel, SoundType sound) {
        super(material, name, tab, hardness, resistance, tool, harvestLevel, sound);
    }

    public FurniturePropTranslucent(Material material, String name, CreativeTabs tab, float hardness, float resistance, SoundType sound) {
        super(material, name, tab, hardness, resistance, sound);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.TRANSLUCENT;
    }
}
