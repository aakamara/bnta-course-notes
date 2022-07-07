public class Person {
    private String name;

    //constructor

    public Person(String name) {
        this.name = name;
    }

    public String feedPet(Dog dog, String snack){
        dog.eat(snack);
        return this.name + " is feeding " + dog.getName();
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
