package com.au.cobblemontavern;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(CobblemonTavern.MODID)
public class CobblemonTavern {
    public static final String MODID = "cobblemontavern";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CobblemonTavern(IEventBus modEventBus, ModContainer modContainer) {
        CobblemonTavernRegistries.register(modEventBus);
        LOGGER.info("CobblemonTavern 模组初始化完成");
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }
}
