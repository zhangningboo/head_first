package condiments;

import component.Beverage;
import component.CondimentDecorator;

/**
 * 摩卡
 * 摩卡是一种调料，所以它扩展自CondimentDecorator类
 * CondimentDecorator扩展自Beverage类
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;  // 持有一个Beverage引用；被装饰者

    public Mocha(Beverage beverage) {
        this.beverage = beverage;  // 用一个实例变量记录被装饰者
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
