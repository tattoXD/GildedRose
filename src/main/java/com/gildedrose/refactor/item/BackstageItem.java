package com.gildedrose.refactor.item;

import com.gildedrose.refactor.Item;

/**
 * @author leo
 * @date 2021/6/16
 */
public class BackstageItem extends Item {
    public BackstageItem(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert",sellIn,quality);
    }

    @Override
    protected void updateQuality() {
        if (quality < 50) {
            quality = quality + 1;

            if (sellIn < 11) {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }

            if (sellIn < 6) {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }
        }

        sellIn = sellIn - 1;

        if (sellIn < 0) {
            quality = 0;
        }
    }
}
