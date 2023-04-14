package service;

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    /**
     * 主题改变时，将状态值传送给观察者
     */
    void notifyObserver();

}
