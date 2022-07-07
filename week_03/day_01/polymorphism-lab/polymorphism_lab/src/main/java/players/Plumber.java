package players;

import castles.Castle;
import tasks.Task;

public class Plumber extends Princess {

    public Plumber(String name, double gold, int netWorth, Castle castle){
        super(name, gold, netWorth, castle);
    }

    @Override
    public Task work(){
        Task task = this.princesses.getPlumberBacklog().pop();
        System.out.println(task.getDescription());
        task.setIsComplete(true);
        return task;
    }

    @Override
    public Task work(Task task){
        System.out.println(task.getDescription());
        task.setIsComplete(true);
        return task;
    }

}
