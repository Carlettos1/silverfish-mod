package com.carlettos.silverfishmod.essence.util;

import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.carlettos.silverfishmod.essence.EssenceManager;
import com.carlettos.silverfishmod.essence.world.EssenceChunk;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

public class ConditionEffect {
    public static final ConditionEffect CHECK_TRUE = new ConditionEffect(true, () -> {});
    public static final ConditionEffect CHECK_FALSE = new ConditionEffect(false, () -> {});
    private static final Function<Boolean, BiFunction<Level, Entity, ConditionEffect>> ESSENCE_ACTIVATION_CREATE_FLUIDS = (bool) -> {
        return (level, entity) -> {
            return new ConditionEffect(bool, () -> {
                EssenceChunk chunk = EssenceManager.getEssenceChunk(level.dimensionType(), entity.chunkPosition());
                chunk.essenceActivation.forEach(essence -> {
                    ConditionEffect.setBlockInAir(level, entity, essence.getFluidBlock());
                });
                chunk.essenceActivation.clear();
            });
        
        };
    };
    
    public static final BiFunction<Level, Entity, ConditionEffect> ESSENCE_ACTIVATION_CREATE_FLUIDS_CHECK = ESSENCE_ACTIVATION_CREATE_FLUIDS.apply(true);
    public static final BiFunction<Level, Entity, ConditionEffect> ESSENCE_ACTIVATION_CREATE_FLUIDS_NO_CHECK = ESSENCE_ACTIVATION_CREATE_FLUIDS.apply(false);
    
    public final boolean check;
    public final Condition condition;
    public final Effect effect;
    
    public ConditionEffect(boolean check, @Nullable Condition condition, Effect effect) {
        this.check = check;
        this.condition = condition == null ? () -> true : condition;
        this.effect = effect;
    }
    
    public ConditionEffect(boolean check, Effect effect) {
        this(check, null, effect);
    }
    
    public void runEffects() {
        if(this.condition.test()) {
            this.effect.affect();
        }
    }
    
    public static final void setBlockInAir(Level level, Entity entity, Block block) {
        BlockPos position = entity.blockPosition();
        Random random = new Random();
        //lo intentará sólo 100 veces
        for (int i = 0; i < 100; i++) {
            if (level.getBlockState(position).isAir()) {
                level.setBlock(position, block.defaultBlockState(), 11);
                break;
            }
            position = position.offset(random.nextInt(3) - 1, random.nextInt(3) - 1, random.nextInt(3) - 1);
        }
    }

    @FunctionalInterface
    public static interface Condition {
        public boolean test();
    }
    
    @FunctionalInterface
    public static interface Effect {
        public void affect();
    }
}
