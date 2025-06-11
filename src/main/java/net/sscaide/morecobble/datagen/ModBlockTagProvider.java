package net.sscaide.morecobble.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.sscaide.morecobble.MoreCobble;
import net.sscaide.morecobble.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MoreCobble.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.COBBLED_GRANITE.get())
                .add(ModBlocks.COBBLED_GRANITE_STAIRS.get())
                .add(ModBlocks.COBBLED_GRANITE_SLAB.get())
                .add(ModBlocks.COBBLED_DIORITE.get())
                .add(ModBlocks.COBBLED_DIORITE_STAIRS.get())
                .add(ModBlocks.COBBLED_DIORITE_SLAB.get())
                .add(ModBlocks.COBBLED_ANDESITE.get())
                .add(ModBlocks.COBBLED_ANDESITE_STAIRS.get())
                .add(ModBlocks.COBBLED_ANDESITE_SLAB.get())
                .add(ModBlocks.COBBLED_CALCITE.get())
                .add(ModBlocks.COBBLED_CALCITE_STAIRS.get())
                .add(ModBlocks.COBBLED_CALCITE_SLAB.get())
                .add(ModBlocks.COBBLED_TUFF.get())
                .add(ModBlocks.COBBLED_TUFF_STAIRS.get())
                .add(ModBlocks.COBBLED_TUFF_SLAB.get())
                .add(ModBlocks.COBBLED_DRIPSTONE.get())
                .add(ModBlocks.COBBLED_DRIPSTONE_STAIRS.get())
                .add(ModBlocks.COBBLED_DRIPSTONE_SLAB.get())
                .add(ModBlocks.COBBLED_BASALT.get())
                .add(ModBlocks.COBBLED_BASALT_STAIRS.get())
                .add(ModBlocks.COBBLED_BASALT_SLAB.get())
                .add(ModBlocks.COBBLED_END_STONE.get())
                .add(ModBlocks.COBBLED_END_STONE_STAIRS.get())
                .add(ModBlocks.COBBLED_END_STONE_SLAB.get())

                .add(ModBlocks.COBBLED_GRANITE_WALL.get())
                .add(ModBlocks.COBBLED_DIORITE_WALL.get())
                .add(ModBlocks.COBBLED_ANDESITE_WALL.get())
                .add(ModBlocks.COBBLED_CALCITE_WALL.get())
                .add(ModBlocks.COBBLED_TUFF_WALL.get())
                .add(ModBlocks.COBBLED_DRIPSTONE_WALL.get())
                .add(ModBlocks.COBBLED_BASALT_WALL.get())
                .add(ModBlocks.COBBLED_END_STONE_WALL.get())
        ;

        tag(BlockTags.WALLS)
                .add(ModBlocks.COBBLED_GRANITE_WALL.get())
                .add(ModBlocks.COBBLED_DIORITE_WALL.get())
                .add(ModBlocks.COBBLED_ANDESITE_WALL.get())
                .add(ModBlocks.COBBLED_CALCITE_WALL.get())
                .add(ModBlocks.COBBLED_TUFF_WALL.get())
                .add(ModBlocks.COBBLED_DRIPSTONE_WALL.get())
                .add(ModBlocks.COBBLED_BASALT_WALL.get())
                .add(ModBlocks.COBBLED_END_STONE_WALL.get())
        ;
        tag(BlockTags.FENCES)
                .add(ModBlocks.COBBLED_GRANITE_WALL.get())
                .add(ModBlocks.COBBLED_DIORITE_WALL.get())
                .add(ModBlocks.COBBLED_ANDESITE_WALL.get())
                .add(ModBlocks.COBBLED_CALCITE_WALL.get())
                .add(ModBlocks.COBBLED_TUFF_WALL.get())
                .add(ModBlocks.COBBLED_DRIPSTONE_WALL.get())
                .add(ModBlocks.COBBLED_BASALT_WALL.get())
                .add(ModBlocks.COBBLED_END_STONE_WALL.get())
        ;
    }
}
