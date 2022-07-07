import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;
    Artist vanGogh;
    Artwork sunflowers;

    @BeforeEach
    public void setUp(){
        customer = new Customer("John Doe", 2000);

        vanGogh = new Artist("Van Gogh");
        sunflowers = new Artwork("Sunflowers", vanGogh, 1000, 766);
    }

    @Test
    public void canAffordArtwork_true(){
        assertThat(customer.canBuy(sunflowers)).isEqualTo(true);
    }

   /* @Test
    public void customerArtworkCountStartsEmpty(){
        assertThat(customer.getArtworkCount()).isEqualTo(0);
    } */

    @Test
    public void canBuyArtwork(){
        customer.buyArtwork(sunflowers);
        assertThat(customer.getWallet()).isEqualTo(1000);
        //assertThat(customer.getArtworkCount()).isEqualTo(1);
    }

    @Test
    public void hasName(){
        assertThat(customer.getName()).isEqualTo("John Doe");
    }

    @Test
    public void hasWallet(){
        assertThat(customer.getWallet()).isEqualTo(2000);
    }

}
