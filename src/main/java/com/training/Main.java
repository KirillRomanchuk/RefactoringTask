package com.training;

import com.training.action.Action;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Action action = new Action();

        action.doAction(view, action.getActionNumberList(), 6, 4);
        action.doAction(view, action.getActionTextList(), "6", "4");
    }
}