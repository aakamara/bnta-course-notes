package tasks;

import castles.Castle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import players.Plumber;
import players.Wizard;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CastleTest {

    private Castle castle;

    @BeforeEach
    public void setUp(){
        castle = new Castle();
        castle.addPrincess(new Plumber("Mario", 30, 400, castle));
        castle.addPrincess(new Plumber("Luigi", 100, 150, castle));
        castle.addPrincess(new Wizard("Toad", 400, 10000, castle));
    }

    @Test
    public void addsRoyal(){
        assertThat(castle.getRoyal().size()).isEqualTo(3);
    }

}
