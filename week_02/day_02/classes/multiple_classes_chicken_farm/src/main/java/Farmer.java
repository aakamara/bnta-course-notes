public class Farmer {

    private String name;
    private int collectedEggs;

    public Farmer(String name){
        this.name = name;
        this.collectedEggs = 0;
    }

    public String getName(){
        return this.name;
    }

    public int getCollectedEggs(){
        return this.collectedEggs;
    }

    public void collectEggs(Farm farm){
        // loop through the chickens on the farm
        // get number of eggs laid
        // add eggs to farmer's collected eggs
        // set all chicken eggs to 0
        int totalEggs = 0;
        for(Chicken chicken : farm.getChickens()){
            totalEggs += chicken.getEggs();
            chicken.setEggs(0);
        }
        this.collectedEggs = totalEggs;
    }

}
