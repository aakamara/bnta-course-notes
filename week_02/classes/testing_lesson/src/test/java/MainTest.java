import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MainTest {
    private Main main;

    @BeforeEach //sets up the test method
    public void setup(){
        main = new Main();

    }

    @Test
    public void shouldSayHi(){
        //assertThat("actual").isEqualTo("expected");
        assertThat(main.sayHi()).isEqualTo("Hi");


    }

}
