import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FarmTest {

    Farm farm;
    Chicken ginger;

    @BeforeEach
    public void setUp(){
        farm = new Farm("Tweedsdale");
        ginger = new Chicken("Ginger", 3);
    }

    @Test
    public void canGetEggsForSale(){
        assertThat(farm.getEggsForSale()).isEqualTo(0);
    }

    @Test
    public void canAddChickenToFarm(){
        farm.addChicken(ginger);
        assertThat(farm.getChickens().size()).isEqualTo(1);
    }

    @Test
    public void canSetEggsForSale(){
        farm.setEggsForSale(3);
        assertThat(farm.getEggsForSale()).isEqualTo(3);
    }

}
