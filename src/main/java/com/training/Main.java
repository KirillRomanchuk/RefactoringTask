package com.training;

public class Main {
    public static void main(String[] args) {
        new View<>(new Action().getActionNumberList(), 6, 4).viewMessage();
        new View<>(new Action().getActionTextList(), "6", "4").viewMessage();
    }
}