package com.github.rilyhugu.decoration.resister;

import com.github.rilyhugu.decoration.init.InitBlock;
import com.github.rilyhugu.decoration.init.InitBlockSlab;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Map;

import static com.github.rilyhugu.decoration.Decoration.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID)
public class ResisterBlock {

    @SubscribeEvent
    public static void addBlocks(RegistryEvent.Register<Block> event) {
        for( Block block: InitBlock.DC_BLOCKS.values()){
            event.getRegistry().register(block);
        }


        for( InitBlockSlab slab: InitBlock.DC_BLOCKS_SLAB.values()){
            event.getRegistry().register(slab.getSlabHalf());
            event.getRegistry().register(slab.getSlabDouble());
        }
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        for(Map.Entry<String, Block> block: InitBlock.DC_BLOCKS.entrySet()){
            event.getRegistry().register(new ItemBlock(block.getValue()).setRegistryName(MOD_ID, block.getKey()));
        }


        for( InitBlockSlab slab: InitBlock.DC_BLOCKS_SLAB.values()){
            Item item = new ItemSlab(slab.getSlabHalf(), slab.getSlabHalf(), slab.getSlabDouble());
            item.setRegistryName(slab.getSlabHalf().getRegistryName());
            event.getRegistry().register(item);
        }
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void registerModels(ModelRegistryEvent event) {
        for(Map.Entry<String, Block> block: InitBlock.DC_BLOCKS.entrySet()){
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block.getValue()), 0, new ModelResourceLocation(block.getValue().getRegistryName(), "inventory"));
        }


        for( InitBlockSlab slab: InitBlock.DC_BLOCKS_SLAB.values()){
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(slab.getSlabHalf()), 0, new ModelResourceLocation(slab.getSlabHalf().getRegistryName(), "inventory"));
        }
    }
}
