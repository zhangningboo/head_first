package beverages;

import component.Beverage;

/**
 * 浓缩咖啡 / 意式咖啡
 * 浓缩咖啡是一种饮料，所以它扩展自Beverage类
 */
public class Espresso extends Beverage {

    public Espresso() {
        // description实例变量是从Beverage继承来的
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }

}
