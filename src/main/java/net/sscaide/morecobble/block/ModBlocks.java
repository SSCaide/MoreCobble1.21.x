package net.sscaide.morecobble.block;

import net.minecraft.util.ColorRGBA;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sscaide.morecobble.MoreCobble;
import net.sscaide.morecobble.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(MoreCobble.MOD_ID);


    public static final DeferredBlock<Block> COBBLED_GRANITE = registerBlock("cobbled_granite",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().explosionResistance(6f)
                    .sound(SoundType.STONE)));
    public static final DeferredBlock<StairBlock> COBBLED_GRANITE_STAIRS = registerBlock("cobbled_granite_stairs",
            () -> new StairBlock(ModBlocks.COBBLED_GRANITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().explosionResistance(6f)
                            .sound(SoundType.STONE)));
    public static final DeferredBlock<SlabBlock> COBBLED_GRANITE_SLAB = registerBlock("cobbled_granite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().explosionResistance(6f)
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> COBBLED_DIORITE = registerBlock("cobbled_diorite",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().explosionResistance(6f)
                    .sound(SoundType.STONE)));
    public static final DeferredBlock<StairBlock> COBBLED_DIORITE_STAIRS = registerBlock("cobbled_diorite_stairs",
            () -> new StairBlock(ModBlocks.COBBLED_DIORITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().explosionResistance(6f)
                            .sound(SoundType.STONE)));
    public static final DeferredBlock<SlabBlock> COBBLED_DIORITE_SLAB = registerBlock("cobbled_diorite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().explosionResistance(6f)
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> COBBLED_ANDESITE = registerBlock("cobbled_andesite",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().explosionResistance(6f)
                    .sound(SoundType.STONE)));
    public static final DeferredBlock<StairBlock> COBBLED_ANDESITE_STAIRS = registerBlock("cobbled_andesite_stairs",
            () -> new StairBlock(ModBlocks.COBBLED_ANDESITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().explosionResistance(6f)
                            .sound(SoundType.STONE)));
    public static final DeferredBlock<SlabBlock> COBBLED_ANDESITE_SLAB = registerBlock("cobbled_andesite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().explosionResistance(6f)
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> COBBLED_CALCITE = registerBlock("cobbled_calcite",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().explosionResistance(.75f)
                    .sound(SoundType.CALCITE)));
    public static final DeferredBlock<StairBlock> COBBLED_CALCITE_STAIRS = registerBlock("cobbled_calcite_stairs",
            () -> new StairBlock(ModBlocks.COBBLED_CALCITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops().explosionResistance(.75f)
                            .sound(SoundType.CALCITE)));
    public static final DeferredBlock<SlabBlock> COBBLED_CALCITE_SLAB = registerBlock("cobbled_calcite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().explosionResistance(.75f)
                    .sound(SoundType.CALCITE)));

    public static final DeferredBlock<Block> COBBLED_TUFF = registerBlock("cobbled_tuff",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().explosionResistance(6f)
                    .sound(SoundType.TUFF)));
    public static final DeferredBlock<StairBlock> COBBLED_TUFF_STAIRS = registerBlock("cobbled_tuff_stairs",
            () -> new StairBlock(ModBlocks.COBBLED_TUFF.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().explosionResistance(6f)
                            .sound(SoundType.TUFF)));
    public static final DeferredBlock<SlabBlock> COBBLED_TUFF_SLAB = registerBlock("cobbled_tuff_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().explosionResistance(6f)
                    .sound(SoundType.TUFF)));

    public static final DeferredBlock<Block> COBBLED_DRIPSTONE = registerBlock("cobbled_dripstone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().explosionResistance(1f)
                    .sound(SoundType.DRIPSTONE_BLOCK)));
    public static final DeferredBlock<StairBlock> COBBLED_DRIPSTONE_STAIRS = registerBlock("cobbled_dripstone_stairs",
            () -> new StairBlock(ModBlocks.COBBLED_DRIPSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().explosionResistance(1f)
                            .sound(SoundType.DRIPSTONE_BLOCK)));
    public static final DeferredBlock<SlabBlock> COBBLED_DRIPSTONE_SLAB = registerBlock("cobbled_dripstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().explosionResistance(1f)
                    .sound(SoundType.DRIPSTONE_BLOCK)));

    public static final DeferredBlock<Block> COBBLED_BASALT = registerBlock("cobbled_basalt",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.75f).requiresCorrectToolForDrops().explosionResistance(4.2f)
                    .sound(SoundType.STONE)));
    public static final DeferredBlock<StairBlock> COBBLED_BASALT_STAIRS = registerBlock("cobbled_basalt_stairs",
            () -> new StairBlock(ModBlocks.COBBLED_BASALT.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(1.75f).requiresCorrectToolForDrops().explosionResistance(4.2f)
                            .sound(SoundType.STONE)));
    public static final DeferredBlock<SlabBlock> COBBLED_BASALT_SLAB = registerBlock("cobbled_basalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.75f).requiresCorrectToolForDrops().explosionResistance(4.2f)
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> COBBLED_END_STONE = registerBlock("cobbled_end_stone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.5f).requiresCorrectToolForDrops().explosionResistance(9f)
                    .sound(SoundType.STONE)));
    public static final DeferredBlock<StairBlock> COBBLED_END_STONE_STAIRS = registerBlock("cobbled_end_stone_stairs",
            () -> new StairBlock(ModBlocks.COBBLED_END_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().explosionResistance(9f)
                            .sound(SoundType.STONE)));
    public static final DeferredBlock<SlabBlock> COBBLED_END_STONE_SLAB = registerBlock("cobbled_end_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(3.5f).requiresCorrectToolForDrops().explosionResistance(9f)
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<WallBlock> COBBLED_GRANITE_WALL = registerBlock("cobbled_granite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(ModBlocks.COBBLED_GRANITE.get())));
    public static final DeferredBlock<WallBlock> COBBLED_DIORITE_WALL = registerBlock("cobbled_diorite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(ModBlocks.COBBLED_DIORITE.get())));
    public static final DeferredBlock<WallBlock> COBBLED_ANDESITE_WALL = registerBlock("cobbled_andesite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(ModBlocks.COBBLED_ANDESITE.get())));

    public static final DeferredBlock<WallBlock> COBBLED_CALCITE_WALL = registerBlock("cobbled_calcite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(ModBlocks.COBBLED_CALCITE.get())));
    public static final DeferredBlock<WallBlock> COBBLED_TUFF_WALL = registerBlock("cobbled_tuff_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(ModBlocks.COBBLED_TUFF.get())));
    public static final DeferredBlock<WallBlock> COBBLED_DRIPSTONE_WALL = registerBlock("cobbled_dripstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(ModBlocks.COBBLED_DRIPSTONE.get())));

    public static final DeferredBlock<WallBlock> COBBLED_BASALT_WALL = registerBlock("cobbled_basalt_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(ModBlocks.COBBLED_BASALT.get())));
    public static final DeferredBlock<WallBlock> COBBLED_END_STONE_WALL = registerBlock("cobbled_end_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(ModBlocks.COBBLED_END_STONE.get())));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
