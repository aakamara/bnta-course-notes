package players;

import castles.Castle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tasks.PlumberTask;
import tasks.Task;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PlumberTest {

    private Plumber pp;

    @BeforeEach
    public void setUp(){
        Castle castle = new Castle();
        pp = new Plumber("Mario",60,1200, castle);

        castle.getPlumberBacklog().add(new PlumberTask("Defeat angry mushrooms"));
        castle.getPlumberBacklog().add(new PlumberTask("Grab 50 gold coins"));
        castle.getPlumberBacklog().add(new PlumberTask("Save Princess Peach"));
    }

    @Test
    public void canPullTask(){
        pp.work();
        assertThat(pp.princesses.getPlumberBacklog().size()).isEqualTo(2);
    }

}
