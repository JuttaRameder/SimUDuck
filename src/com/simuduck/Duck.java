package com.simuduck;

/**
 * Created by ramederj on 09.02.2016.
 */
public abstract class Duck {

    private final QuackBehaviour quackBehaviour;
    private final FlyBehaviour flyBehaviour;

    public Duck(QuackBehaviour quackBehaviour, FlyBehaviour flyBehaviour) {
        this.quackBehaviour = quackBehaviour;
        this.flyBehaviour = flyBehaviour;
    }

    public final String quack() {
        final String quack = quackBehaviour.quack();
        System.out.println(quack);
        return quack;
    }

    public void swim() {

    }

    public void fly() {
        flyBehaviour.fly();
    }

    public abstract void display();

}
