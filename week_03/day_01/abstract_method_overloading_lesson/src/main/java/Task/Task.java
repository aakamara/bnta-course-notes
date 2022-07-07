package Task;

public class Task {
    String description;
    boolean isComplete;

    Task(String description){
        this.description = description;
        this.isComplete = false;
    }

    public String getDescription(){
        return this.description;
    }

    public boolean getIsComplete(){
        return this.isComplete;
    }

    public void setIsComplete(boolean complete) {
        isComplete = complete;
    }
}
