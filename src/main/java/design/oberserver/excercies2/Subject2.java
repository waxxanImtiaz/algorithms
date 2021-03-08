package design.oberserver.excercies2;

import design.oberserver.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject2 {
    private List<Observer2> observers = new ArrayList<>();
    private int state;
    public void attach(Observer2 observer){
        observers.add(observer);
    }
    public void setState(int state){
        this.state = state;
        notifyAllObservers();
    }
    public void notifyAllObservers(){
        observers.forEach((Observer2::update));
    }

    public int getState() {
        return state;
    }
}
