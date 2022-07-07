package models;

import interfaces.Swimable;

public class Swimmer implements Swimable {

    private String name;

    //constructor
    public Swimmer(String name){

        this.name = name;
    }

    public String swim(int distance){ //has to be an int but can name it anything
        return this.name + "swam" + distance + "m"; //Jane swan 10m
    }

    public String dive(){
        return this.name + "dived into the pool ";
    }

}
