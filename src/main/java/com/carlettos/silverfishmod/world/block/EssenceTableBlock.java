package com.carlettos.silverfishmod.world.block;

import com.carlettos.silverfishmod.world.inventory.EssenceMenu;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class EssenceTableBlock extends Block {
    private static final Component CONTAINER_TITLE = new TranslatableComponent("container.essence");
    
    public EssenceTableBlock(Properties properties) {
        super(properties);
    }
    
    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
        if(level.isClientSide) {
            return InteractionResult.SUCCESS;
        } else {
            player.openMenu(state.getMenuProvider(level, pos));
            //TODO: award stat es necesario?
            //player.awardStat(ListaStats.INTERACT_WITH_ESSENCE_TABLE);
            return InteractionResult.CONSUME;
        }
    }
    
    @Override
    public MenuProvider getMenuProvider(BlockState state, Level level, BlockPos pos) {
        return new SimpleMenuProvider((id, inventory, player) -> {
            return new EssenceMenu(id, inventory, ContainerLevelAccess.create(level, pos));
        }, CONTAINER_TITLE);
    }
}
