package com.training.action;

import com.training.View;
import org.junit.Assert;
import org.junit.Test;

public class ActionTest {
    View view = new View();
    Action action = new Action(view);
    @Test
    public void doAction() {
        int number = action.doAction(ActionType.SUM, action.getActionNumberMap(), 10, 4);
        Assert.assertEquals(14, number);
        String text = action.doAction(ActionType.SUM,action.getActionTextMap(),"10","5");
        Assert.assertEquals("105", text);
    }
}
