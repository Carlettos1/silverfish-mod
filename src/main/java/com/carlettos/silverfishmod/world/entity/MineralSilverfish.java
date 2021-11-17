package com.carlettos.silverfishmod.world.entity;

import java.util.EnumSet;
import java.util.List;
import java.util.Random;

import com.carlettos.silverfishmod.essence.EssenceManager;
import com.carlettos.silverfishmod.essence.util.ConditionEffect;
import com.carlettos.silverfishmod.util.Essence;
import com.carlettos.silverfishmod.util.Mineral;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.WrappedGoal;
import net.minecraft.world.entity.monster.Silverfish;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.InfestedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.ForgeEventFactory;

public class MineralSilverfish extends Silverfish{
    public final Mineral mineral;

    public MineralSilverfish(EntityType<? extends MineralSilverfish> entityType, Level world, Mineral mineral) {
        super(entityType, world);
        this.mineral = mineral;
    }
    
    @Override
    public void die(DamageSource damageSource) {
        if (!this.isRemoved() && !this.dead) {
            EssenceManager.addRandomEssence(level, this.chunkPosition(), this.blockPosition(), Essence.getEssenceFromMineral(mineral), random, mineral.contenido, ConditionEffect.ESSENCE_ACTIVATION_CREATE_FLUIDS_CHECK.apply(this.level, this));
        }
        super.die(damageSource);
    }
    
    @Override
    protected void registerGoals() {
        super.registerGoals();
        List<WrappedGoal> goals = this.goalSelector.getAvailableGoals().stream().filter(goal -> goal.getPriority() == 5).toList();
        this.goalSelector.removeGoal(goals.get(0).getGoal());
        this.goalSelector.addGoal(5, new MineralSilverfish.SilverfishMergeWithStoneGoal(this));
    }

    public static AttributeSupplier.Builder createAttributes(Mineral mineral){
        AttributeSupplier.Builder builder = Silverfish.createAttributes().add(Attributes.FOLLOW_RANGE, 64D);
        //31 el warden, 20 el enderman, 1 el silverfish
        double vida = 8d; //40
        double speed = 0.25d; // 0.3
        double atk = 1d; //7
        double def = 0d; //0
        //TODO: atributos correctos
        switch (mineral) {
        case COAL:
            vida = 4d;
            speed = 0.25d;
            atk = 1d;
            def = 0d;
            break;
        case DEEPSLATE_COAL:
            vida = 8d;
            speed = 0.25d;
            atk = 1d;
            def = 1d;
            break;
        case COPPER:
            vida = 6d;
            speed = 0.25d;
            atk = 1d;
            def = 0d;
            break;
        case DEEPSLATE_COPPER:
            vida = 10d;
            speed = 0.25d;
            atk = 1d;
            def = 1d;
            break;
        case LAPIS:
            vida = 8d;
            speed = 0.25d;
            atk = 2d;
            def = 1d;
            break;
        case DEEPSLATE_LAPIS:
            vida = 10d;
            speed = 0.25d;
            atk = 2d;
            def = 2d;
            break;
        case IRON:
            vida = 8d;
            speed = 0.25d;
            atk = 2d;
            def = 0d;
            break;
        case DEEPSLATE_IRON:
            vida = 10d;
            speed = 0.35d;
            atk = 2d;
            def = 2d;
            break;
        case GOLD:
            vida = 8d;
            speed = 0.5d;
            atk = 2d;
            def = 0d;
            break;
        case DEEPSLATE_GOLD:
            vida = 10d;
            speed = 0.5d;
            atk = 2d;
            def = 1d;
            break;
        case NETHER_GOLD:
            vida = 6d;
            speed = 0.5d;
            atk = 1d;
            def = 0d;
            break;
        case REDSTONE:
            vida = 10d;
            speed = 0.25d;
            atk = 4d;
            def = 0d;
            break;
        case DEEPSLATE_REDSTONE:
            vida = 12d;
            speed = 0.35d;
            atk = 5d;
            def = 1d;
            break;
        case DIAMOND:
            vida = 12d;
            speed = 0.35d;
            atk = 6d;
            def = 0d;
            break;
        case DEEPSLATE_DIAMOND:
            vida = 16d;
            speed = 0.35d;
            atk = 8d;
            def = 2d;
            break;
        case EMERALD:
            vida = 12d;
            speed = 0.35d;
            atk = 6d;
            def = 1d;
            break;
        case DEEPSLATE_EMERALD:
            vida = 16d;
            speed = 0.35d;
            atk = 8d;
            def = 2d;
            break;
        case QUARTZ:
            vida = 6d;
            speed = 0.25d;
            atk = 1d;
            def = 0d;
            break;
        case NETHERITE:
            vida = 20d;
            speed = 0.35d;
            atk = 10d;
            def = 4d;
            break;
        default:
            throw new IllegalArgumentException("Unexpected value (in MineralSilverfish::createAttributes): " + mineral);
        }
        return builder.add(Attributes.MAX_HEALTH, vida).add(Attributes.MOVEMENT_SPEED, speed).add(Attributes.ATTACK_DAMAGE, atk).add(Attributes.ARMOR, def);
    }

    static class SilverfishMergeWithStoneGoal extends RandomStrollGoal {
        private Direction selectedDirection;
        private boolean doMerge;
        private int time;
    
        public SilverfishMergeWithStoneGoal(MineralSilverfish silverfish) {
            super(silverfish, 1.0D, 10);
            this.setFlags(EnumSet.of(Goal.Flag.MOVE));
            this.time = 0;
        }
        
        @Override
        public void stop() {
            this.time = 0;
            super.stop();
        }
    
        public boolean canUse() {
            if(++this.time < 38) {
                return false;
            } else if (this.mob.getTarget() != null) {
                return false;
            } else if (!this.mob.getNavigation().isDone()) {
                return false;
            } else {
                Random random = this.mob.getRandom();
                if (ForgeEventFactory.getMobGriefingEvent(this.mob.level, this.mob) && random.nextInt(10) == 0) {
                    this.selectedDirection = Direction.getRandom(random);
                    BlockPos blockpos = (new BlockPos(this.mob.getX(), this.mob.getY() + 0.5D, this.mob.getZ())).relative(this.selectedDirection);
                    BlockState blockstate = this.mob.level.getBlockState(blockpos);
                    if (InfestedBlock.isCompatibleHostBlock(blockstate)) {
                        this.doMerge = true;
                        return true;
                    }
                }
    
                this.doMerge = false;
                return super.canUse();
            }
        }
    
        public boolean canContinueToUse() {
            return this.doMerge ? false : super.canContinueToUse();
        }
    
        public void start() {
            if (!this.doMerge) {
                super.start();
            } else {
                LevelAccessor levelaccessor = this.mob.level;
                BlockPos blockpos = (new BlockPos(this.mob.getX(), this.mob.getY() + 0.5D, this.mob.getZ())).relative(this.selectedDirection);
                BlockState blockstate = levelaccessor.getBlockState(blockpos);
                if (InfestedBlock.isCompatibleHostBlock(blockstate)) {
                    levelaccessor.setBlock(blockpos, ((MineralSilverfish)this.mob).mineral.getInfestedBlock().defaultBlockState(), 3);
                    this.mob.spawnAnim();
                    this.mob.discard();
                }
            }
        }
    }
}
