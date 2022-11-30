package com.github.rilyhugu.decoration.resister;

import com.github.rilyhugu.decoration.init.InitItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.github.rilyhugu.decoration.Decoration.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID)
public class ResisterItem {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        for( Item item: InitItem.DC_ITEMS.values() ){
            event.getRegistry().register(item);
        }
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void registerModels(ModelRegistryEvent event) {
        for( Item item: InitItem.DC_ITEMS.values() ){
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        }
    }

}
