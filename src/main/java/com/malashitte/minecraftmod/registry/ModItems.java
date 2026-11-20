package com.malashitte.minecraftmod.registry;

import com.malashitte.minecraftmod.MinecraftMod;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MinecraftMod.MOD_ID);

    public static final RegistryObject<Item> FRIEND_SPAWN_EGG = ITEMS.register("friend_spawn_egg",
            () -> new SpawnEggItem(ModEntities.FRIEND, 0x8B6B4A, 0xD6B38A, new Item.Properties()));

    private ModItems() {}

    @Mod.EventBusSubscriber(modid = MinecraftMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static final class CreativeTabEvents {
        private CreativeTabEvents() {}

        @SubscribeEvent
        public static void addToCreativeTab(BuildCreativeModeTabContentsEvent event) {
            if (event.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
                event.accept(FRIEND_SPAWN_EGG);
            }
        }
    }
}
