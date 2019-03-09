package com.training.action;

import com.training.Operation;
import com.training.View;

import java.util.HashMap;
import java.util.Map;

public class Action {
    View view;
    Map<ActionType, Operation<Integer>> actionNumberList;
    Map<ActionType, Operation<String>> actionTextList;

    public Action(View view) {
        this.view = view;
        this.actionNumberList = getActionNumberList();
        this.actionTextList = getActionTextList();
    }

    private Map<ActionType, Operation<Integer>> getActionNumberList() {
        Map<ActionType, Operation<Integer>> actionMap = new HashMap<>();
        actionMap.put(ActionType.SUM, (x, y) -> x + y);
        actionMap.put(ActionType.SUBTRACTION, (x, y) -> x - y);
        actionMap.put(ActionType.MULTIPLICATION, (x, y) -> x * y);
        actionMap.put(ActionType.DIVISION, (x, y) -> x / y);
        return actionMap;
    }

    private Map<ActionType, Operation<String>> getActionTextList() {
        Map<ActionType, Operation<String>> actionMap = new HashMap<>();
        actionMap.put(ActionType.SUM, (x, y) -> x + y);
        return actionMap;
    }

    public void doAction(ActionType actionType, Integer firstValue, Integer secondValue) {
        doAction(actionType, getActionNumberList(), firstValue, secondValue);
    }

    public void doAction(ActionType actionType, String firstValue, String secondValue) {
        doAction(actionType, getActionTextList(), firstValue, secondValue);
    }

    private <T> void doAction(ActionType actionType, Map<ActionType, Operation<T>> actionMap, T firstValue, T secondValue) {
        actionMap.values().stream()
                .filter(action -> action.equals(actionMap.get(actionType)))
                .map(operation -> operation.calculate(firstValue, secondValue).get())
                .forEach(s -> view.viewMessage(s));
    }


}
