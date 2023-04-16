package size;

import component.Beverage;
import component.SizeDecorator;

/**
 * 大杯
 */
public class Venti extends SizeDecorator {

    Beverage beverage;  // 持有一个Beverage引用；被装饰者

    public Venti(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getSize() {
        return "Venti";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Venti Size";
    }

}
