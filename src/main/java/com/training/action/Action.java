package com.training.action;

import com.training.Operation;
import com.training.View;

import java.util.HashMap;
import java.util.Map;

public class Action<T> {
    public Map<ActionType, Operation<Integer>> getActionNumberList() {
        Map<ActionType, Operation<Integer>> actionList = new HashMap<>();
        actionList.put(ActionType.SUM, (x, y) -> x + y);
        actionList.put(ActionType.SUBTRACTION, (x, y) -> x - y);
        actionList.put(ActionType.MULTIPLICATION, (x, y) -> x * y);
        actionList.put(ActionType.DIVISION, (x, y) -> x / y);
        return actionList;
    }

    public Map<ActionType, Operation<String>> getActionTextList() {
        Map<ActionType, Operation<String>> actionMap = new HashMap<>();
        actionMap.put(ActionType.SUM, (x, y) -> x + y);
        return actionMap;
    }

    public void doAction(View view, Map<ActionType, Operation<T>> actionMap, T firstValue, T secondValue) {
        actionMap.values().stream().map(operation -> {
            try {
                return operation.calculate(firstValue, secondValue);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }).forEach(s -> view.viewMessage(s));
    }
}
