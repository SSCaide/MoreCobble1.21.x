package net.sscaide.morecobble.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SmeltingRecipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.sscaide.morecobble.MoreCobble;
import net.sscaide.morecobble.block.ModBlocks;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, ExistingFileHelper existingFileHelper) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        cobble(recipeOutput, ModBlocks.COBBLED_GRANITE, Blocks.GRANITE);
        cobble(recipeOutput, ModBlocks.COBBLED_DIORITE, Blocks.DIORITE);
        cobble(recipeOutput, ModBlocks.COBBLED_ANDESITE, Blocks.ANDESITE);
        cobble(recipeOutput, ModBlocks.COBBLED_CALCITE, Blocks.CALCITE);
        cobble(recipeOutput, ModBlocks.COBBLED_TUFF, Blocks.TUFF);
        cobble(recipeOutput, ModBlocks.COBBLED_DRIPSTONE, Blocks.DRIPSTONE_BLOCK);
        cobble(recipeOutput, ModBlocks.COBBLED_BASALT, Blocks.BASALT);
        cobble(recipeOutput, ModBlocks.COBBLED_END_STONE, Blocks.END_STONE);
    }

    protected static void cobble(RecipeOutput recipeOutput, ItemLike block, ItemLike smoothBlock) {
        ResourceLocation theSlab = ResourceLocation.fromNamespaceAndPath(MoreCobble.MOD_ID, getItemName(block) + "_slab");
        ResourceLocation theStair = ResourceLocation.fromNamespaceAndPath(MoreCobble.MOD_ID, getItemName(block) + "_stairs");
        ResourceLocation theWall = ResourceLocation.fromNamespaceAndPath(MoreCobble.MOD_ID, getItemName(block) + "_wall");
        ItemLike slab = BuiltInRegistries.ITEM.get(theSlab);
        ItemLike stair = BuiltInRegistries.ITEM.get(theStair);
        ItemLike wall = BuiltInRegistries.ITEM.get(theWall);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, slab, 6)
                .pattern("AAA")
                .define('A', block)
                .group("cobblestone_slabs")
                .unlockedBy("has_" + getItemName(block), has(block))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, stair, 4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', block)
                .group("cobblestone_stairs")
                .unlockedBy("has_" + getItemName(block), has(block))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, wall, 6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', block)
                .group("cobblestone_walls")
                .unlockedBy("has_" + getItemName(block), has(block))
                .save(recipeOutput);
        List<ItemLike> SMELT = List.of(block);
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, SMELT, RecipeCategory.BUILDING_BLOCKS, smoothBlock, 0.0f, 200, getItemName(smoothBlock), "_from_smelting_cobble");
    }
}


