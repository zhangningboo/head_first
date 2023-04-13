package service.impl;

import service.QuackBehavior;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("quack");
    }

}
