package com.gildedrose;

public class OtherCommonProduct extends Item {
    public OtherCommonProduct(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (this.quality > 0) this.quality--;
        if (this.sellIn <= 0 && this.quality > 0) this.quality--;
        this.sellIn--;
    }


}
