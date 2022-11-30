package com.github.rilyhugu.decoration.init;

import com.github.rilyhugu.decoration.resource.item.ItemMaterial;
import net.minecraft.item.Item;

import java.util.HashMap;
import java.util.Map;

public class InitItem {
    public static final Map<String, Item> DC_ITEMS = new HashMap<>();

    static {
        DC_ITEMS.put("diy_material", new ItemMaterial("diy_material", InitTab.FURNITURE));
        DC_ITEMS.put("diy_plank", new ItemMaterial("diy_plank", InitTab.FURNITURE));
        DC_ITEMS.put("diy_plank_antique", new ItemMaterial("diy_plank_antique", InitTab.FURNITURE));
        DC_ITEMS.put("diy_plank_modern", new ItemMaterial("diy_plank_modern", InitTab.FURNITURE));
    }
}
