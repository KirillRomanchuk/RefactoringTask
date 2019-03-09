package com.training;

import com.training.action.Action;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Action action = new Action(view);
        action.doAction(action.getActionNumberList(), 6, 4);
        action.doAction(action.getActionTextList(), "6", "4");
    }
}