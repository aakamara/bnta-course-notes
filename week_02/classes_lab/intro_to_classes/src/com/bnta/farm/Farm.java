package com.bnta.farm;

import com.bnta.farm.animals.Horse;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Farm {
    // static members belong in the CLASS itself
    public static ArrayList<Farm> farms = new ArrayList<>();
    //instance members belong to a specific object created from the class
    //static is singular and belongs to the class itself

    private String name;
    private double acres;
    private List<Horse> horses = new LinkedList<>();

    public Farm(String name, double acres) {
        this.name = name;
        this.acres = acres;
        Farm.farms.add(this);
        //Whenever we 'new' Farm with a new keyword that is called a constructor
    }

    public void addHorse(Horse horse){
        this.horses.add(horse);
    }

    public List<Horse> getHorses(){
        return this.horses;
    }

    // Pig [] pigs
    // can provide getters and setters
    public String getName() {
        return this.name;
    }

    public double getAcres(){
        return this.acres;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "name='" + name + '\'' +
                "acres='" + acres + '\'' +
                "horses='" + horses + '\''+
                '}';
    }
    //meaningful representation of an object class

    @Override
    public boolean equals(Object o) { //equals() method references another value
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Farm farm = (Farm) o;
        return Double.compare(farm.acres, acres) == 0 && name.equals(farm.name);
    }
//2 string creates a meaningful representation of our object
    @Override
    public int hashCode() {
        return Objects.hash(name, acres);
    }
}
