package models;

import interfaces.Cyclable;

public class Cyclist implements Cyclable {

    private String name;

    public Cyclist(){
        this.name = name;
    }

    @Override
    public String cycle(int distance) {
        return this.name + "cycled" + distance + "m";
    }

    //can implement multiple classes
}
