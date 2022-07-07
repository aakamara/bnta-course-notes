package players;

import castles.Castle;
import interfaces.IStar;
import tasks.Task;

import java.util.ArrayList;
import java.util.List;

public abstract class Princess implements IStar {

    private String name;
    private double gold;
    private int netWorth;
    protected Castle princesses;
    private List<IStar> stars;

    public Princess(){
        this.stars = new ArrayList<>();
    }

    Princess(String name, double gold, int netWorth, Castle princesses){
        this.name = name;
        this.gold = gold;
        this.netWorth = netWorth;
        this.setPrincesses(princesses);
    }

    public void setPrincesses(Castle castle){
        this.princesses = castle;
    }

    public void addTask(Task task){}

    public abstract Task work();
    public abstract Task work(Task task);

    @Override
    public void callStar(String message){
        for(IStar star : stars){
            star.update(message);
        }
    }

    @Override
    public void addStar(IStar star) {
        this.stars.add(star);
    }

    @Override
    public void removeStar(IStar star) {
        this.stars.remove(star);
    }

}
