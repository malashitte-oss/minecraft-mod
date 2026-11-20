package com.malashitte.minecraftmod.client.renderer;

import com.malashitte.minecraftmod.MinecraftMod;
import com.malashitte.minecraftmod.entity.FriendEntity;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class FriendRenderer extends MobRenderer<FriendEntity, PlayerModel<FriendEntity>> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(MinecraftMod.MOD_ID, "textures/entity/friend.png");

    public FriendRenderer(EntityRendererProvider.Context context) {
        super(context, new PlayerModel<>(context.bakeLayer(ModelLayers.PLAYER), false), 0.5F);
    }

    @Override
    public ResourceLocation getTextureLocation(FriendEntity entity) {
        return TEXTURE;
    }
}
