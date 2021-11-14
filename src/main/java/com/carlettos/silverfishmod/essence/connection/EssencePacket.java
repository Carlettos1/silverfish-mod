package com.carlettos.silverfishmod.essence.connection;

import com.carlettos.silverfishmod.essence.util.EssenceLevel;
import com.carlettos.silverfishmod.essence.world.EssenceChunk;

public class EssencePacket{
    public EssenceLevel escencias;
    
    public EssencePacket() {
    }
    
    public EssencePacket(EssenceChunk chunk) {
        this.escencias = chunk.getEscenciasCopy();
    }
    
    public EssencePacket(EssenceLevel escencias) {
        this.escencias = escencias;
    }
}
