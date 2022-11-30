package com.github.rilyhugu.decoration.init;

import com.github.rilyhugu.decoration.resource.block.*;
import com.github.rilyhugu.decoration.resource.furniture.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;

import java.util.HashMap;
import java.util.Map;

public class InitBlock {
    public static final Map<String, Block> DC_BLOCKS = new HashMap<>();
    public static final Map<String, InitBlockSlab> DC_BLOCKS_SLAB = new HashMap<>();
    public static final Map<String, InitFurnitureFence> DC_FURNITURE_FENCE = new HashMap<>();

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

        DC_BLOCKS.put("wood_deco_1", new DecoSolid(Material.WOOD, "wood_deco_1", InitTab.BLOCK, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));
        DC_BLOCKS.put("wood_deco_2", new DecoSolid(Material.WOOD, "wood_deco_2", InitTab.BLOCK, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));
        DC_BLOCKS.put("wood_deco_3", new DecoSolid(Material.WOOD, "wood_deco_3", InitTab.BLOCK, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));


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

        DC_BLOCKS.put("wood_deco_1_stair", new DecoStair(DC_BLOCKS.get("wood_deco_1"), "wood_deco_1_stair", InitTab.BLOCK, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));
        DC_BLOCKS.put("wood_deco_2_stair", new DecoStair(DC_BLOCKS.get("wood_deco_2"), "wood_deco_2_stair", InitTab.BLOCK, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));
        DC_BLOCKS.put("wood_deco_3_stair", new DecoStair(DC_BLOCKS.get("wood_deco_3"), "wood_deco_3_stair", InitTab.BLOCK, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));

        //Wall
        DC_BLOCKS.put("brick_golem_wall", new DecoWall(Material.IRON, "brick_golem_wall", InitTab.BLOCK, 2.0F, 1200.0F, "pickaxe", 3, SoundType.METAL));
        DC_BLOCKS.put("brick_deco_1_wall", new DecoWall(Material.ROCK, "brick_deco_1_wall", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE));
        DC_BLOCKS.put("brick_deco_2_wall", new DecoWall(Material.ROCK, "brick_deco_2_wall", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE));
        DC_BLOCKS.put("brick_deco_3_wall", new DecoWall(Material.ROCK, "brick_deco_3_wall", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE));
        DC_BLOCKS.put("brick_deco_4_wall", new DecoWall(Material.ROCK, "brick_deco_4_wall", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE));

        DC_BLOCKS.put("stone_deco_1_wall", new DecoWall(Material.ROCK, "stone_deco_1_wall", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE));
        DC_BLOCKS.put("stone_deco_2_wall", new DecoWall(Material.ROCK, "stone_deco_2_wall", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE));
        DC_BLOCKS.put("stone_deco_3_wall", new DecoWall(Material.ROCK, "stone_deco_3_wall", InitTab.BLOCK, 2.0F, 6.0F, "pickaxe", 0, SoundType.STONE));

        DC_BLOCKS.put("wood_deco_1_wall", new DecoWall(Material.WOOD, "wood_deco_1_wall", InitTab.BLOCK, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));
        DC_BLOCKS.put("wood_deco_2_wall", new DecoWall(Material.WOOD, "wood_deco_2_wall", InitTab.BLOCK, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));
        DC_BLOCKS.put("wood_deco_3_wall", new DecoWall(Material.WOOD, "wood_deco_3_wall", InitTab.BLOCK, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));

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

