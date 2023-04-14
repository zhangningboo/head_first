package service;

public interface Observer {

    /**
     * 所有观察者必须实现update()方法，以实现观察者接口
     *
     * @param temp     温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    void update(float temp, float humidity, float pressure);

}
