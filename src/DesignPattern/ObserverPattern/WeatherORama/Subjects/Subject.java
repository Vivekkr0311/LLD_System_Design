package DesignPattern.ObserverPattern.WeatherORama.Subjects;

import DesignPattern.ObserverPattern.WeatherORama.Observers.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
