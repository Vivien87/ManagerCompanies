package com.dibrova.entity.type;

public enum Position {

    DIRECTOR("director"),
    MANAGER("manager"),
    SPECIALIST("specialist");

    private String value;

    Position(String value) {
        this.value = value;
    }

    public static Position fromValue(String value) {
        for (Position position :values()) {
            if (position.value.equalsIgnoreCase(value)){
                return position;
            }
        }
        throw new IllegalArgumentException("Unknown enum type " + value);
    }
}
