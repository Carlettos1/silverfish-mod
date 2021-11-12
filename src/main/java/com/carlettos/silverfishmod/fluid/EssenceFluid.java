package com.carlettos.silverfishmod.fluid;

import com.carlettos.silverfishmod.util.Essence;
import com.carlettos.silverfishmod.util.Util;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraftforge.fluids.FluidAttributes;

public abstract class EssenceFluid extends FlowingFluid{
    public static final Tag.Named<Fluid> MINERAL = FluidTags.bind(Util.MOD_ID + ":mineral");
    public final Essence essence;
    
    public EssenceFluid(Essence essence) {
        this.essence = essence;
    }
    
    @Override
    protected FluidAttributes createAttributes() {
        String nombre = this.essence.name().toLowerCase();
        return FluidAttributes.builder(
                Util.getResLoc("block/" + nombre + "_still"),
                Util.getResLoc("block/" + nombre + "_flow"))
                .overlay(Util.getResLoc("block/" + nombre + "_overlay"))
                .translationKey("block.silverfishmod." + nombre)
                .density(3000).viscosity(6000).temperature(1300)
                .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY)
                .build(this);
    }
    
    @Override
    public Fluid getSource() {
        return this.essence.getFluidSource();
    }
    
    @Override
    public Fluid getFlowing() {
        return this.essence.getFluidFlowing();
    }
    
    @Override
    public Item getBucket() {
        return this.essence.getFluidBucket();
    }
    
    @Override
    protected BlockState createLegacyBlock(FluidState state) {
        return this.essence.getFluidBlockFromMineral().defaultBlockState().setValue(LiquidBlock.LEVEL, Integer.valueOf(getLegacyLevel(state)));
    }

    @Override
    protected boolean canConvertToSource() {
        return false;
    }

    @Override
    protected void beforeDestroyingBlock(LevelAccessor level, BlockPos pos, BlockState state) {
        BlockEntity blockentity = state.hasBlockEntity() ? level.getBlockEntity(pos) : null;
        Block.dropResources(state, level, pos, blockentity);
    }

    @Override
    protected int getSlopeFindDistance(LevelReader level) {
        return 4;
    }

    @Override
    protected int getDropOff(LevelReader level) {
        return 1;
    }
    
    @Override
    public int getTickDelay(LevelReader level) {
        return 20;
    }
    
    @Override
    public boolean isSame(Fluid fluid) {
        return fluid.equals(this.getSource()) || fluid.equals(this.getFlowing());
    }
    
    @Override
    protected boolean canBeReplacedWith(FluidState state, BlockGetter level, BlockPos pos, Fluid fluid, Direction direction) {
        return false;
    }
    
    @Override
    protected float getExplosionResistance() {
        return 100F;
    }
    
    @Override
    public String toString() {
        return this.getClass().toString() + " : " + essence.name() + ", Source: " + this.isSource(this.defaultFluidState());
    }
    
    public static final class Flowing extends EssenceFluid{
        public Flowing(Essence essence) {
            super(essence);
            registerDefaultState(getStateDefinition().any().setValue(LEVEL, 7));
        }

        @Override
        protected void createFluidStateDefinition(Builder<Fluid, FluidState> builder) {
            super.createFluidStateDefinition(builder);
            builder.add(LEVEL);
        }
        
        @Override
        public int getAmount(FluidState state) {
            return state.getValue(LEVEL);
        }

        @Override
        public boolean isSource(FluidState state) {
            return false;
        }
    }
    
    public static final class Source extends EssenceFluid{
        public Source(Essence essence) {
            super(essence);
        }

        @Override
        public int getAmount(FluidState state) {
            return 8;
        }

        @Override
        public boolean isSource(FluidState state) {
            return true;
        }
    }
}
