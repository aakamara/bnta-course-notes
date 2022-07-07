import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;
    Artist vanGogh;
    Artwork sunflowers;
    Artist leonardoDe;
    Artwork monaLisa;
    Customer customer;

    @BeforeEach
    public void setUp(){
        gallery = new Gallery("Tate Modern");
        vanGogh = new Artist("Van Gogh");
        sunflowers = new Artwork("Sunflowers", vanGogh, 1000, 766);
        leonardoDe = new Artist("Leonardo De");
        monaLisa = new Artwork("Mona Lisa", leonardoDe, 50000, 500);
        gallery.addArtwork(sunflowers);
        gallery.addArtwork(monaLisa);
        customer = new Customer("Luke Skywalker", 20000);
    }

    @Test
    public void galleryCanSellArt(){
        gallery.sellArtwork(customer, sunflowers);
        assertThat(gallery.artworkCount()).isEqualTo(1);
        assertThat(gallery.getTill()).isEqualTo(10000000);
        assertThat(customer.getWallet()).isEqualTo(300000);
        //assertThat(customer.getArtworkCount()).isEqualTo(1);
    }

    @Test
    public void calculateArtValue(){
        double result = gallery.calculateArtworkValue();
        assertThat(result).isEqualTo(600);
    }

    @Test
    public void hasName(){
        assertThat(gallery.getName()).isEqualTo("Tate Modern");
    }

    @Test
    public void tillStartsAtZero(){
        assertThat(gallery.getTill()).isEqualTo(0);
    }
}
