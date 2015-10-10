package com.aidar;

public enum Sex {

    NONE(0, ""),
    MALE(1, "Male"),
    FEMALE(2, "Female");

    private final Integer value;
    private final String type;

    private Sex(Integer value, String type) {
        this.value = value;
        this.type = type;
    }

    public Integer getValue() {
        return value;
    }

    public String getType() {
        return type;
    }

}