        DC_BLOCKS_SLAB.put("wood_deco_1_slab", new InitBlockSlab(
                new DecoSlab(Material.WOOD,"wood_deco_1_slab_half", InitTab.BLOCK, 2.0F, 2.0F, "axe", 0, SoundType.WOOD),
                new DecoSlab.Double(Material.WOOD,"wood_deco_1_slab_double", InitTab.BLOCK, 2.0F, 2.0F, "axe", 0, SoundType.WOOD)
        ));        DC_BLOCKS_SLAB.put("wood_deco_2_slab", new InitBlockSlab(
                new DecoSlab(Material.WOOD,"wood_deco_2_slab_half", InitTab.BLOCK, 2.0F, 2.0F, "axe", 0, SoundType.WOOD),
                new DecoSlab.Double(Material.WOOD,"wood_deco_2_slab_double", InitTab.BLOCK, 2.0F, 2.0F, "axe", 0, SoundType.WOOD)
        ));        DC_BLOCKS_SLAB.put("wood_deco_3_slab", new InitBlockSlab(
                new DecoSlab(Material.WOOD,"wood_deco_3_slab_half", InitTab.BLOCK, 2.0F, 2.0F, "axe", 0, SoundType.WOOD),
                new DecoSlab.Double(Material.WOOD,"wood_deco_3_slab_double", InitTab.BLOCK, 2.0F, 2.0F, "axe", 0, SoundType.WOOD)
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


        //Café
        DC_BLOCKS.put("blackboard_stand", new FurnitureFullCube(Material.WOOD, "blackboard_stand", InitTab.FURNITURE, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));



        //Fence
        DC_FURNITURE_FENCE.put("wrought_iron_fence", new InitFurnitureFence(Material.IRON, "wrought_iron_fence", InitTab.FURNITURE, 2.0F, 2.0F, "pickaxe", 0, SoundType.METAL));
        DC_FURNITURE_FENCE.put("white_wood_fence", new InitFurnitureFence(Material.WOOD, "white_wood_fence", InitTab.FURNITURE, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));


        //Bench
        DC_BLOCKS.put("wrought_iron_bench", new FurnitureConnectableHorizontal(Material.IRON, "wrought_iron_bench", InitTab.FURNITURE, 2.0F, 2.0F, "axe", 0, SoundType.METAL));

        //On Wall Rack
        DC_BLOCKS.put("wall_planter", new FurnitureWallBoard(Material.WOOD, "wall_planter", InitTab.FURNITURE, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));
        DC_BLOCKS.put("plant_chefflera", new FurnitureFullCube(Material.WOOD, "plant_chefflera", InitTab.FURNITURE, 2.0F, 2.0F, "axe", 0, SoundType.PLANT));
        DC_BLOCKS.put("small_potted_plant_1", new FurnitureFullCube(Material.WOOD, "small_potted_plant_1", InitTab.FURNITURE, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));
        DC_BLOCKS.put("small_potted_plant_2", new FurnitureFullCube(Material.WOOD, "small_potted_plant_2", InitTab.FURNITURE, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));
        DC_BLOCKS.put("small_potted_plant_3", new FurnitureFullCube(Material.WOOD, "small_potted_plant_3", InitTab.FURNITURE, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));

        DC_BLOCKS.put("bottles_1", new FurnitureFullCube(Material.GLASS, "bottles_1", InitTab.FURNITURE, 0.25F, 0.0F, SoundType.GLASS));
        DC_BLOCKS.put("spice_jar", new FurnitureFullCube(Material.GLASS, "spice_jar", InitTab.FURNITURE, 0.25F, 0.0F, SoundType.GLASS));
        DC_BLOCKS.put("sugar_jar", new FurniturePropTranslucent(Material.GLASS, "sugar_jar", InitTab.FURNITURE, 0.25F, 0.0F, SoundType.GLASS));

        DC_BLOCKS.put("dishes_1", new FurnitureFullCube(Material.GLASS, "dishes_1", InitTab.FURNITURE, 0.25F, 0.0F, SoundType.GLASS));
        DC_BLOCKS.put("shelf_decoration_1", new FurnitureFullCube(Material.WOOD, "shelf_decoration_1", InitTab.FURNITURE, 0.25F, 0.0F, SoundType.WOOD));

        DC_BLOCKS.put("hooked_acoustic_guitar", new FurnitureWallBoard(Material.WOOD, "hooked_acoustic_guitar", InitTab.FURNITURE, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));
        DC_BLOCKS.put("soundproof_material", new FurnitureWallBoard(Material.WOOD, "soundproof_material", InitTab.FURNITURE, 2.0F, 2.0F, "axe", 0, SoundType.WOOD));


        //Food Plate
        DC_BLOCKS.put("food_plate_meat", new FurnitureFoodPlate(Material.GLASS, "food_plate_meat", InitTab.FURNITURE, 0.25F, 0.0F, SoundType.GLASS));
        DC_BLOCKS.put("food_plate_breakfast", new FurnitureFoodPlate(Material.GLASS, "food_plate_breakfast", InitTab.FURNITURE, 0.25F, 0.0F, SoundType.GLASS));
        DC_BLOCKS.put("food_plate_sandwich", new FurnitureFoodPlate(Material.GLASS, "food_plate_sandwich", InitTab.FURNITURE, 0.25F, 0.0F, SoundType.GLASS));

        //Light Source
        DC_BLOCKS.put("garden_wall_lamp", new FurnitureWallLight(Material.IRON, "garden_wall_lamp", InitTab.FURNITURE, 2.0F, 2.0F, "pickaxe", 0, SoundType.METAL, 1.0F));
        DC_BLOCKS.put("garden_lamp", new FurnitureLight(Material.IRON, "garden_lamp", InitTab.FURNITURE, 2.0F, 2.0F, "pickaxe", 0, SoundType.METAL, 1.0F));
        DC_BLOCKS.put("iron_wall_lamp", new FurnitureWallLight(Material.IRON, "iron_wall_lamp", InitTab.FURNITURE, 2.0F, 2.0F, "pickaxe", 0, SoundType.METAL, 1.0F));


        //Iron Wood
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