package com.bnta.demo.pet;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Set;

@Component
public class PetModel {

    private int id;
    private String name;
    private LocalDate dob;
    private String type;
    private Set<String> characteristics;
    private float price;

    // Constructor
    public PetModel(){}

    public PetModel(int id, String name, LocalDate dob, String type, Set<String> characteristics, float price){
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.type = type;
        this.characteristics = characteristics;
        this.price = price;
    }

    public PetModel(int id, String name, LocalDate dob, String species, String breed, Set<String> characteristics, float price) {
    }

    // Getters and Setters
    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<String> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(Set<String> characteristics) {
        this.characteristics = characteristics;
    }

    // add a new characteristic to the list
    public void addCharacteristic(String characteristic) {
        this.characteristics.add(characteristic);
    }

    // remove characteristic and return true if it is in the list
    // else return false
    public boolean removeCharacteristic(String characteristic) {
        if(this.characteristics.contains(characteristic)) {
            this.characteristics.remove(characteristic);
            return true;
        }
        return false;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // A factory method
    public PetModel createNew(int id, String name, LocalDate dob, String type, Set<String> characteristics, float price) {
        return new PetModel(id, name, dob, type, characteristics, price);
    }


}
