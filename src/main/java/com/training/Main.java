package com.training;

import com.training.action.Action;
import com.training.action.ActionType;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
       /* Map<ActionType, Operation<Integer>> actionMap = new Action().getActionNumberMap();
        try {
            int sum = actionMap.get(ActionType.SUM).calculate(6,4);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        new View<>(new Action().getActionNumberList(), 6, 4).viewMessage();
        new View<>(new Action().getActionTextList(), "6", "4").viewMessage();
    }
}