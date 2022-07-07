import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FarmerTest {

    Farmer farmer;
    Farm farm;
    Chicken ginger;
    Chicken edwina;

    @BeforeEach
    public void setUp(){
        farmer = new Farmer("Helen");
        farm = new Farm("Tweedsdale");
        ginger = new Chicken("Ginger", 3);
        edwina = new Chicken("Edwina", 2);
        farm.addChicken(ginger);
        farm.addChicken(edwina);
    }

    @Test
    public void farmerHasName(){
        assertThat(farmer.getName()).isEqualTo("Helen");
    }

    @Test
    public void canGetCollectedEggs(){
        assertThat(farmer.getCollectedEggs()).isEqualTo(0);
    }

    @Test
    public void canCollectEggs(){
        farmer.collectEggs(farm);
        assertThat(farmer.getCollectedEggs()).isEqualTo(5);
    }

}
