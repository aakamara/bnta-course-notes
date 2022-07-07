public class Dog extends Animal {

    private String name;
    private int age;
    private boolean isWorkingBreed;


    public Dog(String name, int age, boolean isWorkingBreed){
        super(name, age);
        this.isWorkingBreed = isWorkingBreed;
    }

    /* public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    } */

    public boolean getIsWorkingBreed(){
        return this.isWorkingBreed;
    }

    public String bark(){
        return "woof"; //its own type of variable
    }

}
