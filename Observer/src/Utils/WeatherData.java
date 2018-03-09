package Utils;

import Behaviors.Observer;
import Behaviors.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i>=0) observers.remove(i);
    }
    @Override
    public void notifyObservers() {
        for (int i = 0; i<observers.size();i++){
            observers.get(i).update(temperature, humidity, pressure);
        }
    }
    public void measurmentsChanged(){
        notifyObservers();
    }
    public void setMeasurments(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurmentsChanged();
    }
}
