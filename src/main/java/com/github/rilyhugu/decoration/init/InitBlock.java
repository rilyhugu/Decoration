package com.github.rilyhugu.decoration.init;

import com.github.rilyhugu.decoration.resource.block.*;
import com.github.rilyhugu.decoration.resource.furniture.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.creativetab.CreativeTabs;

import java.util.HashMap;
import java.util.Map;

public class InitBlock {
    public static final Map<String, Block> DC_BLOCKS = new HashMap<>();
    public static final Map<String, InitBlockSlab> DC_BLOCKS_SLAB = new HashMap<>();

    static {
        //Solid
        DC_BLOCKS.put("brick_golem", new DecoSolid(Material.IRON, "brick_golem", InitTab.BLOCK, 2.0F, 1200.0F, "pickaxe", 3, SoundType.METAL));
        DC_BLOCKS.put("brick_deco_1", new DecoSolid(Material.ROCK, "brick_deco_1", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE));
        DC_BLOCKS.put("brick_deco_2", new DecoSolid(Material.ROCK, "brick_deco_2", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE));
        DC_BLOCKS.put("brick_deco_3", new DecoSolid(Material.ROCK, "brick_deco_3", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE));
        DC_BLOCKS.put("brick_deco_4", new DecoSolid(Material.ROCK, "brick_deco_4", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE));

        DC_BLOCKS.put("stone_deco_1", new DecoSolid(Material.ROCK, "stone_deco_1", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE));
        DC_BLOCKS.put("stone_deco_2", new DecoSolid(Material.ROCK, "stone_deco_2", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE));
        DC_BLOCKS.put("stone_deco_3", new DecoSolid(Material.ROCK, "stone_deco_3", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE));

        DC_BLOCKS.put("tile_deco_mosaic_1", new DecoSolid(Material.ROCK, "tile_deco_mosaic_1", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE));
        DC_BLOCKS.put("tile_deco_mosaic_2", new DecoSolid(Material.ROCK, "tile_deco_mosaic_2", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE));
        DC_BLOCKS.put("tile_deco_mosaic_3", new DecoSolid(Material.ROCK, "tile_deco_mosaic_3", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE));

        //Stair
        DC_BLOCKS.put("brick_golem_stair", new DecoStair(DC_BLOCKS.get("brick_golem"), "brick_golem_stair", InitTab.BLOCK, 2.0F, 1200.0F, "pickaxe", 3, SoundType.METAL));
        DC_BLOCKS.put("brick_deco_1_stair", new DecoStair(DC_BLOCKS.get("brick_deco_1"), "brick_deco_1_stair", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE));
        DC_BLOCKS.put("brick_deco_2_stair", new DecoStair(DC_BLOCKS.get("brick_deco_2"), "brick_deco_2_stair", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE));
        DC_BLOCKS.put("brick_deco_3_stair", new DecoStair(DC_BLOCKS.get("brick_deco_3"), "brick_deco_3_stair", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE));
        DC_BLOCKS.put("brick_deco_4_stair", new DecoStair(DC_BLOCKS.get("brick_deco_4"), "brick_deco_4_stair", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE));

        DC_BLOCKS.put("stone_deco_1_stair", new DecoStair(DC_BLOCKS.get("stone_deco_1"), "stone_deco_1_stair", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE));
        DC_BLOCKS.put("stone_deco_2_stair", new DecoStair(DC_BLOCKS.get("stone_deco_2"), "stone_deco_2_stair", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE));
        DC_BLOCKS.put("stone_deco_3_stair", new DecoStair(DC_BLOCKS.get("stone_deco_3"), "stone_deco_3_stair", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE));

        DC_BLOCKS.put("tile_deco_mosaic_1_stair", new DecoStair(DC_BLOCKS.get("tile_deco_mosaic_1"), "tile_deco_mosaic_1_stair", InitTab.BLOCK, 2.0F, 1200.0F, "pickaxe", 3, SoundType.STONE));
        DC_BLOCKS.put("tile_deco_mosaic_2_stair", new DecoStair(DC_BLOCKS.get("tile_deco_mosaic_2"), "tile_deco_mosaic_2_stair", InitTab.BLOCK, 2.0F, 1200.0F, "pickaxe", 3, SoundType.STONE));
        DC_BLOCKS.put("tile_deco_mosaic_3_stair", new DecoStair(DC_BLOCKS.get("tile_deco_mosaic_3"), "tile_deco_mosaic_3_stair", InitTab.BLOCK, 2.0F, 1200.0F, "pickaxe", 3, SoundType.STONE));

        //Wall
        DC_BLOCKS.put("brick_golem_wall", new DecoWall(Material.IRON, "brick_golem_wall", InitTab.BLOCK, 2.0F, 1200.0F, "pickaxe", 3, SoundType.METAL));
        DC_BLOCKS.put("brick_deco_1_wall", new DecoWall(Material.ROCK, "brick_deco_1_wall", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE));
        DC_BLOCKS.put("brick_deco_2_wall", new DecoWall(Material.ROCK, "brick_deco_2_wall", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE));
        DC_BLOCKS.put("brick_deco_3_wall", new DecoWall(Material.ROCK, "brick_deco_3_wall", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE));
        DC_BLOCKS.put("brick_deco_4_wall", new DecoWall(Material.ROCK, "brick_deco_4_wall", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE));

        DC_BLOCKS.put("stone_deco_1_wall", new DecoWall(Material.ROCK, "stone_deco_1_wall", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE));
        DC_BLOCKS.put("stone_deco_2_wall", new DecoWall(Material.ROCK, "stone_deco_2_wall", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE));
        DC_BLOCKS.put("stone_deco_3_wall", new DecoWall(Material.ROCK, "stone_deco_3_wall", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE));

        //Slabs
        DC_BLOCKS_SLAB.put("brick_golem_slab", new InitBlockSlab(
                new DecoSlab(Material.IRON,"brick_golem_slab_half", InitTab.BLOCK, 2.0F, 1200.0F, "pickaxe", 3, SoundType.METAL),
                new DecoSlab.Double(Material.IRON,"brick_golem_slab_double", InitTab.BLOCK, 2.0F, 1200.0F, "pickaxe", 3, SoundType.METAL)
        ));

        DC_BLOCKS_SLAB.put("brick_deco_1_slab", new InitBlockSlab(
                new DecoSlab(Material.ROCK,"brick_deco_1_slab_half", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE),
                new DecoSlab.Double(Material.ROCK,"brick_deco_1_slab_double", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE)
        ));
        DC_BLOCKS_SLAB.put("brick_deco_2_slab", new InitBlockSlab(
                new DecoSlab(Material.ROCK,"brick_deco_2_slab_half", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE),
                new DecoSlab.Double(Material.ROCK,"brick_deco_2_slab_double", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE)
        ));
        DC_BLOCKS_SLAB.put("brick_deco_3_slab", new InitBlockSlab(
                new DecoSlab(Material.ROCK,"brick_deco_3_slab_half", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE),
                new DecoSlab.Double(Material.ROCK,"brick_deco_3_slab_double", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE)
        ));
        DC_BLOCKS_SLAB.put("brick_deco_4_slab", new InitBlockSlab(
                new DecoSlab(Material.ROCK,"brick_deco_4_slab_half", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE),
                new DecoSlab.Double(Material.ROCK,"brick_deco_4_slab_double", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE)
        ));

        DC_BLOCKS_SLAB.put("stone_deco_1_slab", new InitBlockSlab(
                new DecoSlab(Material.ROCK,"stone_deco_1_slab_half", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE),
                new DecoSlab.Double(Material.ROCK,"stone_deco_1_slab_double", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE)
        ));
        DC_BLOCKS_SLAB.put("stone_deco_2_slab", new InitBlockSlab(
                new DecoSlab(Material.ROCK,"stone_deco_2_slab_half", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE),
                new DecoSlab.Double(Material.ROCK,"stone_deco_2_slab_double", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE)
        ));
        DC_BLOCKS_SLAB.put("stone_deco_3_slab", new InitBlockSlab(
                new DecoSlab(Material.ROCK,"stone_deco_3_slab_half", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE),
                new DecoSlab.Double(Material.ROCK,"stone_deco_3_slab_double", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE)
        ));

        DC_BLOCKS_SLAB.put("tile_deco_mosaic_1_slab", new InitBlockSlab(
                new DecoSlab(Material.ROCK,"tile_deco_mosaic_1_slab_half", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE),
                new DecoSlab.Double(Material.ROCK,"tile_deco_mosaic_1_slab_double", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE)
        ));
        DC_BLOCKS_SLAB.put("tile_deco_mosaic_2_slab", new InitBlockSlab(
                new DecoSlab(Material.ROCK,"tile_deco_mosaic_2_slab_half", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE),
                new DecoSlab.Double(Material.ROCK,"tile_deco_mosaic_2_slab_double", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE)
        ));
        DC_BLOCKS_SLAB.put("tile_deco_mosaic_3_slab", new InitBlockSlab(
                new DecoSlab(Material.ROCK,"tile_deco_mosaic_3_slab_half", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE),
                new DecoSlab.Double(Material.ROCK,"tile_deco_mosaic_3_slab_double", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE)
        ));


        //Furniture
        DC_BLOCKS.put("pile_of_books", new PropBase(Material.CLOTH, "pile_of_books", InitTab.FURNITURE, 0.25F, 0.0F, SoundType.CLOTH));
        DC_BLOCKS.put("pile_of_papers", new PropBase(Material.CLOTH, "pile_of_papers", InitTab.FURNITURE, 0.25F, 0.0F, SoundType.CLOTH));
        DC_BLOCKS.put("book_stand", new PropBase(Material.CLOTH, "book_stand", InitTab.FURNITURE, 0.25F, 0.0F, SoundType.CLOTH));
        DC_BLOCKS.put("open_book", new PropBase(Material.CLOTH, "open_book", InitTab.FURNITURE, 0.25F, 0.0F, SoundType.CLOTH));

        DC_BLOCKS.put("midi_keyboard", new PropBase(Material.ROCK, "midi_keyboard", InitTab.FURNITURE, 0.25F, 0.0F, SoundType.STONE));
        DC_BLOCKS.put("monitor_middle", new FurnitureMonitor(Material.ROCK, "monitor_middle", InitTab.FURNITURE, 0.25F, 0.0F, SoundType.STONE));
        DC_BLOCKS.put("monitor_left", new FurnitureMonitor(Material.ROCK, "monitor_left", InitTab.FURNITURE, 0.25F, 0.0F, SoundType.STONE));
        DC_BLOCKS.put("monitor_right", new FurnitureMonitor(Material.ROCK, "monitor_right", InitTab.FURNITURE, 0.25F, 0.0F, SoundType.STONE));

        //Fence
        DC_BLOCKS.put("wrought_iron_fence_left", new PropBase(Material.IRON, "wrought_iron_fence_left", InitTab.FURNITURE, 0.25F, 0.0F, SoundType.METAL));
        DC_BLOCKS.put("wrought_iron_fence_right", new PropBase(Material.IRON, "wrought_iron_fence_right", InitTab.FURNITURE, 0.25F, 0.0F, SoundType.METAL));



        //Food Plate
        DC_BLOCKS.put("food_plate_meat", new FurnitureFoodPlate(Material.GLASS, "food_plate_meat", InitTab.FURNITURE, 0.25F, 0.0F, SoundType.GLASS));
        DC_BLOCKS.put("food_plate_breakfast", new FurnitureFoodPlate(Material.GLASS, "food_plate_breakfast", InitTab.FURNITURE, 0.25F, 0.0F, SoundType.GLASS));
        DC_BLOCKS.put("food_plate_sandwich", new FurnitureFoodPlate(Material.GLASS, "food_plate_sandwich", InitTab.FURNITURE, 0.25F, 0.0F, SoundType.GLASS));

        //Light Source
        DC_BLOCKS.put("garden_wall_lamp", new FurnitureWallLight(Material.IRON, "garden_wall_lamp", InitTab.FURNITURE, 2.0F, 2.0F, "pickaxe", 0, SoundType.METAL, 1.0F));
        DC_BLOCKS.put("garden_lamp", new FurnitureLight(Material.IRON, "garden_lamp", InitTab.FURNITURE, 2.0F, 2.0F, "pickaxe", 0, SoundType.METAL, 1.0F));
        DC_BLOCKS.put("iron_wall_lamp", new FurnitureWallLight(Material.IRON, "iron_wall_lamp", InitTab.FURNITURE, 2.0F, 2.0F, "pickaxe", 0, SoundType.METAL, 1.0F));


        DC_BLOCKS.put("iron_wood_dining_chair", new FurnitureChair(Material.WOOD, "iron_wood_dining_chair", InitTab.FURNITURE, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));
        DC_BLOCKS.put("iron_wood_chair", new FurnitureChair(Material.WOOD, "iron_wood_chair", InitTab.FURNITURE, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));
        DC_BLOCKS.put("iron_wood_stool", new FurnitureStool(Material.WOOD, "iron_wood_stool", InitTab.FURNITURE, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));
        DC_BLOCKS.put("iron_wood_table", new FurnitureFullCube(Material.WOOD, "iron_wood_table", InitTab.FURNITURE, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));
        DC_BLOCKS.put("iron_wood_side_table", new FurnitureFullCube(Material.WOOD, "iron_wood_side_table", InitTab.FURNITURE, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));
        DC_BLOCKS.put("iron_wood_chest", new FurnitureFullCube(Material.WOOD, "iron_wood_chest", InitTab.FURNITURE, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));
        DC_BLOCKS.put("iron_wood_cabinet", new FurnitureFullCube(Material.WOOD, "iron_wood_cabinet", InitTab.FURNITURE, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));
        DC_BLOCKS.put("iron_wood_wall_rack", new FurnitureWallRack(Material.WOOD, "iron_wood_wall_rack", InitTab.FURNITURE, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));
        DC_BLOCKS.put("iron_wood_connectable_table", new FurnitureConnectableTable(Material.WOOD, "iron_wood_connectable_table", InitTab.FURNITURE, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));


        DC_BLOCKS.put("antique_dining_chair", new FurnitureChair(Material.WOOD, "antique_dining_chair", InitTab.FURNITURE, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));
        DC_BLOCKS.put("antique_chair", new FurnitureChair(Material.WOOD, "antique_chair", InitTab.FURNITURE, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));
        DC_BLOCKS.put("antique_wood_stool", new FurnitureStool(Material.WOOD, "antique_stool", InitTab.FURNITURE, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));
        DC_BLOCKS.put("antique_table", new FurnitureFullCube(Material.WOOD, "antique_table", InitTab.FURNITURE, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));
        DC_BLOCKS.put("antique_side_table", new FurnitureFullCube(Material.WOOD, "antique_side_table", InitTab.FURNITURE, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));
        DC_BLOCKS.put("antique_chest", new FurnitureFullCube(Material.WOOD, "antique_chest", InitTab.FURNITURE, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));
        DC_BLOCKS.put("antique_cabinet", new FurnitureFullCube(Material.WOOD, "antique_cabinet", InitTab.FURNITURE, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));
        DC_BLOCKS.put("antique_wall_rack", new FurnitureWallRack(Material.WOOD, "antique_wall_rack", InitTab.FURNITURE, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));
        DC_BLOCKS.put("antique_connectable_table", new FurnitureConnectableTable(Material.WOOD, "antique_connectable_table", InitTab.FURNITURE, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));


        DC_BLOCKS.put("brick_edging", new BrickEdging(Material.ROCK, "brick_edging", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE));
        DC_BLOCKS.put("stone_brick_edging", new BrickEdging(Material.ROCK, "stone_brick_edging", InitTab.BLOCK, 1.5F, 6.0F, "pickaxe", 0, SoundType.STONE));


        //DC_BLOCKS.put("gold_crest", new FurnitureDoublePlant("gold_crest"));

    }
}