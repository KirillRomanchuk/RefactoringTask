package com.training;

public interface Operation<T> {
   T calculate(T x, T y) throws Exception;
}
