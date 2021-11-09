package com.carlettos.silverfishmod.mob;

import java.util.EnumSet;
import java.util.List;
import java.util.Random;

import com.carlettos.silverfishmod.essence.EssenceChunk;
import com.carlettos.silverfishmod.essence.EssenceManager;
import com.carlettos.silverfishmod.util.Essence;
import com.carlettos.silverfishmod.util.Mineral;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.WrappedGoal;
import net.minecraft.world.entity.monster.Silverfish;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.InfestedBlock;
import net.minecraft.world.level.block.state.BlockState;

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
        List<WrappedGoal> goals = this.goalSelector.getAvailableGoals().stream().filter(goal -> goal.getPriority() == 5).toList();
        this.goalSelector.removeGoal(goals.get(0).getGoal());
        this.goalSelector.addGoal(5, new MineralSilverfish.SilverfishMergeWithStoneGoal(this));
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
        return builder.add(Attributes.MAX_HEALTH, vida).add(Attributes.MOVEMENT_SPEED, speed).add(Attributes.ATTACK_DAMAGE, atk).add(Attributes.ARMOR, def);
    }

    static class SilverfishMergeWithStoneGoal extends RandomStrollGoal {
        private Direction selectedDirection;
        private boolean doMerge;
    
        public SilverfishMergeWithStoneGoal(MineralSilverfish silverfish) {
            super(silverfish, 1.0D, 10);
            this.setFlags(EnumSet.of(Goal.Flag.MOVE));
        }
    
        public boolean canUse() {
            if (this.mob.getTarget() != null) {
                return false;
            } else if (!this.mob.getNavigation().isDone()) {
                return false;
            } else {
                Random random = this.mob.getRandom();
                if (net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(this.mob.level, this.mob) && random.nextInt(10) == 0) {
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
