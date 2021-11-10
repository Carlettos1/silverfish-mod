package com.carlettos.silverfishmod.block;

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
        //TODO: fuerzas
        switch (mineral.fuerza) {
        case DEBIL:
            break;
        case FUERTE:
            break;
        case SUPER_FUERTE:
            break;
        default:
            throw new IllegalArgumentException("Unexpected value: " + Mineral.getFromBlock(bloque));
        }
        Silverfish silverfish = Mineral.getFromBlock(this.bloque).getSilverfish().create(serverWorld);
        silverfish.moveTo((double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, 0.0F, 0.0F);
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
