package com.carlettos.silverfishmod.mob;

import com.carlettos.silverfishmod.essence.EssenceChunk;
import com.carlettos.silverfishmod.essence.EssenceManager;
import com.carlettos.silverfishmod.util.Essence;
import com.carlettos.silverfishmod.util.Mineral;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.monster.Silverfish;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.Level;

public class MineralSilverfish extends Silverfish{
    public final Mineral mineral;

    public MineralSilverfish(EntityType<? extends MineralSilverfish> entityType, Level world, Mineral mineral) {
        super(entityType, world);
        this.mineral = mineral;
    }
    
    @Override
    public void die(DamageSource damageSource) {
        if (!this.isRemoved() && !this.dead) {
            ChunkPos pos = this.level.getChunk(this.getOnPos()).getPos();
            EssenceChunk chunk = EssenceManager.getSafeEssenceChunk(this.level.dimensionType(), pos, this.level.getRandom());
            chunk.addRandomToEssence(this.mineral, this.random, this.level.getDifficulty());
            if (chunk.activo && this.level instanceof ServerLevel) {
                this.level.setBlock(this.getOnPos().above(), Essence.getEssenceFromMineral(this.mineral).getFluidBlockFromMineral().defaultBlockState(), 11);
            }
        }
        super.die(damageSource);
    }
    
    @Override
    protected void registerGoals() {
        super.registerGoals();
    }
    
    public static AttributeSupplier.Builder createAttributes(){
        return Silverfish.createAttributes();
    }
}
