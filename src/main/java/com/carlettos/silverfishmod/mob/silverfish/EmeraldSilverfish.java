package com.carlettos.silverfishmod.mob.silverfish;

import com.carlettos.silverfishmod.mob.MineralSilverfish;
import com.carlettos.silverfishmod.util.Mineral;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class EmeraldSilverfish extends MineralSilverfish{

    public EmeraldSilverfish(EntityType<? extends MineralSilverfish> entityType, Level world) {
        super(entityType, world, Mineral.EMERALD);
    }
}
