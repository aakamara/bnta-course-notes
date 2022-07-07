package com.bnta.vestservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "vets")
public class Vet {
    //Properties
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String name;
    @OneToMany(mappedBy = "vet") // one vet to many pets
        //mappedBy tells us what to look for
        //stops serialisation
    @JsonIgnoreProperties({"vet"})
    private List<Pet> pets;

    //Constructors
    public Vet(String name) { //no need for list here
        this.name = name;
        this.pets = new ArrayList<Pet>(); //change to ArrayList<>()
    }

    //Default Constructor
    public Vet() {
    }

    //Getters & Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
