package com.carlettos.silverfishmod.world.entity;

import com.carlettos.silverfishmod.util.Mineral;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;

public class MineralEgg extends Mob{
    public final Mineral mineral;
    private int waiting = 0;
    public final int maxTime;
    
    public MineralEgg(EntityType<? extends MineralEgg> entityType, Level level, Mineral mineral) {
        super(entityType, level);
        this.mineral = mineral;
        this.maxTime = this.getRandom().nextInt(120) + 60;
    }
    
    @Override
    public void tick() {
        super.tick();
        if (!this.level.isClientSide) {
            if(++this.waiting >= this.maxTime) {
                MineralSilverfish silverfish = this.mineral.getSilverfish().create(this.level);
                silverfish.moveTo(this.getX(), this.getY(), this.getZ(), this.getXRot(), this.getYRot());
                this.level.addFreshEntity(silverfish);
                this.remove(RemovalReason.DISCARDED);
            }
        }
    }
    
    

    public static AttributeSupplier.Builder createAttributes(Mineral mineral){
        return MineralSilverfish.createAttributes(mineral).add(Attributes.ARMOR, 0);
    }
}
