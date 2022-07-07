import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDog {

    Dog dog; // created a dog class

    @BeforeEach
    public void setUp(){
        dog = new Dog("Koda", 3, true); //you create a new dog here with properties
    }

    @Test
    public void hasName(){
        assertThat(dog.getName()).isEqualTo("Koda"); //the dog will be in red, so we need a dog placed above
    }

    @Test
    public void hasAge(){
        assertThat(dog.getAge()).isEqualTo(3); //checking the age of the dog
    }

    @Test
    public void hasWorkingBreed(){
        assertThat(dog.getIsWorkingBreed()).isEqualTo(true); //checking it is a working breed
    }

    @Test
    public void canBark(){
        assertThat(dog.bark()).isEqualTo("woof"); //checking that the dog is barking
    }

    @Test
    public void canEat(){
        assertThat(dog.eat()).isEqualTo("Koda is eating");
    }
}
