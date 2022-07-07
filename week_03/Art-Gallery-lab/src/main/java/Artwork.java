import java.util.Random;

public class Artwork {

    private String title;
    private Artist artist;
    private double price;
    private int nft;

    //constructor
    public Artwork(String title, Artist artist, double price, int nft) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.nft = nft;
    }


    //getters & setters

    /* public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNft(int nft) {
        this.nft = nft;
    }

    */

    public String getTitle() {
        return title;
    }

    public Artist getArtist() {
        return artist;
    }

    public double getPrice() {
        return price;
    }

    public int getNft() {
        return nft;
    }

}
