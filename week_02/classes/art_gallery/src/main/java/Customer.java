import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private double wallet;
    private ArrayList<Artwork> customerArtwork;

    public Customer(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
        this.customerArtwork = new ArrayList<Artwork>();
    }

    public String getName(){
        return this.name;
    }

    public double getWallet(){
        return this.wallet;
    }

    public List<Artwork> customerArtwork(){
        return this.artworks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public ArrayList<Artwork> getCustomerArtwork() {
        return customerArtwork;
    }

    /* @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", wallet=" + wallet +
                ", customerArtwork=" + customerArtwork +
                '}';
    }

    public void setCustomerArtwork(ArrayList<Artwork> customerArtwork) {
        this.customerArtwork = customerArtwork;

    } */
    // public void setWallet(double amount){ this.wallet = amount;}


}
