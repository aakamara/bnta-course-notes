package com.bnta.demo.pet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class PetService {
    private PetModel petModelFactory; //deals with all the HTTP requests
    private List<PetModel> pets = new ArrayList<>();
    private int nextId = 0; //this is a workaround; when you work with a db, you will not do this

    protected PetService() {}

    @Autowired
    public PetService(PetModel petModelFactory) {
        this.petModelFactory = petModelFactory;
    }

    public void createPet(String name, LocalDate dob, String type, Set<String> characteristics, float price) {
        this.pets.add(petModelFactory.createNew(nextId, name, dob, type, characteristics, price));
        nextId++;
    }

    public PetModel getPet(int id) {
        for(PetModel pet : pets){
            if(pet.getId() == id) return pet;
        }
        return null;
        //return pets.stream().filter(pet -> pet.getId() == id).collect(Collectors.toList()).get(0);
    }

    public List<PetModel> getPets(){
        return pets;
    }

    public void removePet(int id){
        for (PetModel pet : pets){
            if (pet.getId() == id)pets.remove(pet);
        }
    }
}


