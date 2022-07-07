package com.bnta.farm.animals;

import java.util.ArrayList;
import java.util.List;

public class Horse {
    public static List<Horse> horses = new ArrayList<>();
    private String name;
    private Integer age;
    private double height;

// the Horse is a type, the horse type has 3 number variables
    public Horse(String name, Integer age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
        Horse.horses.add(this);
    }
//the constructor creates a new horse object but the setters can help change the properties of the object later on
    //some properties are read only so they have only a get method

 //Getters need to return the value otherwise there will be an error
    public String getName() {
        return name;
    }
//Setter updates a value so a return is not needed
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
