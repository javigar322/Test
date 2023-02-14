
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.test.block.FossoreBlock;
import net.mcreator.test.block.FossdimensionPortalBlock;
import net.mcreator.test.TestMod;

public class TestModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TestMod.MODID);
	public static final RegistryObject<Block> FOSSORE = REGISTRY.register("fossore", () -> new FossoreBlock());
	public static final RegistryObject<Block> FOSSDIMENSION_PORTAL = REGISTRY.register("fossdimension_portal", () -> new FossdimensionPortalBlock());
}
