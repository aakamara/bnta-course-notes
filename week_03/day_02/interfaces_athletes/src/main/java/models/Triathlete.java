package models;

import interfaces.Cyclable;
import interfaces.IRun;
import interfaces.Swimable;

public class Triathlete implements Swimable, Cyclable, IRun {

    //don't have to give classes properties
    private String name;

    public Triathlete(String name){
        this.name = name;
    }

    public String swim(int distance){
        return this.name + "swam" + distance + "m after cycling";
    }

    public String dive(){
        return this.name + "dived into the pool ";
    }


    public String cycle(int distance){
        return this.name + "cycled" + distance + "m from the start";
    }

    public String run(int distance){
        return this.name + "ran" + distance + "m after swimming";
    }

}
