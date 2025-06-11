package net.sscaide.morecobble.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.client.model.generators.VariantBlockStateBuilder;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.sscaide.morecobble.MoreCobble;
import net.sscaide.morecobble.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MoreCobble.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        blockWithItem(ModBlocks.COBBLED_GRANITE);
        stairsBlock(ModBlocks.COBBLED_GRANITE_STAIRS.get(), blockTexture(ModBlocks.COBBLED_GRANITE.get()));
        blockItem(ModBlocks.COBBLED_GRANITE_STAIRS);
        slabBlock(ModBlocks.COBBLED_GRANITE_SLAB.get(), blockTexture(ModBlocks.COBBLED_GRANITE.get()), blockTexture(ModBlocks.COBBLED_GRANITE.get()));
        blockItem(ModBlocks.COBBLED_GRANITE_SLAB);

        blockWithItem(ModBlocks.COBBLED_DIORITE);
        stairsBlock(ModBlocks.COBBLED_DIORITE_STAIRS.get(), blockTexture(ModBlocks.COBBLED_DIORITE.get()));
        blockItem(ModBlocks.COBBLED_DIORITE_STAIRS);
        slabBlock(ModBlocks.COBBLED_DIORITE_SLAB.get(), blockTexture(ModBlocks.COBBLED_DIORITE.get()), blockTexture(ModBlocks.COBBLED_DIORITE.get()));
        blockItem(ModBlocks.COBBLED_DIORITE_SLAB);

        blockWithItem(ModBlocks.COBBLED_ANDESITE);
        stairsBlock(ModBlocks.COBBLED_ANDESITE_STAIRS.get(), blockTexture(ModBlocks.COBBLED_ANDESITE.get()));
        blockItem(ModBlocks.COBBLED_ANDESITE_STAIRS);
        slabBlock(ModBlocks.COBBLED_ANDESITE_SLAB.get(), blockTexture(ModBlocks.COBBLED_ANDESITE.get()), blockTexture(ModBlocks.COBBLED_ANDESITE.get()));
        blockItem(ModBlocks.COBBLED_ANDESITE_SLAB);

        blockWithItem(ModBlocks.COBBLED_CALCITE);
        stairsBlock(ModBlocks.COBBLED_CALCITE_STAIRS.get(), blockTexture(ModBlocks.COBBLED_CALCITE.get()));
        blockItem(ModBlocks.COBBLED_CALCITE_STAIRS);
        slabBlock(ModBlocks.COBBLED_CALCITE_SLAB.get(), blockTexture(ModBlocks.COBBLED_CALCITE.get()), blockTexture(ModBlocks.COBBLED_CALCITE.get()));
        blockItem(ModBlocks.COBBLED_CALCITE_SLAB);

        blockWithItem(ModBlocks.COBBLED_TUFF);
        stairsBlock(ModBlocks.COBBLED_TUFF_STAIRS.get(), blockTexture(ModBlocks.COBBLED_TUFF.get()));
        blockItem(ModBlocks.COBBLED_TUFF_STAIRS);
        slabBlock(ModBlocks.COBBLED_TUFF_SLAB.get(), blockTexture(ModBlocks.COBBLED_TUFF.get()), blockTexture(ModBlocks.COBBLED_TUFF.get()));
        blockItem(ModBlocks.COBBLED_TUFF_SLAB);

        blockWithItem(ModBlocks.COBBLED_DRIPSTONE);
        stairsBlock(ModBlocks.COBBLED_DRIPSTONE_STAIRS.get(), blockTexture(ModBlocks.COBBLED_DRIPSTONE.get()));
        blockItem(ModBlocks.COBBLED_DRIPSTONE_STAIRS);
        slabBlock(ModBlocks.COBBLED_DRIPSTONE_SLAB.get(), blockTexture(ModBlocks.COBBLED_DRIPSTONE.get()), blockTexture(ModBlocks.COBBLED_DRIPSTONE.get()));
        blockItem(ModBlocks.COBBLED_DRIPSTONE_SLAB);

        blockWithItem(ModBlocks.COBBLED_BASALT);
        stairsBlock(ModBlocks.COBBLED_BASALT_STAIRS.get(), blockTexture(ModBlocks.COBBLED_BASALT.get()));
        blockItem(ModBlocks.COBBLED_BASALT_STAIRS);
        slabBlock(ModBlocks.COBBLED_BASALT_SLAB.get(), blockTexture(ModBlocks.COBBLED_BASALT.get()), blockTexture(ModBlocks.COBBLED_BASALT.get()));
        blockItem(ModBlocks.COBBLED_BASALT_SLAB);

        blockWithItem(ModBlocks.COBBLED_END_STONE);
        stairsBlock(ModBlocks.COBBLED_END_STONE_STAIRS.get(), blockTexture(ModBlocks.COBBLED_END_STONE.get()));
        blockItem(ModBlocks.COBBLED_END_STONE_STAIRS);
        slabBlock(ModBlocks.COBBLED_END_STONE_SLAB.get(), blockTexture(ModBlocks.COBBLED_END_STONE.get()), blockTexture(ModBlocks.COBBLED_END_STONE.get()));
        blockItem(ModBlocks.COBBLED_END_STONE_SLAB);

        wallBlock(ModBlocks.COBBLED_GRANITE_WALL.get(), blockTexture(ModBlocks.COBBLED_GRANITE.get()));
        wallBlock(ModBlocks.COBBLED_DIORITE_WALL.get(), blockTexture(ModBlocks.COBBLED_DIORITE.get()));
        wallBlock(ModBlocks.COBBLED_ANDESITE_WALL.get(), blockTexture(ModBlocks.COBBLED_ANDESITE.get()));
        wallBlock(ModBlocks.COBBLED_CALCITE_WALL.get(), blockTexture(ModBlocks.COBBLED_CALCITE.get()));
        wallBlock(ModBlocks.COBBLED_TUFF_WALL.get(), blockTexture(ModBlocks.COBBLED_TUFF.get()));
        wallBlock(ModBlocks.COBBLED_DRIPSTONE_WALL.get(), blockTexture(ModBlocks.COBBLED_DRIPSTONE.get()));
        wallBlock(ModBlocks.COBBLED_BASALT_WALL.get(), blockTexture(ModBlocks.COBBLED_BASALT.get()));
        wallBlock(ModBlocks.COBBLED_END_STONE_WALL.get(), blockTexture(ModBlocks.COBBLED_END_STONE.get()));

    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
    private void blockWithItem(DeferredBlock<?> block, String name, ResourceLocation texture) {
        ModelFile model = models().cubeAll(name, texture);
        VariantBlockStateBuilder variantBuilder = getVariantBuilder(block.get());
        VariantBlockStateBuilder.PartialBlockstate partialState = variantBuilder.partialState();
        getVariantBuilder(block.get()).addModels(partialState, partialState.modelForState().modelFile(model).build());
        simpleBlockItem(block.get(), model);
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("sscmorecobble:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("sscmorecobble:block/" + deferredBlock.getId().getPath() + appendix));
    }
}
