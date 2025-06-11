package net.sscaide.morecobble.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.sscaide.morecobble.block.ModBlocks;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {

    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.COBBLED_GRANITE.get());
        dropSelf(ModBlocks.COBBLED_GRANITE_STAIRS.get());
        add(ModBlocks.COBBLED_GRANITE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.COBBLED_GRANITE_SLAB.get()));

        dropSelf(ModBlocks.COBBLED_DIORITE.get());
        dropSelf(ModBlocks.COBBLED_DIORITE_STAIRS.get());
        add(ModBlocks.COBBLED_DIORITE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.COBBLED_DIORITE_SLAB.get()));

        dropSelf(ModBlocks.COBBLED_ANDESITE.get());
        dropSelf(ModBlocks.COBBLED_ANDESITE_STAIRS.get());
        add(ModBlocks.COBBLED_ANDESITE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.COBBLED_ANDESITE_SLAB.get()));

        dropSelf(ModBlocks.COBBLED_CALCITE.get());
        dropSelf(ModBlocks.COBBLED_CALCITE_STAIRS.get());
        add(ModBlocks.COBBLED_CALCITE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.COBBLED_CALCITE_SLAB.get()));

        dropSelf(ModBlocks.COBBLED_TUFF.get());
        dropSelf(ModBlocks.COBBLED_TUFF_STAIRS.get());
        add(ModBlocks.COBBLED_TUFF_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.COBBLED_TUFF_SLAB.get()));

        dropSelf(ModBlocks.COBBLED_DRIPSTONE.get());
        dropSelf(ModBlocks.COBBLED_DRIPSTONE_STAIRS.get());
        add(ModBlocks.COBBLED_DRIPSTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.COBBLED_DRIPSTONE_SLAB.get()));

        dropSelf(ModBlocks.COBBLED_BASALT.get());
        dropSelf(ModBlocks.COBBLED_BASALT_STAIRS.get());
        add(ModBlocks.COBBLED_BASALT_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.COBBLED_BASALT_SLAB.get()));

        dropSelf(ModBlocks.COBBLED_END_STONE.get());
        dropSelf(ModBlocks.COBBLED_END_STONE_STAIRS.get());
        add(ModBlocks.COBBLED_END_STONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.COBBLED_END_STONE_SLAB.get()));

        dropSelf(ModBlocks.COBBLED_GRANITE_WALL.get());
        dropSelf(ModBlocks.COBBLED_DIORITE_WALL.get());
        dropSelf(ModBlocks.COBBLED_ANDESITE_WALL.get());
        dropSelf(ModBlocks.COBBLED_CALCITE_WALL.get());
        dropSelf(ModBlocks.COBBLED_TUFF_WALL.get());
        dropSelf(ModBlocks.COBBLED_DRIPSTONE_WALL.get());
        dropSelf(ModBlocks.COBBLED_BASALT_WALL.get());
        dropSelf(ModBlocks.COBBLED_END_STONE_WALL.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
