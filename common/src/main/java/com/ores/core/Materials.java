package com.ores.core;

public enum Materials {
    STONE_ORE("{material}_ore"),
    DEEPSLATE_ORE("{material}_ore"),

    SELF("{material}"),
    INGOT("{material}_ingot"),
    RAW("raw_{material}"),

    BLOCK("{material}_block"),
    RAW_BLOCK("raw_{material}_block");

    Materials(String id) {
    }

}

