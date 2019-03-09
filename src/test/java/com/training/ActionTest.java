package com.training;

import com.training.action.Action;
import org.junit.Assert;
import org.junit.Test;

public class ActionTest {

    Action action = new Action();

    @Test
    public void sum() {
        int sum = action.sum(6, 4);
        Assert.assertEquals(10, sum);
    }

    @Test
    public void sumText() {
        String sum = action.sum("6", "4");
        Assert.assertEquals(64, sum);
    }

    @Test
    public void subtraction() {
        int subtraction = action.subtraction(6, 4);
        Assert.assertEquals(2, subtraction);
    }

    @Test
    public void multiplication() {
        int multiplication = action.multiplication(6, 4);
        Assert.assertEquals(24, multiplication);
    }

    @Test
    public void division() {
        int division = action.division(6, 4);
        Assert.assertEquals(1, division);
    }

    /*@Test
    public void getActionNumberList() {
        List<Operation<Integer>> actionList = action.getActionNumberList();
    }

    @Test
    public void getActionTextList() {
        List<Operation<String>> actionListText = action.getActionTextList();
    }*/
}
