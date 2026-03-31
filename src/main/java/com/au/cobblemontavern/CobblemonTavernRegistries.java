package com.au.cobblemontavern;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredRegister.Blocks;
import net.neoforged.neoforge.registries.DeferredRegister.Items;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public class CobblemonTavernRegistries {
    public static final Blocks DRINK_BLOCKS = DeferredRegister.createBlocks("cobblemontavern");
    public static final Items DRINK_ITEMS = DeferredRegister.createItems("cobblemontavern");

    public static final DeferredBlock<Block> MAOTAI = DRINK_BLOCKS.register("maotai",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .strength(0.5f)
                    .noOcclusion()
                    .isValidSpawn((state, level, pos, entityType) -> false)));

    public static final DeferredBlock<Block> WULIANGYE = DRINK_BLOCKS.register("wuliangye",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .strength(0.5f)
                    .noOcclusion()
                    .isValidSpawn((state, level, pos, entityType) -> false)));

    public static final DeferredBlock<Block> GUANGXI_GONGWENBAO = DRINK_BLOCKS.register("guangxi_gongwenbao",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .strength(0.5f)
                    .noOcclusion()
                    .isValidSpawn((state, level, pos, entityType) -> false)));

    public static final DeferredHolder<Item, BlockItem> MAOTAI_ITEM = DRINK_ITEMS.register("maotai",
            () -> new BlockItem(MAOTAI.get(), new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> WULIANGYE_ITEM = DRINK_ITEMS.register("wuliangye",
            () -> new BlockItem(WULIANGYE.get(), new Item.Properties()));
    public static final DeferredHolder<Item, BlockItem> GUANGXI_GONGWENBAO_ITEM = DRINK_ITEMS.register("guangxi_gongwenbao",
            () -> new BlockItem(GUANGXI_GONGWENBAO.get(), new Item.Properties()));

    public static void register(IEventBus modEventBus) {
        DRINK_BLOCKS.register(modEventBus);
        DRINK_ITEMS.register(modEventBus);
    }
}
