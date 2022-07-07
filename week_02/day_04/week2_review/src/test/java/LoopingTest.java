import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoopingTest {

    //need a reference object
    Looping looping; //name of the object being created, a variable

    @BeforeEach //will run for every test specified
    public void setUp(){
        looping = new Looping();
    }

    @Test //defining the test
    public void getsOneToTen(){
        //looping.printOneToTen();
        //access assertions
        assertThat(looping.getOneToTen()).isEqualTo("12345678910");
    }

}
