package com.carlettos.silverfishmod.util;

public class Par<X, Y> {
    public final X x;
    public final Y y;
    public Par(X x, Y y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Par) {
            Par<?, ?> otro = (Par<?, ?>)obj;
            return this.x.equals(otro.x) && this.y.equals(otro.y);
        } else {
            return false;
        }
    }
}
