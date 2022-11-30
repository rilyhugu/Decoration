package com.github.rilyhugu.decoration.resource.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemMaterial extends Item {
    public ItemMaterial(String name, CreativeTabs tab) {
        super();
        this.setRegistryName(name);
        this.setTranslationKey(name);
        this.setCreativeTab(tab);
    }
}
