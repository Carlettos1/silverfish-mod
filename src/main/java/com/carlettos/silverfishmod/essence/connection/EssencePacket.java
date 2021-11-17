package com.carlettos.silverfishmod.essence.connection;

import com.carlettos.silverfishmod.essence.util.EssenceLevel;
import com.carlettos.silverfishmod.essence.world.EssenceChunk;

public class EssencePacket{
    public EssenceLevel essences;
    
    public EssencePacket() {
    }
    
    public EssencePacket(EssenceChunk chunk) {
        this.essences = chunk.getEssencesCopy();
    }
    
    public EssencePacket(EssenceLevel escencias) {
        this.essences = escencias;
    }
}
