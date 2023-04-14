package subjects;

import service.impl.FlyWithWings;
import service.impl.Quack;

public class MallardDuck extends Duck {

    /**
     * 无参构造方法
     */
    public MallardDuck() {
        // 覆盖父类的属性
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("MallardDuck display");
    }
}
