import beverages.DarkRoast;
import beverages.Espresso;
import beverages.HouseBlend;
import component.Beverage;
import condiments.Mocha;
import condiments.Soy;
import condiments.Whip;
import size.Grande;
import size.Tall;
import size.Venti;

public class DecoratorMain {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new Grande(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2 = new Venti(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        beverage3 = new Tall(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }

}
