package com.simuduck;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ramederj on 09.02.2016.
 */
public class DuckTest {

    @Test
    public void testMallardDuck() {
        MallardDuck duck = new MallardDuck();
        Assert.assertEquals("quack", duck.quack());
        Assert.assertEquals("fly", duck.fly());
    }

    @Test
    public void testRedHeadDuck() {
        RedHeadDuck duck = new RedHeadDuck();
        Assert.assertEquals("quack", duck.quack());
        Assert.assertEquals("fly", duck.fly());
    }

    @Test
    public void testRubberDuck() {
        RubberDuck duck = new RubberDuck();
        Assert.assertEquals("squeak", duck.quack());
        Assert.assertEquals("-", duck.fly());
    }
}
