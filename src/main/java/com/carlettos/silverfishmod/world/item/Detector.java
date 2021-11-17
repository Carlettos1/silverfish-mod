package com.carlettos.silverfishmod.world.item;

import java.util.Optional;

import com.carlettos.silverfishmod.client.handler.HudHandler;
import com.carlettos.silverfishmod.connection.PacketHandler;
import com.carlettos.silverfishmod.essence.EssenceManager;
import com.carlettos.silverfishmod.essence.connection.EssencePacket;
import com.carlettos.silverfishmod.world.inventory.TextTooltip;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Style;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.tooltip.TooltipComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class Detector extends Item{

    public Detector(Properties prop) {
        super(prop);
    }
    
    @Override
    public void inventoryTick(ItemStack stack, Level world, Entity entity, int slot, boolean selected) {
        if(world.isClientSide && entity instanceof Player && (selected || ((Player)entity).getOffhandItem().getItem() instanceof Detector)) {
            if(entity.tickCount % 20 == 0) {
                this.updateEssence(world, (Player)entity);
            }
        }
        if(selected && !world.isClientSide && entity.tickCount % 20 == 0) {
            //TODO: server things
        }
    }
    
    public void updateEssence(Level level, Player player) {
        PacketHandler.INSTANCE.sendToServer(new EssencePacket(EssenceManager.getSafeEssenceChunk(level.dimensionType(), player.chunkPosition(), level.getRandom())));
    }
    
    @Override
    public Optional<TooltipComponent> getTooltipImage(ItemStack p_150902_) {
        return Optional.of(new TextTooltip("Last Essence Recorded: " + HudHandler.currentChunk.getTotalEssence(), Style.EMPTY.withColor(ChatFormatting.DARK_PURPLE).withItalic(true)));
    }
}
