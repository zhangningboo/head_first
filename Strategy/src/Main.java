import subjects.Duck;
import subjects.MallardDuck;
import subjects.ModelDuck;
import service.impl.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Duck duck = new MallardDuck();
        duck.performFly();
        duck.display();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        // 动态设置属性
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}