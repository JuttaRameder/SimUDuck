package com.simuduck;

/**
 * Created by ramederj on 09.02.2016.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        super(new Squeak(), new NoFly());
    }

    @Override
    public void display() {

    }
}
