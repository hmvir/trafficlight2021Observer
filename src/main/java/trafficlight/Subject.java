package trafficlight;

import trafficlight.states.State;

import java.util.ArrayList;
import java.util.List;


public class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObserver(State s){
        for(int i = 0; i < observers.size(); i++){
            observers.get(i).update(s);
        }
    }
}
