import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculatorTest {
    private Calculator calc;

    //the 'setup' method will run for every test in this file
    //can be used as a reset
    @BeforeEach
    public void setup(){
        calc = new Calculator();
    }
    @Test
    public void shouldAdd(){
        assertThat(calc.add(8, 20)).isEqualTo(28);
    }
    @Test
    public void shouldSubtract(){
        assertThat(calc.subtract(10, 4)).isEqualTo(6);
    }
    @Test
    public void shouldMultiply(){ //asserting the actual results
        assertThat(calc.multiply(10, 10)).isEqualTo(100);
        assertThat(calc.multiply(10, 10)).isGreaterThan(100);
        assertThat(calc.multiply(5, 5)).isEqualTo(25);
    }
    @Test
    public void shouldDivide(){
        assertThat(calc.divide(50, 2)).isEqualTo(25);
    }
}
