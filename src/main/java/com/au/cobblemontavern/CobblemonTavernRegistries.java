package com.au.cobblemontavern;

import com.github.ysbbbbbb.kaleidoscopetavern.block.brew.DrinkBlock;
import com.github.ysbbbbbb.kaleidoscopetavern.item.DrinkBlockItem;

import net.minecraft.world.level.block.Block;进口net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.Shapes;

import net.neoforged.bus.api.IEventBus;进口net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;进口net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;进口net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;进口net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredRegister.Blocks;进口net.neoforged.neoforge.registries.DeferredRegister.Blocks;
import net.neoforged.neoforge.registries.DeferredRegister.Items;进口net.neoforged.neoforge.registries.DeferredRegister.Items;
import net.minecraft.world.item.Item;进口net.minecraft.world.item.Item;

public class CobblemonTavernRegistries {cobblemontavernregistres {
    public static final Blocks DRINK_BLOCKS = DeferredRegister.createBlocks("cobblemontavern");public   公共 static   静态 final   最后 Blocks   块 DRINK_BLOCKS = deferredreregister . createblocks ("cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern")；
    public static final Items DRINK_ITEMS = DeferredRegister.createItems("cobblemontavern");public   公共 static   静态 final   最后 Items   项目 DRINK_ITEMS = deferredreregister . createitems ("cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern")；

    public static final DeferredBlock<Block> MAOTAI = DRINK_BLOCKS.register("maotai",public   公共 static   静态 final   最后 DeferredBlock<Block   块>；茅台= DRINK_BLOCKS.register   注册("；茅台"；；
            () -> new DrinkBlock(false, 4, Shapes.empty()));

    public static final DeferredBlock<Block> WULIANGYE = DRINK_BLOCKS.register("wuliangye",Block> WULIANGYE = DRINK_BLOCKS.register   注册(" WULIANGYE "；
            () -> new DrinkBlock(false, 4, Shapes.empty()));

    public static final DeferredBlock<Block> GUANGXI_GONGWENBAO = DRINK_BLOCKS.register("guangxi_gongwenbao",public   公共 static   静态 final   最后 DeferredBlock<Block   块> GUANGXI_GONGWENBAO = DRINK_BLOCKS.register   注册   注册(" GUANGXI_GONGWENBAO；
            () -> new DrinkBlock(false, 4, Shapes.empty()));

    public static final DeferredHolder<Item, DrinkBlockItem> MAOTAI_ITEM = DRINK_ITEMS.register("maotai",
            () -> new DrinkBlockItem(MAOTAI.get()));

    public static final DeferredHolder<Item, DrinkBlockItem> WULIANGYE_ITEM = DRINK_ITEMS.register("wuliangye",
            () -> new DrinkBlockItem(WULIANGYE.get()));

    public static final DeferredHolder<Item, DrinkBlockItem> GUANGXI_GONGWENBAO_ITEM = DRINK_ITEMS.register("guangxi_gongwenbao",
            () -> new DrinkBlockItem(GUANGXI_GONGWENBAO.get()));

    public static void register(IEventBus modEventBus) {
        DRINK_BLOCKS.register(modEventBus);
        DRINK_ITEMS.register(modEventBus);
    }
}
