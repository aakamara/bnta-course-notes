public class Cat extends Animal {

    private String name;
    private int age;

    public Cat(String name, int age){
        super(name, age); //to create a super class
    }

    /* public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    } */

    public String meow(){
        return "meow"; //returning a string
    }

}
