package castles;

import players.Princess;
import tasks.PlumberTask;
import tasks.WizardTask;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Castle {

    List<Princess> royal;
    protected LinkedList<WizardTask> wizardBacklog = new LinkedList<>();
    protected LinkedList<PlumberTask> plumberBacklog = new LinkedList<>();

    public Castle(){
        royal = new ArrayList<>();
    }

    public void addPrincess(Princess princess) {
        this.royal.add(princess);
    }

    public List<Princess> getRoyal(){
        return this.royal;
    }

    public LinkedList<PlumberTask> getPlumberBacklog() {
        return plumberBacklog;
    }

    public LinkedList<WizardTask> getWizardBacklog() {
        return wizardBacklog;
    }
}
