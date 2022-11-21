package com.github.rilyhugu.decoration.resource.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.creativetab.CreativeTabs;

import static com.github.rilyhugu.decoration.Decoration.MOD_ID;

public class DecoStair extends BlockStairs {
    public DecoStair(Block block, String name, CreativeTabs tab, float hardness, float resistance, String tool, int harvestLevel, SoundType sound) {
        super(block.getDefaultState());
        this.setRegistryName(MOD_ID, name);
        this.setTranslationKey(name);
        this.setCreativeTab(tab);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setHarvestLevel(tool, harvestLevel);
        this.setSoundType(sound);
    }
}