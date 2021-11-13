package com.carlettos.silverfishmod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Material;

public class EssenceFluidBlock extends LiquidBlock{

    @SuppressWarnings("deprecation")
    public EssenceFluidBlock(FlowingFluid fluid) {
        super(fluid, BlockBehaviour.Properties.of(Material.LAVA).noCollission().strength(100).noDrops());
    }
    
    @SuppressWarnings("deprecation")
    @Override
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        entity.setDeltaMovement(entity.getDeltaMovement().multiply(0.7, 0.5, 0.7));
        super.entityInside(state, level, pos, entity);
    }
}
