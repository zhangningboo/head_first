package component;

/**
 * 调料抽象类
 * 首先，必须让CondimentDecorator能够取代Beverage，所以这个抽象类扩展自Beverage类
 */
public abstract class CondimentDecorator extends Beverage {

    /**
     * 所有的调料装饰者都必须重新实现getDescription()方法
     */
    public abstract String getDescription();


}
