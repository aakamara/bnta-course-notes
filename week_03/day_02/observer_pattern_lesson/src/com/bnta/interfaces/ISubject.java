package com.bnta.interfaces;

public interface ISubject {
    void callObserver(String message);
    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
}
