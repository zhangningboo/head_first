package size;

import component.Beverage;
import component.SizeDecorator;

/**
 * 小杯
 */
public class Tall extends SizeDecorator {

    Beverage beverage;  // 持有一个Beverage引用；被装饰者

    public Tall(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getSize() {
        return "Tall";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Tall Size";
    }

}
