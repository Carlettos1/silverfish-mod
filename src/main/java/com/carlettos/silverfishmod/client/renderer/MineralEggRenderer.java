package com.carlettos.silverfishmod.client.renderer;

import com.carlettos.silverfishmod.client.model.MineralEggModel;
import com.carlettos.silverfishmod.util.Util;
import com.carlettos.silverfishmod.world.entity.MineralEgg;

import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class MineralEggRenderer extends MobRenderer<MineralEgg, MineralEggModel>{
    private static final ResourceLocation MINERAL_SILVERFISH_EGG_TEXTURE = Util.getResLoc("textures/entity/mineral_silverfish_egg.png");
    private static final ResourceLocation COAL_SILVERFISH_EGG_TEXTURE = Util.getResLoc("textures/entity/coal_silverfish_egg.png");
    private static final ResourceLocation DEEPSLATE_COAL_SILVERFISH_EGG_TEXTURE = Util.getResLoc("textures/entity/deepslate_coal_silverfish_egg.png");
    private static final ResourceLocation COPPER_SILVERFISH_EGG_TEXTURE = Util.getResLoc("textures/entity/copper_silverfish_egg.png");
    private static final ResourceLocation DEEPSLATE_COPPER_SILVERFISH_EGG_TEXTURE = Util.getResLoc("textures/entity/deepslate_copper_silverfish_egg.png");
    private static final ResourceLocation LAPIS_SILVERFISH_EGG_TEXTURE = Util.getResLoc("textures/entity/lapis_silverfish_egg.png");
    private static final ResourceLocation DEEPSLATE_LAPIS_SILVERFISH_EGG_TEXTURE = Util.getResLoc("textures/entity/deepslate_lapis_silverfish_egg.png");
    private static final ResourceLocation IRON_SILVERFISH_EGG_TEXTURE = Util.getResLoc("textures/entity/iron_silverfish_egg.png");
    private static final ResourceLocation DEEPSLATE_IRON_SILVERFISH_EGG_TEXTURE = Util.getResLoc("textures/entity/deepslate_iron_silverfish_egg.png");
    private static final ResourceLocation GOLD_SILVERFISH_EGG_TEXTURE = Util.getResLoc("textures/entity/gold_silverfish_egg.png");
    private static final ResourceLocation DEEPSLATE_GOLD_SILVERFISH_EGG_TEXTURE = Util.getResLoc("textures/entity/deepslate_gold_silverfish_egg.png");
    private static final ResourceLocation NETHER_GOLD_SILVERFISH_EGG_TEXTURE = Util.getResLoc("textures/entity/nether_gold_silverfish_egg.png");
    private static final ResourceLocation REDSTONE_SILVERFISH_EGG_TEXTURE = Util.getResLoc("textures/entity/redstone_silverfish_egg.png");
    private static final ResourceLocation DEEPSLATE_REDSTONE_SILVERFISH_EGG_TEXTURE = Util.getResLoc("textures/entity/deepslate_redstone_silverfish_egg.png");
    private static final ResourceLocation DIAMOND_SILVERFISH_EGG_TEXTURE = Util.getResLoc("textures/entity/diamond_silverfish_egg.png");
    private static final ResourceLocation DEEPSLATE_DIAMOND_SILVERFISH_EGG_TEXTURE = Util.getResLoc("textures/entity/deepslate_diamond_silverfish_egg.png");
    private static final ResourceLocation EMERALD_SILVERFISH_EGG_TEXTURE = Util.getResLoc("textures/entity/emerald_silverfish_egg.png");
    private static final ResourceLocation DEEPSLATE_EMERALD_SILVERFISH_EGG_TEXTURE = Util.getResLoc("textures/entity/deepslate_emerald_silverfish_egg.png");
    private static final ResourceLocation QUARTZ_SILVERFISH_EGG_TEXTURE = Util.getResLoc("textures/entity/quartz_silverfish_egg.png");
    private static final ResourceLocation NETHERITE_EMERALD_SILVERFISH_EGG_TEXTURE = Util.getResLoc("textures/entity/netherite_silverfish_egg.png");

    public MineralEggRenderer(Context context) {
        super(context, new MineralEggModel(context.bakeLayer(MineralEggModel.LAYER_LOCATION)), 0.2F);
    }

    @Override
    public ResourceLocation getTextureLocation(MineralEgg egg) {
        switch (egg.mineral){
        case COAL:
            return COAL_SILVERFISH_EGG_TEXTURE;
        case DEEPSLATE_COAL:
            return DEEPSLATE_COAL_SILVERFISH_EGG_TEXTURE;
        case COPPER:
            return COPPER_SILVERFISH_EGG_TEXTURE;
        case DEEPSLATE_COPPER:
            return DEEPSLATE_COPPER_SILVERFISH_EGG_TEXTURE;
        case LAPIS:
            return LAPIS_SILVERFISH_EGG_TEXTURE;
        case DEEPSLATE_LAPIS:
            return DEEPSLATE_LAPIS_SILVERFISH_EGG_TEXTURE;
        case IRON:
            return IRON_SILVERFISH_EGG_TEXTURE;
        case DEEPSLATE_IRON:
            return DEEPSLATE_IRON_SILVERFISH_EGG_TEXTURE;
        case GOLD:
            return GOLD_SILVERFISH_EGG_TEXTURE;
        case DEEPSLATE_GOLD:
            return DEEPSLATE_GOLD_SILVERFISH_EGG_TEXTURE;
        case NETHER_GOLD:
            return NETHER_GOLD_SILVERFISH_EGG_TEXTURE;
        case REDSTONE:
            return REDSTONE_SILVERFISH_EGG_TEXTURE;
        case DEEPSLATE_REDSTONE:
            return DEEPSLATE_REDSTONE_SILVERFISH_EGG_TEXTURE;
        case DIAMOND:
            return DIAMOND_SILVERFISH_EGG_TEXTURE;
        case DEEPSLATE_DIAMOND:
            return DEEPSLATE_DIAMOND_SILVERFISH_EGG_TEXTURE;
        case EMERALD:
            return EMERALD_SILVERFISH_EGG_TEXTURE;
        case DEEPSLATE_EMERALD:
            return DEEPSLATE_EMERALD_SILVERFISH_EGG_TEXTURE;
        case QUARTZ:
            return QUARTZ_SILVERFISH_EGG_TEXTURE;
        case NETHERITE:
            return NETHERITE_EMERALD_SILVERFISH_EGG_TEXTURE;
        default:
            return MINERAL_SILVERFISH_EGG_TEXTURE;
        }
    }

}
