package com.training;

import java.util.Optional;

public interface Operation<T> {
    default Optional<T> calculate(T x, T y) {
        try {
            return Optional.ofNullable(calculateThrows(x, y));
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    T calculateThrows(T x, T y) throws Exception;
}
