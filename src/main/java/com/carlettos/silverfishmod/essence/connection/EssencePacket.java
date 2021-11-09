package com.carlettos.silverfishmod.essence.connection;

import com.carlettos.silverfishmod.essence.EssenceChunk;
import com.carlettos.silverfishmod.essence.util.EssenceLevel;

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
