package condiments;

import component.Beverage;
import component.CondimentDecorator;

public class Soy extends CondimentDecorator {
    Beverage beverage;  // 持有一个Beverage引用；被装饰者

    public Soy(Beverage beverage) {
        this.beverage = beverage;  // 用一个实例变量记录被装饰者
    }

    @Override
    public double cost() {
        return 0.40 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}