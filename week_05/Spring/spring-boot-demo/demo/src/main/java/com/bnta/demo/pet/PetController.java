package com.bnta.demo.pet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@RestController
@RequestMapping("pets")
public class PetController { // general end point for the class
    private PetService petService;

    public PetController() {}

    // automate DI for this constructor
    @Autowired
    public PetController(PetService petService) {
        this.petService = petService;

        // We'll initialize a sample 'repository' with some dummy pets
        this.petService.createPet("Fluffy",
                LocalDate.of(2000, 4, 26),
                "Rabbit",
                new HashSet<String>(Arrays.asList("Happy", "Smart")),
                (float)30.99
        );
        this.petService.createPet("Captain Cuddles",
                LocalDate.of(2018, 2, 20),
                "Cat",
                new HashSet<String>(Arrays.asList("Energetic", "Mysterious")),
                (float)140.99
        );
        this.petService.createPet("Duggee",
                LocalDate.of(2009, 8, 17),
                "Dog",
                new HashSet<String>(Arrays.asList("Nurturing", "Intuitive")),
                (float)700.99
        );
        this.petService.createPet("Sergeant Pepper's",
                LocalDate.of(2015, 4, 9),
                "Turtle",
                new HashSet<String>(Arrays.asList("Nurturing", "Intuitive")),
                (float)360.99
        );
    }

 /*  @GetMapping
    public List<String> getPets(){
        return Arrays.asList("Hello", "BNTA", ":-)");
    } */

    @GetMapping
    public List<PetModel> getPets() {
        return this.petService.getPets();
    }
    //get mapping requestand the function to go with it
    @GetMapping(value="/{id}") // annotation for a variable
    public PetModel getPet(@PathVariable("id") int id){
        return this.petService.getPet(id);
    }
}


