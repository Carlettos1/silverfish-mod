package com.carlettos.silverfishmod.world.item;

import com.carlettos.silverfishmod.util.Util;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.InfestedBlock;
import net.minecraft.world.level.block.state.BlockState;

public class SilverfishAwakener extends Item{
    public static final int RADIO = 10;

    public SilverfishAwakener() {
        super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC).durability(1000).tab(Util.GRUPO));
    }
    
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        for (int x = -RADIO; x <= RADIO; x++) {
            for (int y = -RADIO; y <= RADIO; y++) {
                for (int z = -RADIO; z <= RADIO; z++) {
                    if(x*x + y*y + z*z <= RADIO * RADIO) {
                        BlockPos pos = player.blockPosition().offset(x, y, z);
                        BlockState blockstate = level.getBlockState(pos);
                        if(blockstate.getBlock() instanceof InfestedBlock) {
                            ((InfestedBlock)blockstate.getBlock()).playerDestroy(level, player, pos, blockstate, null, player.getItemInHand(hand));
                            level.setBlock(pos, Blocks.AIR.defaultBlockState(), 0);
                        }
                    }
                }
            }
        }
        return InteractionResultHolder.success(player.getItemInHand(hand));
    }
}
