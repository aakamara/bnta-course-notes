package com.bnta.vestservice.models;

import javax.persistence.*;

//POJO - Plain Old Java Object
//all properties are private and have getters & setters as well as constructors

@Entity //let's Hibernate know we want to map to a database table
@Table(name = "pets")
public class Pet {

    //Properties
    @Id //to let Hibernate know that we want a PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //we will need this value to be automatically added in a specific way
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private String type;

//   pinned for later
    @ManyToOne //what is the relationship between pets and vets
    @JoinColumn(name = "vet_id", nullable = false)
    private Vet vet; //every pet is going to be assigned a vet

    //Constructor
        // remove the id as we do not want to us it
    public Pet(String name, String type, Vet vet) {
        this.name = name;
        this.type = type;
        this.vet = vet;
    }

    //Default constructor
    public Pet() {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }
}
