import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PersonTest {

    Person person;
    Dog dog;

    @BeforeEach
    public void setUp(){
        person = new Person("Anna");
        dog = new Dog("brown", "grey","Larry");
        //assertThat();
    }

    @Test
    public void canFeedTheDog(){
        String result = person.feedPet(dog, "chicken"); //making it into a variable
        assertThat(result).isEqualTo("Anna is feeding Larry");
        //what do I have access to
    }

}
