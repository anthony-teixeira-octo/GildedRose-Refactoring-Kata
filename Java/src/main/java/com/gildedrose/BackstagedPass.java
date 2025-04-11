package com.gildedrose;

public class BackstagedPass extends Item {

    public BackstagedPass(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (sellIn > 0) {
            if (quality < 50) quality++;
            if (sellIn <= 10 && quality < 50) quality++;
            if (sellIn <= 5 && quality < 50) quality++;
        } else {
            quality = 0;
        }

        sellIn--;
    }

}
