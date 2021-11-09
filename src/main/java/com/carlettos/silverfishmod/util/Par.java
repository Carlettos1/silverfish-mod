package com.carlettos.silverfishmod.util;

import net.minecraft.world.level.ChunkPos;

public class Par implements Comparable<Par> {
    public int x;
    public int z;
    
    public Par() {
    }
    
    public Par(final int x, final int z) {
        this.x = x;
        this.z = z;
    }
    
    public Par(final Par c) {
        this.x = c.x;
        this.z = c.z;
    }
    
    public static Par fromChunkPos(ChunkPos pos) {
        return new Par(pos.x, pos.z);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof Par)) {
            return false;
        }
        final Par par = (Par)o;
        return this.x == par.x && this.z == par.z;
    }
    
    @Override
    public int hashCode() {
        return this.x + this.z << 8;
    }
    
    @Override
    public int compareTo(final Par c) {
        return (this.z == c.z) ? (this.x - c.x) : (this.z - c.z);
    }
    
    public void set(final int x, final int z) {
        this.x = x;
        this.z = z;
    }
    
    public float getDistanceSquared(final int x, final int z) {
        final float f = (float)(this.x - x);
        final float f2 = (float)(this.z - z);
        return f * f + f2 * f2;
    }
    
    public float getDistanceSquaredToChunkCoordinates(final Par c) {
        return this.getDistanceSquared(c.x, c.z);
    }
    
    @Override
    public String toString() {
        return "Pos{x=" + this.x + ", y=" + this.z + '}';
    }
}