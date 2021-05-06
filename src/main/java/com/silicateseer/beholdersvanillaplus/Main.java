package com.silicateseer.beholdersvanillaplus;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.WallBlock;
import net.minecraft.block.PressurePlateBlock.ActivationRule;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {
	
	public static final String MODID = "beholdersvanillaplus";
	
	//walls
	//quartz
	public static final Block QUARTZ_WALL = register("quartz_wall", 
			new WallBlock(FabricBlockSettings.copy(Blocks.QUARTZ_BLOCK)), ItemGroup.DECORATIONS);
	//chiseled quartz
	public static final Block CHISELED_QUARTZ_WALL = register("chiseled_quartz_wall", 
			new WallBlock(FabricBlockSettings.copy(Blocks.CHISELED_QUARTZ_BLOCK)), ItemGroup.DECORATIONS);
	//quartz brick
	public static final Block QUARTZ_BRICK_WALL = register("quartz_brick_wall", 
			new WallBlock(FabricBlockSettings.copy(Blocks.QUARTZ_BRICKS)), ItemGroup.DECORATIONS);
	//smooth quartz
	public static final Block SMOOTH_QUARTZ_WALL = register("smooth_quartz_wall", 
			new WallBlock(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ)), ItemGroup.DECORATIONS);
	//cut sandstone
	public static final Block CUT_SANDSTONE_WALL = register("cut_sandstone_wall", 
			new WallBlock(FabricBlockSettings.copy(Blocks.CUT_SANDSTONE)), ItemGroup.DECORATIONS);
	//smooth sandstone
	public static final Block SMOOTH_SANDSTONE_WALL = register("smooth_sandstone_wall", 
			new WallBlock(FabricBlockSettings.copy(Blocks.SMOOTH_SANDSTONE)), ItemGroup.DECORATIONS);
	//cut red sandstone
	public static final Block CUT_RED_SANDSTONE_WALL = register("cut_red_sandstone_wall", 
			new WallBlock(FabricBlockSettings.copy(Blocks.CUT_RED_SANDSTONE)), ItemGroup.DECORATIONS);
	//smooth red sandstone
	public static final Block SMOOTH_RED_SANDSTONE_WALL = register("smooth_red_sandstone_wall", 
			new WallBlock(FabricBlockSettings.copy(Blocks.SMOOTH_RED_SANDSTONE)), ItemGroup.DECORATIONS);
	//prismarine brick
	public static final Block PRISMARINE_BRICK_WALL = register("prismarine_brick_wall", 
			new WallBlock(FabricBlockSettings.copy(Blocks.PRISMARINE_BRICKS)), ItemGroup.DECORATIONS);
	//dark prismarine
	public static final Block DARK_PRISMARINE_WALL = register("dark_prismarine_wall", 
			new WallBlock(FabricBlockSettings.copy(Blocks.DARK_PRISMARINE)), ItemGroup.DECORATIONS);
	//pressure plates
	//quartz
	public static final Block QUARTZ_PRESSURE_PLATE = register("quartz_pressure_plate", 
			new BVPPressurePlateBlock(ActivationRule.MOBS, FabricBlockSettings.of(Material.STONE, Blocks.QUARTZ_BLOCK.getDefaultMaterialColor()).noCollision().strength(0.5F).sounds(BlockSoundGroup.STONE)), ItemGroup.REDSTONE);
	//sandstone
	public static final Block SANDSTONE_PRESSURE_PLATE = register("sandstone_pressure_plate", 
			new BVPPressurePlateBlock(ActivationRule.MOBS, FabricBlockSettings.of(Material.STONE, Blocks.SANDSTONE.getDefaultMaterialColor()).noCollision().strength(0.5F).sounds(BlockSoundGroup.STONE)), ItemGroup.REDSTONE);
	//red sandstone
	public static final Block RED_SANDSTONE_PRESSURE_PLATE = register("red_sandstone_pressure_plate", 
			new BVPPressurePlateBlock(ActivationRule.MOBS, FabricBlockSettings.of(Material.STONE, Blocks.RED_SANDSTONE.getDefaultMaterialColor()).noCollision().strength(0.5F).sounds(BlockSoundGroup.STONE)), ItemGroup.REDSTONE);
	//dark prismarine
	public static final Block DARK_PRISMARINE_PRESSURE_PLATE = register("dark_prismarine_pressure_plate", 
			new BVPPressurePlateBlock(ActivationRule.MOBS, FabricBlockSettings.of(Material.STONE, Blocks.DARK_PRISMARINE.getDefaultMaterialColor()).noCollision().strength(0.5F).sounds(BlockSoundGroup.STONE)), ItemGroup.REDSTONE);
	//buttons
	//quartz
	public static final Block QUARTZ_BUTTON = register("quartz_button", 
			new BVPStoneButtonBlock(FabricBlockSettings.of(Material.SUPPORTED, Blocks.QUARTZ_BLOCK.getDefaultMaterialColor()).noCollision().strength(0.5F).sounds(BlockSoundGroup.STONE)), ItemGroup.REDSTONE);
	//chiseled quartz
	public static final Block CHISELED_QUARTZ_BUTTON = register("chiseled_quartz_button", 
			new BVPStoneButtonBlock(FabricBlockSettings.of(Material.SUPPORTED, Blocks.CHISELED_QUARTZ_BLOCK.getDefaultMaterialColor()).noCollision().strength(0.5F).sounds(BlockSoundGroup.STONE)), ItemGroup.REDSTONE);
	//sandstone
	public static final Block SANDSTONE_BUTTON = register("sandstone_button", 
			new BVPStoneButtonBlock(FabricBlockSettings.of(Material.SUPPORTED, Blocks.SANDSTONE.getDefaultMaterialColor()).noCollision().strength(0.5F).sounds(BlockSoundGroup.STONE)), ItemGroup.REDSTONE);
	//red sandstone
	public static final Block RED_SANDSTONE_BUTTON = register("red_sandstone_button", 
			new BVPStoneButtonBlock(FabricBlockSettings.of(Material.SUPPORTED, Blocks.RED_SANDSTONE.getDefaultMaterialColor()).noCollision().strength(0.5F).sounds(BlockSoundGroup.STONE)), ItemGroup.REDSTONE);
	
	@Override
	public void onInitialize() {
		
	}
	
	public static Block register(String name, Block block, ItemGroup tab) {
		Registry.register(Registry.BLOCK, new Identifier(MODID, name), block);
		BlockItem item = new BlockItem(block, new Item.Settings().group(tab));
		register(name, item);
		return block;
	}

	public static Item register(String name, Item item) {
		Registry.register(Registry.ITEM, new Identifier(MODID, name), item);
		return item;
	}
}
