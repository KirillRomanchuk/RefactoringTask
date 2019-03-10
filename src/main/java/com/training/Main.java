package com.training;

import com.training.action.Action;
import com.training.action.ActionType;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Action action = new Action(view);
        Arrays.stream(ActionType.values()).forEach(actionType -> action.doAction(actionType, 6, 4));
        action.doAction(ActionType.SUM,"6","4");
    }
}