package com.carlettos.silverfishmod.essence.world;

import java.util.concurrent.ConcurrentHashMap;

import com.carlettos.silverfishmod.util.Par;

public class EssenceWorld {
    private ConcurrentHashMap<Par, EssenceChunk> essenceChunks;
    
    public EssenceWorld() {
        this.essenceChunks = new ConcurrentHashMap<Par, EssenceChunk>();
    }
    
    public ConcurrentHashMap<Par, EssenceChunk> getEssenceChunks() {
        return essenceChunks;
    }
    
    public void setEssenceChunks(ConcurrentHashMap<Par, EssenceChunk> essenceChunks) {
        this.essenceChunks = essenceChunks;
    }
    
    public EssenceChunk getEssenceChunkAt(int x, int y) {
        return getEssenceChunkAt(new Par(x, y));
    }
    
    public EssenceChunk getEssenceChunkAt(Par par) {
        return essenceChunks.get(par);
    }
}
