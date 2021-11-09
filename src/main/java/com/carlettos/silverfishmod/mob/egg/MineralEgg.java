package com.carlettos.silverfishmod.mob.egg;

import com.carlettos.silverfishmod.util.Mineral;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.Level;

public class MineralEgg extends Mob{
    public final Mineral mineral;
    
    public MineralEgg(EntityType<? extends MineralEgg> entityType, Level level, Mineral mineral) {
        super(entityType, level);
        this.mineral = mineral;
    }
}
