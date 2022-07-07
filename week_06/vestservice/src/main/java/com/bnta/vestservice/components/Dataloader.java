package com.bnta.vestservice.components;

import com.bnta.vestservice.models.Pet;
import com.bnta.vestservice.models.Vet;
import com.bnta.vestservice.repositories.PetRepository;
import com.bnta.vestservice.repositories.VetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component //needs to be run beforehand
public class Dataloader implements ApplicationRunner {

    @Autowired //dependency injection
    PetRepository petRepository;

    @Autowired
    VetRepository vetRepository;

    //need a run method
    @Override
    public void run(ApplicationArguments args) throws Exception {

        Vet vet1 = new Vet("Emma");
        //can save this into the repo
        vetRepository.save(vet1); //this saves a vet

        Pet pet1 = new Pet("Betty", "dog", vet1);
        petRepository.save(pet1);
        //you have to make a vet first not a pet first otherwise errors

        Pet pet2 = new Pet("Ella", "turtle", vet1);
        petRepository.save(pet2);

        Vet vet2 = new Vet("Joe");
        vetRepository.save(vet2);

        Pet pet3 = new Pet("Mabel", "dog", vet2);
        petRepository.save(pet3);
    }
}
