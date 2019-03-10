package com.training.action;

import com.training.Operation;
import com.training.View;

import java.util.*;

public class Action {
    private View view;
    private Map<ActionType, Operation<Integer>> actionNumberMap;
    private Map<ActionType, Operation<String>> actionTextMap;

    public Action(View view) {
        this.view = view;
        this.actionNumberMap = initActionNumberMap();
        this.actionTextMap = initActionTextMap();
    }

    public Map<ActionType, Operation<Integer>> getActionNumberMap() {
        return actionNumberMap;
    }

    public Map<ActionType, Operation<String>> getActionTextMap() {
        return actionTextMap;
    }

    private Map<ActionType, Operation<Integer>> initActionNumberMap() {
        Map<ActionType, Operation<Integer>> actionMap = new HashMap<>();
        actionMap.put(ActionType.SUM, (x, y) -> x + y);
        actionMap.put(ActionType.SUBTRACTION, (x, y) -> x - y);
        actionMap.put(ActionType.MULTIPLICATION, (x, y) -> x * y);
        actionMap.put(ActionType.DIVISION, (x, y) -> x / y);
        return actionMap;
    }

    private Map<ActionType, Operation<String>> initActionTextMap() {
        Map<ActionType, Operation<String>> actionMap = new HashMap<>();
        actionMap.put(ActionType.SUM, (x, y) -> x + y);
        return actionMap;
    }

    public void doAction(ActionType actionType, Integer firstValue, Integer secondValue) {
        view.viewMessage(doAction(actionType, actionNumberMap, firstValue, secondValue));
    }

    public void doAction(ActionType actionType, String firstValue, String secondValue) {
        view.viewMessage(doAction(actionType, actionTextMap, firstValue, secondValue));
    }

    public <T> T doAction(ActionType actionType, Map<ActionType, Operation<T>> actionMap, T firstValue, T secondValue) {
        return actionMap.values().stream()
                .filter(action -> action.equals(actionMap.get(actionType)))
                .map(operation -> operation.calculate(firstValue, secondValue)).findFirst().get().get();
    }
}
