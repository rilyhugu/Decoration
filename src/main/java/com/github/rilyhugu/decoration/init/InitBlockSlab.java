package com.github.rilyhugu.decoration.init;

import com.github.rilyhugu.decoration.resource.block.DecoSlab;

public class InitBlockSlab {
    private DecoSlab slabHalf;
    private DecoSlab.Double slabDouble;

    public InitBlockSlab(DecoSlab slabHalf, DecoSlab.Double slabDouble) {
        this.slabHalf = slabHalf;
        this.slabDouble = slabDouble;

        this.slabDouble.setDrop(this.slabHalf);
    }

    public DecoSlab getSlabHalf() {
        return this.slabHalf;
    }

    public DecoSlab.Double getSlabDouble() {
        return this.slabDouble;
    }
}