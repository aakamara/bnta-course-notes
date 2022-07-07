import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class NPCTest {
    private NPC npc;

    @BeforeEach
    public void setUp(){
        npc = new NPC(Emotion.ANGRY);
    }

    @Test
    public void canGetEmotion100(){
        for(int i = 0; i < 20; i++){
            assertThat(npc.tryGetEmotion(100)).isNotNull();
        }
    }

    @Test
    public void cannotGetEmotion0(){
        for(int i = 0; i < 20; i++){
            assertThat(npc.tryGetEmotion(0)).isNull();
        }
    }
}
