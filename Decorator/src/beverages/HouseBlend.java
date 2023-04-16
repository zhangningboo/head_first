package beverages;

import component.Beverage;

/**
 * 综合咖啡 / 首选咖啡
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }

}
