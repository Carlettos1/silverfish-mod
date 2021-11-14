package com.carlettos.silverfishmod.essence.world;

import static com.carlettos.silverfishmod.essence.util.EssenceLevel.MAX_LEVEL;
import static com.carlettos.silverfishmod.util.Essence.*;

import java.util.Random;

import com.carlettos.silverfishmod.essence.util.EssenceLevel;
import com.carlettos.silverfishmod.util.Essence;
import com.carlettos.silverfishmod.util.Mineral;

import net.minecraft.world.Difficulty;
import net.minecraft.world.level.ChunkPos;

public class EssenceChunk {
    public boolean activo;
    public ChunkPos pos;
    private EssenceLevel escencias;
    
    public EssenceChunk(ChunkPos pos, EssenceLevel escencias) {
        this.pos = pos;
        this.escencias = escencias;
        this.activo = false;
    }
    
    public EssenceLevel getEscenciasCopy() {
        return escencias.getCopy();
    }
    
    private void addEscencia(byte index, float cantidad) {
        this.escencias.setEscencia(index, this.escencias.getEscencia(index) + cantidad);
        if(this.escencias.getEscencia(index) >= MAX_LEVEL) {
            this.activo = true;
            this.escencias.setEscencia(index, this.escencias.getEscencia(index) - MAX_LEVEL);
        }
    }
    
    public void addRandomToEssence(Mineral mineral, Random random, Difficulty difficulty) {
        addEscencia(Essence.getEssenceFromMineral(mineral).index, random.nextFloat() * mineral.contenido * difficulty.getId() / 3);
    }
    
    public void addCoal(float cantidad) {
        addEscencia(COAL.index, cantidad);
    }
    
    public void addCopper(float cantidad) {
        addEscencia(COPPER.index, cantidad); 
    }
    
    public void addLapis(float cantidad) {
        addEscencia(LAPIS.index, cantidad); 
    }
    
    public void addIron(float cantidad) {
        addEscencia(IRON.index, cantidad); 
    }
    
    public void addGold(float cantidad) {
        addEscencia(GOLD.index, cantidad); 
    }
    
    public void addRedstone(float cantidad) {
        addEscencia(REDSTONE.index, cantidad); 
    }
    
    public void addDiamond(float cantidad) {
        addEscencia(DIAMOND.index, cantidad); 
    }

    public void addEmerald(float cantidad) {
        addEscencia(EMERALD.index, cantidad); 
    }
    
    public void addQuartz(float cantidad) {
        addEscencia(QUARTZ.index, cantidad);
    }
    
    public void addNetherita(float cantidad) {
        addEscencia(NETHERITE.index, cantidad);
    }
    
    public float getEscenciaTotal() {
        return escencias.getEscenciaTotal();
    }
    
    public float getCoal() {
        return escencias.getCoal();
    }
    
    public float getCopper() {
        return escencias.getCopper();
    }
    
    public float getLapis() {
        return escencias.getLapis();
    }
    
    public float getIron() {
        return escencias.getIron();
    }
    
    public float getGold() {
        return escencias.getGold();
    }
    
    public float getRedstone() {
        return escencias.getRedstone();
    }
    
    public float getDiamond() {
        return escencias.getDiamond();
    }

    public float getEmerald() {
        return escencias.getEmerald();
    }
    
    public float getQuartz() {
        return escencias.getQuartz();
    }
    
    public float getNetherita() {
        return escencias.getNetherita();
    }
}
