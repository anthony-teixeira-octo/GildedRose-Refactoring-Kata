package com.gildedrose;

public class ConjuredManaCake extends Item {

    public ConjuredManaCake(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (this.quality > 0) this.quality = this.quality - 2;
        this.sellIn --;

        if (this.sellIn < 0) {
            if (this.quality > 0) this.quality = this.quality - 2;
        }
    }
}
