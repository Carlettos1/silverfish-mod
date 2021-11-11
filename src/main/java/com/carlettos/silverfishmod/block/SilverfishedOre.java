package com.carlettos.silverfishmod.block;

import com.carlettos.silverfishmod.entity.egg.MineralEgg;
import com.carlettos.silverfishmod.util.Mineral;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.monster.Silverfish;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.InfestedBlock;
import net.minecraft.world.level.block.state.BlockState;

public class SilverfishedOre extends InfestedBlock{
    protected final Block bloque;

    public SilverfishedOre(Block block, Properties prop) {
        super(block, prop);
        bloque = block;
    }
    
    @SuppressWarnings("deprecation")
    @Override
    public void onPlace(BlockState state, Level world, BlockPos pos, BlockState blockState, boolean bool) {
        super.onPlace(state, world, pos, blockState, bool);
    }

    protected void spawnInfestation(ServerLevel serverWorld, BlockPos pos) {
        Mineral mineral = Mineral.getFromBlock(bloque);
        switch (mineral.fuerza) {
        case SUPER_FUERTE:
            spawnEggs(serverWorld, pos, 4);
            spawnSilverfish(serverWorld, pos);
        case FUERTE:
            spawnSilverfish(serverWorld, pos);
        case DEBIL:
            spawnEggs(serverWorld, pos, 4);
            break;
        default:
            throw new IllegalArgumentException("Unexpected value: " + Mineral.getFromBlock(bloque));
        }
    }
    
    private void spawnEggs(ServerLevel serverWorld, BlockPos pos, int quantity) {
        Mineral mineral = Mineral.getFromBlock(bloque);
        for (int i = 0; i < 4; i++) {
            MineralEgg egg = mineral.getSilverfishEgg().create(serverWorld);
            double x = pos.getX() + serverWorld.getRandom().nextDouble() * 0.4 + 0.3;
            double z = pos.getZ() + serverWorld.getRandom().nextDouble() * 0.4 + 0.3;
            egg.moveTo(x, pos.getY(), z, 0F, 0F);
            serverWorld.addFreshEntity(egg);
            egg.spawnAnim();
        }
    }
    
    private void spawnSilverfish(ServerLevel serverWorld, BlockPos pos) {
        Mineral mineral = Mineral.getFromBlock(bloque);
        Silverfish silverfish = mineral.getSilverfish().create(serverWorld);
        double x = pos.getX() + serverWorld.getRandom().nextDouble() * 0.4 + 0.3;
        double z = pos.getZ() + serverWorld.getRandom().nextDouble() * 0.4 + 0.3;
        silverfish.moveTo(x, pos.getY(), z, 0.0F, 0.0F);
        serverWorld.addFreshEntity(silverfish);
        silverfish.spawnAnim();
    }

    public void spawnAfterBreak(BlockState state, ServerLevel serverWorld, BlockPos pos, ItemStack stack) {
        if (serverWorld.getGameRules().getBoolean(GameRules.RULE_DOBLOCKDROPS) && EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH, stack) == 0) {
            this.spawnInfestation(serverWorld, pos);
        }
    }

    public void wasExploded(Level world, BlockPos pos, Explosion explosion) {
        if (world instanceof ServerLevel) {
            this.spawnInfestation((ServerLevel)world, pos);
        }
    }
}
