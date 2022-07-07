import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArrayPracticeTest {

    ArrayPractice arrayPractice;

    @BeforeEach
    public void setUp(){
        arrayPractice = new ArrayPractice();
    }

    @Test
    public void getFiveIntegers(){
        assertThat(arrayPractice.returnFiveIntegerArray().length).isEqualTo(5);
    }

    @Test
    public void canAddName(){
        arrayPractice.addName("Richard"); //if red you need to create a Method
        assertThat(arrayPractice.getNames().size()).isEqualTo(1);
        arrayPractice.addName("John");
        assertThat(arrayPractice.getNames().size()).isEqualTo(2);
    }

    @Test
    public void removeName(){ //removal of name and making sure that the is 1 size not two
        arrayPractice.addName("Richard");
        arrayPractice.addName("Jimmy");
        assertThat(arrayPractice.getNames().size()).isEqualTo(2);
        arrayPractice.removeName("Richard");
        assertThat(arrayPractice.getNames().size()).isEqualTo(1);
    }


}
