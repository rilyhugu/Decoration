package com.github.rilyhugu.decoration.creativetab;

import com.github.rilyhugu.decoration.init.InitBlock;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;


public class TabBlock extends CreativeTabs {
    public TabBlock(String name) {
        super(name);
    }
    @Override
    public ItemStack createIcon() {
        return new ItemStack(InitBlock.DC_BLOCKS.get("brick_golem"));
    }
}