package   包 com.au.cobblemontavern;

import com.github.ysbbbbbb.kaleidoscopetavern.block.brew.DrinkBlock;进口com.github.ysbbbbbb.kaleidoscopetavern.block.brew.DrinkBlock;
import com.github.ysbbbbbb.kaleidoscopetavern.item.DrinkBlockItem;进口com.github.ysbbbbbb.kaleidoscopetavern.item.DrinkBlockItem;
import net.minecraft.world.level.block.Block;进口net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.Shapes;进口net.minecraft.world.phys.shapes.Shapes;
import net.neoforged.bus.api.IEventBus;进口net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;进口net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;进口net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;进口net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredRegister.Blocks;进口net.neoforged.neoforge.registries.DeferredRegister.Blocks;
import net.neoforged.neoforge.registries.DeferredRegister.Items;进口net.neoforged.neoforge.registries.DeferredRegister.Items;
import net.minecraft.world.item.Item;进口net.minecraft.world.item.Item;

public class CobblemonTavernRegistries {cobblemontavernregistres {
    public static final Blocks DRINK_BLOCKS = DeferredRegister.createBlocks("cobblemontavern");public   公共 static   静态 final   最后 Blocks   块 DRINK_BLOCKS = deferredreregister . createblocks ("cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern")；
    public static final Items DRINK_ITEMS = DeferredRegister.createItems("cobblemontavern");public   公共 static   静态 final   最后 Items   项目 DRINK_ITEMS = deferredreregister . createitems ("cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern"   "cobblemontavern")；

    // 方块注册 —— 严格参照 DrinkBlock 的 builder 写法
    public static final DeferredBlock<Block> MAOTAI = DRINK_BLOCKS.register("maotai", DrinkBlock.create()
            .maxCount(4)
            .shapes(
                    Block.box(4, 0, 4, 12, 15, 12),
                    Block.box(0, 0, 4, 16, 15, 12),
                    Shapes.or(
                            Block.box(0, 0, 8, 16, 15, 16),
                            Block.box(4, 0, 0, 12, 15, 16)
                    ),
                    Block.box(0, 0, 0, 16, 16, 16)
            ).build());

    public static final DeferredBlock<Block> WULIANGYE = DRINK_BLOCKS.register("wuliangye", DrinkBlock.create()
            .maxCount(4)
            .shapes(
                    Block.box(4, 0, 4, 12, 15, 12),
                    Block.box(0, 0, 4, 16, 15, 12),
                    Shapes.or(
                            Block.box(0, 0, 8, 16, 15, 16),
                            Block.box(4, 0, 0, 12, 15, 16)
                    ),
                    Block.box(0, 0, 0, 16, 16, 16)
            ).build());

    public static final DeferredBlock<Block> GUANGXI_GONGWENBAO = DRINK_BLOCKS.register("guangxi_gongwenbao", DrinkBlock.create()
            .maxCount(4)
            .shapes(
                    Block.box(4, 0, 4, 12, 15, 12),
                    Block.box(0, 0, 4, 16, 15, 12),
                    Shapes.or(
                            Block.box(0, 0, 8, 16, 15, 16),
                            Block.box(4, 0, 0, 12, 15, 16)
                    ),
                    Block.box(0, 0, 0, 16, 16, 16)
            ).build());

    // 物品注册 —— DrinkBlockItem 构造器只接受 Block 参数，需用 .get() 获取实际方块
    public static final DeferredHolder<Item, DrinkBlockItem> MAOTAI_ITEM = DRINK_ITEMS.register("maotai",public   公共 static   静态 final   最后 DeferredHolder<Item   项, DrinkBlockItem> MAOTAI_ITEM = DRINK_ITEMS.register   注册("；茅台"；；
            () -> new DrinkBlockItem(MAOTAI.get()));（） -> new   新 drinkblock (MAOTAI.get   得到()))；

    public static final DeferredHolder<Item, DrinkBlockItem> WULIANGYE_ITEM = DRINK_ITEMS.register("wuliangye",public   公共 static   静态 final   最后 DeferredHolder<Item   项, DrinkBlockItem> WULIANGYE_ITEM = DRINK_ITEMS.register   注册(" WULIANGYE_ITEM;；
            () -> new DrinkBlockItem(WULIANGYE.get()));（） -> new   新 DrinkBlockItem(WULIANGYE.get   得到()))；

    public static final DeferredHolder<Item, DrinkBlockItem> GUANGXI_GONGWENBAO_ITEM = DRINK_ITEMS.register("guangxi_gongwenbao",public   公共 static   静态 final   最后 DeferredHolder<Item   项, DrinkBlockItem> GUANGXI_GONGWENBAO_ITEM = DRINK_ITEMS.register   注册("guangxi_gongwenbao"   "guangxi_gongwenbao"   "guangxi_gongwenbao"   "guangxi_gongwenbao"   "guangxi_gongwenbao"   "guangxi_gongwenbao"   "guangxi_gongwenbao"   "guangxi_gongwenbao"   "guangxi_gongwenbao"   "guangxi_gongwenbao"   "guangxi_gongwenbao"   "guangxi_gongwenbao"   "guangxi_gongwenbao"   "guangxi_gongwenbao"   "guangxi_gongwenbao"   "guangxi_gongwenbao"   "guangxi_gongwenbao"；
            () -> new DrinkBlockItem(GUANGXI_GONGWENBAO.get()));（） - new   新 DrinkBlockItem(GUANGXI_GONGWENBAO.get   得到()))；

    public static void register(IEventBus modEventBus) {public   公共 static   静态 void   无效 register   注册（eventbus modEventBus）
        DRINK_BLOCKS.register   注册   注册(modEventBus);
        DRINK_ITEMS.register(modEventBus);
    }
                                       }
    
                                                                                                                                }
