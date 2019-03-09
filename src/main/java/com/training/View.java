package com.training;

import java.util.List;

public class View<T> {
    private List<Operation<T>> actionList;
    private T firstValue;
    private T secondValue;

    public View(List<Operation<T>> actionList, T firstValue, T secondValue) {
        this.actionList = actionList;
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public void viewMessage() {
        actionList.stream().map(operation -> {
            try {
                return operation.calculate(firstValue, secondValue);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }).forEach(s -> System.out.println("result is :" + s));
    }
}
