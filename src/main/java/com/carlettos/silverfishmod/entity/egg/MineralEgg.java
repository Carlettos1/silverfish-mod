package com.carlettos.silverfishmod.entity.egg;

import com.carlettos.silverfishmod.entity.silverfish.MineralSilverfish;
import com.carlettos.silverfishmod.util.Mineral;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Silverfish;
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
        AttributeSupplier.Builder builder = Silverfish.createAttributes().add(Attributes.FOLLOW_RANGE, 64D);
        double vida = 8d;
        double speed = 0.25d;
        double atk = 1d;
        double def = 1d;
        
        switch (mineral) {
        case COAL:
            atk += 1d;
            break;
        case DEEPSLATE_COAL:
            vida += 2d;
            atk += 1d;
            def += 1d;
            break;
        case COPPER:
            atk += 2d;
            break;
        case DEEPSLATE_COPPER:
            vida += 2d;
            atk += 2d;
            def += 1d;
            break;
        case LAPIS:
            vida += 2d;
            speed += 0.50d;
            atk += 2d;
            break;
        case DEEPSLATE_LAPIS:
            vida += 4d;
            speed += 0.50d;
            atk += 3d;
            def += 2d;
            break;
        case IRON:
            vida += 4d;
            speed += 0.25d;
            atk += 3d;
            def += 1d;
            break;
        case DEEPSLATE_IRON:
            vida += 6d;
            speed += 0.25d;
            atk += 4d;
            def += 2d;
            break;
        case GOLD:
            vida += 6d;
            speed += 0.5d;
            atk += 4d;
            def += 2d;
            break;
        case DEEPSLATE_GOLD:
            vida += 8d;
            speed += 0.5d;
            atk += 10d;
            def += 3d;
            break;
        case NETHER_GOLD:
            vida += 2d;
            speed += 0.25d;
            atk += 4d;
            def += 1d;
            break;
        case REDSTONE:
            vida += 6d;
            speed += 0.25d;
            atk += 6d;
            def += 2d;
            break;
        case DEEPSLATE_REDSTONE:
            vida += 10d;
            speed += 0.5d;
            atk += 8d;
            def += 4d;
            break;
        case DIAMOND:
            vida += 12d;
            speed += 0.5d;
            atk += 10d;
            def += 5d;
            break;
        case DEEPSLATE_DIAMOND:
            vida += 14d;
            speed += 0.75d;
            atk += 12d;
            def += 7d;
            break;
        case EMERALD:
            vida += 14d;
            speed += 0.5d;
            atk += 12d;
            def += 8d;
            break;
        case DEEPSLATE_EMERALD:
            vida += 16d;
            speed += 0.75d;
            atk += 16d;
            def += 10d;
            break;
        case QUARTZ:
            vida += 6d;
            speed += 0.25d;
            atk += 6d;
            def += 1d;
            break;
        case NETHERITE:
            vida += 20d;
            speed += 1d;
            atk += 24d;
            def += 20d;
            break;
        default:
            throw new IllegalArgumentException("Unexpected value (in MineralSilverfish::createAttributes): " + mineral);
        }
        return builder.add(Attributes.MAX_HEALTH, vida/3).add(Attributes.MOVEMENT_SPEED, speed).add(Attributes.ATTACK_DAMAGE, atk/3).add(Attributes.ARMOR, def);
    }
}
