package com.bnta.news;

import com.bnta.interfaces.IObserver;
import com.bnta.interfaces.ISubject;

import java.util.ArrayList;
import java.util.List;

public class NewsFeed implements ISubject {

    private List<IObserver> observers;

    public NewsFeed(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void callObserver(String message) {
        //loop though list of observers and call update method
        for(IObserver observer : observers) { //for every object in that list
                observer.update(message);
            }
        }

    @Override
    public void addObserver(IObserver observer) {
        //and an IObserver list
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        //remove an IObserver from the list
        this.observers.remove(observer);
    }
}
