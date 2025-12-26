package DesignPattern.ObserverPattern.WeatherORama.Observers;

public interface Observer {
    public void update(float temperature, float humidity, float pressure);
}
