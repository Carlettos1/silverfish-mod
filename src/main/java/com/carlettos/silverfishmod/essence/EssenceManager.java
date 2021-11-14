package com.carlettos.silverfishmod.essence;

import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.carlettos.silverfishmod.essence.util.EssenceLevel;
import com.carlettos.silverfishmod.essence.world.EssenceChunk;
import com.carlettos.silverfishmod.essence.world.EssenceWorld;
import com.carlettos.silverfishmod.util.Par;
import com.carlettos.silverfishmod.util.Util;

import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.dimension.DimensionType;

public class EssenceManager {
    public static ConcurrentHashMap<DimensionType, EssenceWorld> dimensiones = new ConcurrentHashMap<>();
    
    public static EssenceWorld getEssenceWorld(DimensionType dim) {
        if(!dimensiones.containsKey(dim)) {
            createEssenceWorld(dim);
        }
        return dimensiones.get(dim);
    }
    
    public static void createEssenceWorld(DimensionType dim) {
        if(!dimensiones.containsKey(dim)) {
            dimensiones.put(dim, new EssenceWorld());
            Util.log("EssenceWorld created for: " + dim);
        }
    }
    
    public static void removeEssenceWorld(DimensionType dim) {
        if(dimensiones.containsKey(dim)) {
            dimensiones.remove(dim);
            Util.log("EssenceWorld removed for: " + dim);
        }
    }
    
    public static void removeEssenceChunk(DimensionType dim, ChunkPos pos) {
        dimensiones.get(dim).getEssenceChunks().remove(Par.fromChunkPos(pos));
    }
    
    public static void createEssenceChunk(DimensionType dim, ChunkPos pos, Random rand) {
        addEssenceChunk(dim, pos, new EssenceLevel(rand));
    }
    
    public static void addEssenceChunk(DimensionType dim, ChunkPos pos, EssenceLevel escencias) {
        getEssenceWorld(dim).getEssenceChunks().put(Par.fromChunkPos(pos), new EssenceChunk(pos, escencias));
    }
    
    @Nullable
    public static EssenceChunk getEssenceChunk(DimensionType dim, ChunkPos pos) {
        return getEssenceWorld(dim).getEssenceChunkAt(Par.fromChunkPos(pos));
    }
    
    @Nonnull
    public static EssenceChunk getSafeEssenceChunk(DimensionType dim, ChunkPos pos, Random rand) {
        EssenceChunk chunk = getEssenceChunk(dim, pos);
        if(chunk == null) {
            createEssenceChunk(dim, pos, rand);
            chunk = getEssenceChunk(dim, pos);
        }
        return chunk;
    }
    
    public static float getTotalEssence(DimensionType dim, ChunkPos pos) {
        return getEssenceChunk(dim, pos).getEscenciaTotal();
    }
}
