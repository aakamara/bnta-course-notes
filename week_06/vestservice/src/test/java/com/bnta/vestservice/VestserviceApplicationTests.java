package com.bnta.vestservice;

import com.bnta.vestservice.models.Pet;
import com.bnta.vestservice.repositories.PetRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class VestserviceApplicationTests {

	@Autowired
	PetRepository petRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canFindDogInPets(){
		List<Pet> found = petRepository.findPetByType("dog");
		assertThat(found.size()).isEqualTo(2);
	}
}
