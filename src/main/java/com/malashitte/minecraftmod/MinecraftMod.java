package com.malashitte.minecraftmod;

import com.malashitte.minecraftmod.entity.FriendEntity;
import com.malashitte.minecraftmod.registry.ModEntities;
import com.malashitte.minecraftmod.registry.ModItems;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MinecraftMod.MOD_ID)
public class MinecraftMod {
    public static final String MOD_ID = "minecraftmod";

    public MinecraftMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModEntities.ENTITY_TYPES.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        modEventBus.addListener(this::createEntityAttributes);
    }

    private void createEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.FRIEND.get(), FriendEntity.createAttributes().build());
    }
}
