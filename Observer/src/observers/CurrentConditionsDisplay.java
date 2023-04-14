package observers;

import service.DisplayElement;
import service.Observer;
import service.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;

    private float humidity;

    private Subject weatherData;

    /**
     * 把自己注册到主题
     *
     * @param weatherData 主题
     */
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

}
