package com.concepts.streams;

import java.util.List;
import java.util.Random;

public enum Type {
    SMALL,
    MEDIUM,
    LARGE;
    private static final List<Type> VALUES =
            List.of(values());
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Type randomType() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
