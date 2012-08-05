package com.chip8.core;

/**
 * Author: Igor Bubelov
 * Date: 7/07/12 12:37 PM
 */
public enum Scale {
    PERCENT_50,
    PERCENT_100,
    PERCENT_150,
    PERCENT_200;

    public int cellSize() {
        switch (this) {
            case PERCENT_50:
                return 5;
            case PERCENT_100:
                return 10;
            case PERCENT_150:
                return 15;
            case PERCENT_200:
                return 20;
            default:
                throw new UnsupportedOperationException("Unknown scale: " + name());
        }
    }

    @Override
    public String toString() {
        switch (this) {
            case PERCENT_50:
                return "50%";
            case PERCENT_100:
                return "100%";
            case PERCENT_150:
                return "150%";
            case PERCENT_200:
                return "200%";
            default:
                throw new UnsupportedOperationException("Unknown scale: " + name());
        }
    }
}