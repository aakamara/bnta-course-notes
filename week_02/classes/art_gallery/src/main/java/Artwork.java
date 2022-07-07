public class Artwork {
    private String title;
    private String artist;
    private double price;
    private double nft;

    public Artwork(String title, String artist, double price, double nft){
        this.title = title;
        this.artist = artist;
        this.price = 0;
        this.nft = 0;
    }

    public String getTitle(){
        return this.title;
    }

    public String getArtist(){
        return this.artist;
    }

   public double getPrice(){
        return this.price;
   }
   public void setPrice(double amount){
        this.price = amount;
   }

   public double getNft(){
        return this.nft;
   }
   public void setNft(double amount){
        this.nft = amount;
   }


}
