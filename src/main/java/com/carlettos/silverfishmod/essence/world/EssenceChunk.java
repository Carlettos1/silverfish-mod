package com.carlettos.silverfishmod.essence.world;

import static com.carlettos.silverfishmod.essence.util.EssenceLevel.MAX_LEVEL;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.carlettos.silverfishmod.essence.util.EssenceLevel;
import com.carlettos.silverfishmod.util.Essence;

import net.minecraft.world.Difficulty;
import net.minecraft.world.level.ChunkPos;

public class EssenceChunk {
    //TODO: cambiar el list por un map?
    public List<Essence> essenceActivation;
    public ChunkPos pos;
    private EssenceLevel essences;
    
    public EssenceChunk(ChunkPos pos, EssenceLevel escencias) {
        this.pos = pos;
        this.essences = escencias;
        this.essenceActivation = new ArrayList<>();
    }
    
    public EssenceLevel getEssencesCopy() {
        return essences.getCopy();
    }
    
    public void add(Essence essence, float cantidad, boolean check){
        this.essences.add(essence, cantidad);
        if (check) {
            checkEssenceLevels();
        }
    }
    
    public void set(Essence essence, float cantidad, boolean check){
        this.essences.set(essence, cantidad);
        if (check) {
            checkEssenceLevels();
        }
    }
    
    public float get(Essence essence){
        return this.essences.get(essence);
    }
    
    public float getTotalEssence() {
        return essences.getTotal();
    }
    
    private void checkEssenceLevels() {
        for (Essence essence : Essence.values()) {
            if (this.get(essence) >= MAX_LEVEL) {
                this.essenceActivation.add(essence);
                this.add(essence, -MAX_LEVEL, true);
            }
        }
    }
    
    public void addRandom(Essence essence, Difficulty difficulty, Random random, float cantidad, boolean check) {
        add(essence, random.nextFloat() * cantidad * difficulty.getId() / 3, check);
    }
    
    public void addEssenceLevel(EssenceLevel essencelevel, boolean check) {
        for (Essence essence : Essence.values()) {
            this.add(essence, essencelevel.get(essence), check);
        }
    }
}
