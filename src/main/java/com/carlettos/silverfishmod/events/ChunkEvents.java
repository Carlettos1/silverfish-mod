package com.carlettos.silverfishmod.events;

import com.carlettos.silverfishmod.essence.EssenceChunk;
import com.carlettos.silverfishmod.essence.EssenceManager;
import com.carlettos.silverfishmod.essence.util.EssenceLevel;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.chunk.ChunkStatus.ChunkType;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraftforge.event.world.ChunkDataEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ChunkEvents {
    @SubscribeEvent
    public static void onWorldSave(WorldEvent.Unload event) {
        EssenceManager.removeEssenceWorld(event.getWorld().dimensionType());
    }
    
    @SubscribeEvent //escribir
    public static void onDataSave(ChunkDataEvent.Save event) {
        DimensionType dim = event.getWorld().dimensionType();
        EssenceChunk chunk = EssenceManager.getEssenceChunk(dim, event.getChunk().getPos());
        CompoundTag silverfishmod = new CompoundTag();
        
        CompoundTag escencias = new CompoundTag();
        if(chunk == null) {
            EssenceManager.createEssenceChunk(dim, event.getChunk().getPos(), event.getWorld().getRandom());
            chunk = EssenceManager.getEssenceChunk(dim, event.getChunk().getPos());
        }
        escencias.putFloat("Coal", chunk.getCoal());
        escencias.putFloat("Copper", chunk.getCopper());
        escencias.putFloat("Lapis", chunk.getLapis());
        escencias.putFloat("Iron", chunk.getIron());
        escencias.putFloat("Gold", chunk.getGold());
        escencias.putFloat("Redstone", chunk.getRedstone());
        escencias.putFloat("Diamond", chunk.getDiamond());
        escencias.putFloat("Emerald", chunk.getEmerald());
        escencias.putFloat("Quartz", chunk.getQuartz());
        escencias.putFloat("Netherita", chunk.getNetherita());
        
        silverfishmod.put("Escencias", escencias);
        event.getData().put("SilverFishMod", silverfishmod);
    }
    
    // DataLoad se hace antes de cargar los chunks
    @SubscribeEvent //leer
    public static void onDataLoad(ChunkDataEvent.Load event) {
        if(event.getStatus() == ChunkType.LEVELCHUNK) {
            DimensionType dim = event.getWorld().dimensionType();
            CompoundTag silverfishmod = event.getData().getCompound("SilverFishMod");
            CompoundTag escencias = silverfishmod.getCompound("Escencias");
            
            if(escencias.contains("Coal")) {
                EssenceManager.addEssenceChunk(dim, event.getChunk().getPos(), new EssenceLevel(
                        escencias.getFloat("Coal"), 
                        escencias.getFloat("Copper"), 
                        escencias.getFloat("Lapis"), 
                        escencias.getFloat("Iron"), 
                        escencias.getFloat("Gold"), 
                        escencias.getFloat("Redstone"), 
                        escencias.getFloat("Diamond"), 
                        escencias.getFloat("Emerald"), 
                        escencias.getFloat("Quartz"), 
                        escencias.getFloat("Netherita")));
            } else {
                if(EssenceManager.getEssenceChunk(dim, event.getChunk().getPos()) == null) {
                    EssenceManager.createEssenceChunk(dim, event.getChunk().getPos(), event.getWorld().getRandom());
                }
            }
        }
    }
}
