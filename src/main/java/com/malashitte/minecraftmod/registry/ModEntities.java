package com.malashitte.minecraftmod.registry;

import com.malashitte.minecraftmod.MinecraftMod;
import com.malashitte.minecraftmod.entity.FriendEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MinecraftMod.MOD_ID);

    public static final RegistryObject<EntityType<FriendEntity>> FRIEND = ENTITY_TYPES.register("friend",
            () -> EntityType.Builder.of(FriendEntity::new, MobCategory.CREATURE)
                    .sized(0.6F, 1.8F)
                    .build(MinecraftMod.MOD_ID + ":friend"));

    private ModEntities() {}
}
