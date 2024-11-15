package online.devplanet.Basics.ObserverPattern.ObserverPatternExample;


import java.util.ArrayList;
import java.util.List;


class WeatherStationIN implements Subject {

    private float temperature;

    private List<Observer> observerList;

    public WeatherStationIN(){
        observerList = new ArrayList<>(); //Empty
    }

    public void setTemperature(float temperature){
        this.temperature=temperature;
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }


    @Override
    public void notifyObservers() {
        for (Observer obj:observerList){
            obj.update(temperature);
        }
    }
}

