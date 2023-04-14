package subjects;

import service.FlyBehavior;
import service.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        // 委托给行为类
        flyBehavior.fly();
    }

    public void performQuack() {
        // 委托给行为类
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

}
