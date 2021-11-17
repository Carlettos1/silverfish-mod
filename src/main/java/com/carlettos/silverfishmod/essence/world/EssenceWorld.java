package com.carlettos.silverfishmod.essence.world;

import java.util.concurrent.ConcurrentHashMap;

import com.carlettos.silverfishmod.util.ParInt;

public class EssenceWorld {
    private ConcurrentHashMap<ParInt, EssenceChunk> essenceChunks;
    
    public EssenceWorld() {
        this.essenceChunks = new ConcurrentHashMap<ParInt, EssenceChunk>();
    }
    
    public ConcurrentHashMap<ParInt, EssenceChunk> getEssenceChunks() {
        return essenceChunks;
    }
    
    public void setEssenceChunks(ConcurrentHashMap<ParInt, EssenceChunk> essenceChunks) {
        this.essenceChunks = essenceChunks;
    }
    
    public EssenceChunk getEssenceChunkAt(int x, int y) {
        return getEssenceChunkAt(new ParInt(x, y));
    }
    
    public EssenceChunk getEssenceChunkAt(ParInt par) {
        return essenceChunks.get(par);
    }
}
