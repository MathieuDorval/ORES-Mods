package com.ores.core;

public enum Variants {
    STONE_ORE("{material}_ore",Category.ORE),
    DEEPSLATE_ORE("{material}_ore",Category.ORE),

    SELF("{material}",Category.ITEM),
    INGOT("{material}_ingot",Category.ITEM),
    RAW("raw_{material}",Category.ITEM),

    BLOCK("{material}_block",Category.BLOCK),
    RAW_BLOCK("raw_{material}_block",Category.BLOCK);


    Variants(String id, Category type) {
    }

    public enum Category {
        ITEM,
        BLOCK,
        ORE
    }
}
