import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.Test;

public class TestFizzBuzz { //must test before there is a false-positive test
    @Test
    public void fizzbuzz__3_returns_fizz(){
        assertThat(FizzBuzz.fizzbuzz(3)).isEqualTo("fizz");
    }
    @Test
    public void fizzbuzz__9_returns_fizz(){
        assertThat(FizzBuzz.fizzbuzz(9)).isEqualTo("fizz");
    }
    @Test
    public void fizzbuzz__5_returns_buzz(){
        assertThat(FizzBuzz.fizzbuzz(5)).isEqualTo("buzz");
    }
    @Test
    public void fizzbuzz__10_returns_buzz(){
        assertThat(FizzBuzz.fizzbuzz(10)).isEqualTo("buzz");
    }

    @Test
    public void fizzbuzz__15_returns_fizzbuzz(){
        assertThat(FizzBuzz.fizzbuzz(15)).isEqualTo("fizzbuzz");
    }
    @Test
    public void fizzbuzz__30_returns_fizzbuzz(){
        assertThat(FizzBuzz.fizzbuzz(30)).isEqualTo("fizzbuzz");
    }
    @Test
    public void fizzbuzz__4_returns_fizzbuzz(){
        assertThat(FizzBuzz.fizzbuzz(4)).isEqualTo("4");
    }
}
