package com.company.group12.enums;

public enum Values {
    TWO(2), THREE(3), FOUR(4),
    FIVE(5), SIX(6), SEVEN(7),
    EIGHT(8), NINE(9), TEN(10),
    JACK(10), QUEEN(10), KING(10), ACE(11);

    private final int point;

    Values(int point) {
        this.point = point;
    }

    public int getPoint() {
        return point;
    }
}
