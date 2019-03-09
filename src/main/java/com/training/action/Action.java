package com.training.action;

import com.training.Operation;
import com.training.action.ActionType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Action {

    public int sum(int x, int y) {
        return x + y;
    }

    public String sum(String x, String y) {
        return x + y;
    }

    public int subtraction(int x, int y) {
        return x - y;
    }

    public int multiplication(int x, int y) {
        return x * y;
    }

    public int division(int x, int y) {
        return x / y;
    }

    public List<Operation<Integer>> getActionNumberList() {
        List<Operation<Integer>> actionList = new ArrayList<>();
        actionList.add((x, y) -> sum(x, y));
        actionList.add((x, y) -> subtraction(x, y));
        actionList.add((x, y) -> multiplication(x, y));
        actionList.add((x, y) -> division(x, y));
        return actionList;
    }

    /*public Map<ActionType, Operation<Integer>> getActionNumberMap() {
        Map<ActionType, Operation<Integer>> actionMap = new HashMap<>();
        actionMap.put(ActionType.SUM, (x, y) -> x + y);
        actionMap.put(ActionType.SUBTRACTION, (x, y) -> x - y);
        actionMap.put(ActionType.MULTIPLICATION, (x, y) -> x * y);
        actionMap.put(ActionType.DIVISION, (x, y) -> x / y);
        return actionMap;
    }*/

    public List<Operation<String>> getActionTextList() {
        List<Operation<String>> actionList = new ArrayList<>();
        actionList.add((x, y) -> sum(x, y));
        return actionList;
    }

}
