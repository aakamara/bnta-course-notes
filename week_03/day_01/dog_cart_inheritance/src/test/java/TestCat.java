import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCat {

    Cat cat;

    @BeforeEach
    public void setUp(){
        cat = new Cat("Darcy", 13);
    }

    @Test
    public void hasName(){
        assertThat(cat.getName()).isEqualTo("Darcy");
    }

    @Test
    public void hasAge(){
        assertThat(cat.getAge()).isEqualTo(13);
    }

    @Test
    public void canMeow(){
        assertThat(cat.meow()).isEqualTo("meow");
    }

    @Test
    public void canSleep(){
        assertThat(cat.sleep()).isEqualTo("Darcy is sleeping");
    }

}
