import java.util.ArrayList;

public class Dog {
    //creating attributes
    private String eyeColour;
    private String furColour;
    private ArrayList<String> ailments;
    private String name;

    //the class file is generic
    //constructor
    public Dog(String eyeColour, String furColour, String name){
        this.eyeColour = eyeColour;
        this.furColour = furColour;
        this.ailments = new ArrayList<>();
        this.name = name;
    }

    public String eat(String snack){
        return "dog is eating" + snack;
    }

    public void addAilments(String newAilment){
        this.ailments.add(newAilment);
    }

    public int ailmentCount(){
        return this.ailments.size();
    }

    public String bark(){ //a behaviour inside of the dog object
        return "woof"; //this behaviour will become part of the object
    }


    //class is not for creating new objects
    //just the attributes of all the dogs

    //press 'command' + 'N' to get options to implement getters and setters
    public String getEyeColour() {
        return this.eyeColour; //not talking about the data put into the constructor
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public String getFurColour() {
        return this.furColour;
    }

    public void setFurColour(String furColour) {
        this.furColour = furColour;
    }

    public ArrayList<String> getAilments() {
        return this.ailments;
    }

    public void setAilments(ArrayList<String> ailments) {
        this.ailments = ailments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
