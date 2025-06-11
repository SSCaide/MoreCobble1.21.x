package net.sscaide.morecobble.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sscaide.morecobble.MoreCobble;
import net.sscaide.morecobble.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreCobble.MOD_ID);

    public static final Supplier<CreativeModeTab> MORE_COBBLE = CREATIVE_MODE_TAB.register("more_cobble",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.COBBLED_GRANITE.asItem()))
                    .title(Component.translatable("creativetab.sscmorecobble.more_cobble"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.COBBLED_GRANITE);
                        output.accept(ModBlocks.COBBLED_GRANITE_STAIRS);
                        output.accept(ModBlocks.COBBLED_GRANITE_SLAB);
                        output.accept(ModBlocks.COBBLED_GRANITE_WALL);
                        output.accept(ModBlocks.COBBLED_DIORITE);
                        output.accept(ModBlocks.COBBLED_DIORITE_STAIRS);
                        output.accept(ModBlocks.COBBLED_DIORITE_SLAB);
                        output.accept(ModBlocks.COBBLED_DIORITE_WALL);
                        output.accept(ModBlocks.COBBLED_ANDESITE);
                        output.accept(ModBlocks.COBBLED_ANDESITE_STAIRS);
                        output.accept(ModBlocks.COBBLED_ANDESITE_SLAB);
                        output.accept(ModBlocks.COBBLED_ANDESITE_WALL);
                        output.accept(ModBlocks.COBBLED_CALCITE);
                        output.accept(ModBlocks.COBBLED_CALCITE_STAIRS);
                        output.accept(ModBlocks.COBBLED_CALCITE_SLAB);
                        output.accept(ModBlocks.COBBLED_CALCITE_WALL);
                        output.accept(ModBlocks.COBBLED_TUFF);
                        output.accept(ModBlocks.COBBLED_TUFF_STAIRS);
                        output.accept(ModBlocks.COBBLED_TUFF_SLAB);
                        output.accept(ModBlocks.COBBLED_TUFF_WALL);
                        output.accept(ModBlocks.COBBLED_DRIPSTONE);
                        output.accept(ModBlocks.COBBLED_DRIPSTONE_STAIRS);
                        output.accept(ModBlocks.COBBLED_DRIPSTONE_SLAB);
                        output.accept(ModBlocks.COBBLED_DRIPSTONE_WALL);
                        output.accept(ModBlocks.COBBLED_BASALT);
                        output.accept(ModBlocks.COBBLED_BASALT_STAIRS);
                        output.accept(ModBlocks.COBBLED_BASALT_SLAB);
                        output.accept(ModBlocks.COBBLED_BASALT_WALL);
                        output.accept(ModBlocks.COBBLED_END_STONE);
                        output.accept(ModBlocks.COBBLED_END_STONE_STAIRS);
                        output.accept(ModBlocks.COBBLED_END_STONE_SLAB);
                        output.accept(ModBlocks.COBBLED_END_STONE_WALL);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
