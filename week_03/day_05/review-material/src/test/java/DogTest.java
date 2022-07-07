import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DogTest {
    //creating a dog object

    Dog dog;

    @BeforeEach // inside the dog object are all the things the dog could have
    public void setUp(){
        dog = new Dog("brown", "white", "Barry");
    } //newed up a dog
    //write the test
    @Test
    public void hasEyeColout(){
        Dog mabel = new Dog("green", "black", "Harry");
        //can new up a dog inside of the test
        assertThat(mabel.getEyeColour()).isEqualTo("green");
        assertThat(dog.getFurColour()).isEqualTo("white");
    }

    @Test
    public void canBark(){
        assertThat(dog.bark()).isEqualTo("woof");
    }
    @Test
    public void dogCanEat(){
        assertThat(dog.eat("chicken")).isEqualTo("dog is eating chicken");
    }

    @Test
    public void canChangeFurColour(){
        dog.setFurColour("grey");
        assertThat(dog.getFurColour()).isEqualTo("grey");
    }

    @Test
    public void ailmentsStartEmpty(){
        assertThat(dog.ailmentCount()).isEqualTo(0);
    }

    @Test
    public void canAddAilment(){
        dog.addAilments("can't breathe");
        assertThat(dog.ailmentCount()).isEqualTo(1);
    }
}
