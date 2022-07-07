import java.util.ArrayList;

public class Gallery {

    private String name;
    private ArrayList<Artwork> artworks;
    private double till;

    public Gallery(String name){
        this.name = name;
        this.artworks = new ArrayList<Artwork>();
        this.till = 0;
    }

    public double getTill(){
        return this.till;
    }

    public void addArtwork(Artwork artwork){
        this.artworks.add(artwork);
    }

    public ArrayList<Artwork> getArtworks(){
        return this.artworks;
    }

    public void setTill(double amount){
        this.till = amount;
    }
}
