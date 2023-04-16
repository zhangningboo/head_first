package size;

import component.Beverage;
import component.SizeDecorator;

/**
 * 中杯
 */
public class Grande extends SizeDecorator {

    Beverage beverage;  // 持有一个Beverage引用；被装饰者

    public Grande(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getSize() {
        return "Grande";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Grande Size";
    }
}
