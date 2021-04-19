package trafficlight.gui;


import trafficlight.Observer;
import trafficlight.states.State;

import java.awt.*;

public class TrafficLight extends Light implements Observer {

    TrafficLight(Color color) {
        super(color);
    }

    public void turnOn(boolean a) {
        isOn = a;
        repaint();
    }

    public boolean isOn() {
        return isOn;
    }

    @Override
    public void update(State s) {
        if(isOn()){
            turnOn(false);
        } else turnOn(true);
    }

    //TODO implement a part of the pattern here
}
