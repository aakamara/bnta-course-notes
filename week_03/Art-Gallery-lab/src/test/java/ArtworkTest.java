import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    Artist artist;
    Artwork artwork;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Van Gogh");
        artwork = new Artwork("sunflowers", artist, 1000, 766);
    }

    @Test
    public void hasTitle(){
        assertThat(artwork.getTitle()).isEqualTo("sunflowers");
    }

    @Test
    public void hasArtist(){
        assertThat(artwork.getArtist()).isEqualTo(artist);
    }

    @Test
    public void hasPrice(){
        assertThat(artwork.getPrice()).isEqualTo(1000);
    }

    @Test
    public void hasNFT(){
        assertThat(artwork.getNft()).isEqualTo(766);
    }
}
