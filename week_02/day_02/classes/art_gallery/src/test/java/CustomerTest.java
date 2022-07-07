import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    Customer customer;

    @BeforeEach
    public void setUp(){
    customer = new Customer("Mark", 100);
    }

    @Test
    public void hasName(){

        assertThat(customer.getName()).isEqualTo("Mark");
    }

    @Test
    public void canGetWallet(){

        assertThat(customer.getWallet()).isEqualTo(100);
    }

}
