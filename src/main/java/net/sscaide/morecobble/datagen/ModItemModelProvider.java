package net.sscaide.morecobble.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.sscaide.morecobble.MoreCobble;
import net.sscaide.morecobble.block.ModBlocks;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MoreCobble.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        cobbleWallItem(ModBlocks.COBBLED_GRANITE_WALL, ModBlocks.COBBLED_GRANITE);
        cobbleWallItem(ModBlocks.COBBLED_DIORITE_WALL, ModBlocks.COBBLED_DIORITE);
        cobbleWallItem(ModBlocks.COBBLED_ANDESITE_WALL, ModBlocks.COBBLED_ANDESITE);
        cobbleWallItem(ModBlocks.COBBLED_CALCITE_WALL, ModBlocks.COBBLED_CALCITE);
        cobbleWallItem(ModBlocks.COBBLED_TUFF_WALL, ModBlocks.COBBLED_TUFF);
        cobbleWallItem(ModBlocks.COBBLED_DRIPSTONE_WALL, ModBlocks.COBBLED_DRIPSTONE);
        cobbleWallItem(ModBlocks.COBBLED_BASALT_WALL, ModBlocks.COBBLED_BASALT);
        cobbleWallItem(ModBlocks.COBBLED_END_STONE_WALL, ModBlocks.COBBLED_END_STONE);
    }

    public void cobbleWallItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(MoreCobble.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }
}
