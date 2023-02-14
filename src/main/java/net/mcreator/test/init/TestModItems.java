
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.test.item.FosspickaxeItem;
import net.mcreator.test.item.FossingotItem;
import net.mcreator.test.item.FossdimensionItem;
import net.mcreator.test.item.FossAmorItem;
import net.mcreator.test.TestMod;

public class TestModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);
	public static final RegistryObject<Item> FOSS_AMOR_HELMET = REGISTRY.register("foss_amor_helmet", () -> new FossAmorItem.Helmet());
	public static final RegistryObject<Item> FOSS_AMOR_CHESTPLATE = REGISTRY.register("foss_amor_chestplate", () -> new FossAmorItem.Chestplate());
	public static final RegistryObject<Item> FOSS_AMOR_LEGGINGS = REGISTRY.register("foss_amor_leggings", () -> new FossAmorItem.Leggings());
	public static final RegistryObject<Item> FOSS_AMOR_BOOTS = REGISTRY.register("foss_amor_boots", () -> new FossAmorItem.Boots());
	public static final RegistryObject<Item> FOSSINGOT = REGISTRY.register("fossingot", () -> new FossingotItem());
	public static final RegistryObject<Item> FOSSORE = block(TestModBlocks.FOSSORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FOSSPICKAXE = REGISTRY.register("fosspickaxe", () -> new FosspickaxeItem());
	public static final RegistryObject<Item> FOSSDIMENSION = REGISTRY.register("fossdimension", () -> new FossdimensionItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
