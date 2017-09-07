package com.codecool.uml.overriding;



public abstract class AbstractProcess implements IOrderable {

    public void process() {
        stepBefore();
        action();
        stepAfter();
    }

    public void stepBefore() {

    }

    public abstract void action();

    public void stepAfter() {

    }


}
