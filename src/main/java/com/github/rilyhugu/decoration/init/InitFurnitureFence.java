package com.github.rilyhugu.decoration.init;

import com.github.rilyhugu.decoration.resource.furniture.FurnitureFence;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class InitFurnitureFence {
    private FurnitureFence fence;
    private FurnitureFence.FurnitureFencePart fencePart;

    public InitFurnitureFence(Material material, String name, CreativeTabs tab, float hardness, float resistance, String tool, int harvestLevel, SoundType sound) {
        this.fence = new FurnitureFence(material, name, tab, hardness, resistance, tool, harvestLevel, sound);

        this.fencePart = new FurnitureFence.FurnitureFencePart(material, name, tab, hardness, resistance, tool, harvestLevel, sound);
        this.fencePart.setCreativeTab(null);
        this.fencePart.setDrop(this.fence);
    }

    public InitFurnitureFence(Material material, String name, CreativeTabs tab, float hardness, float resistance, SoundType sound) {
        this.fence = new FurnitureFence(material, name, tab, hardness, resistance, sound);

        this.fencePart = new FurnitureFence.FurnitureFencePart(material, name, tab, hardness, resistance, sound);
        this.fencePart.setCreativeTab(null);
        this.fencePart.setDrop(this.fence);
    }

    public FurnitureFence getFence() {
        return this.fence;
    }

    public FurnitureFence getFencePart() {
        return this.fencePart;
    }
}
