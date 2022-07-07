import java.util.ArrayList;

public class Farm {

    private String name;
    private ArrayList<Chicken> chickens;
    private int eggsForSale;

    public Farm(String name){
        this.name = name;
        this.chickens = new ArrayList<Chicken>();
        this.eggsForSale = 0;
    }

    public int getEggsForSale(){
        return this.eggsForSale;
    }

    public void addChicken(Chicken chicken){
        this.chickens.add(chicken);
    }

    public ArrayList<Chicken> getChickens(){
        return this.chickens;
    }

    public void setEggsForSale(int amount){
        this.eggsForSale = amount;
    }


}
