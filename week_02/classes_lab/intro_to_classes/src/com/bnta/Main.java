package com.bnta;
import com.bnta.farm.Farm;
import com.bnta.farm.animals.Horse;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(Farm.class);

        Farm farm1 = new Farm("Happy Hills Farm", 205.4);
        Farm farm2 = new Farm("Chuckling Pigs Farm", 104.6);
        Farm farm3 = new Farm("Jumping Carrots Farm", 32.3);

        farm1.addHorse(new Horse("Mr Ed", 4, 2.2));
        farm1.addHorse(new Horse("Buttercup", 3, 1.7));
        farm2.addHorse(new Horse("Squiggles", 2, 3.4));

        System.out.println(farm1.getHorses());
        System.out.println(Horse.horses); //list of every horse created
        System.out.println(farm1);
        /*
        Horse horse = new Horse("Mr Ed", 4, 2);
        System.out.println(horse.getName());
        System.out.println(horse.getAge());
        horse.setHeight(2.5);
        System.out.println(horse.getHeight());
         */

        //Setters and getters can be retrieved or changed after setting the values

        /*
        if(farm1.equals(farm4)) { // doing == with say they are different because of memory addresses
            System.out.println("They're the same farms!");
        } else {
            System.out.println("They're different farms!");
        }
// .equals() will say they are the same as they would have the same string value
        int a = 5;
        int b = 5;
        if(a == b) {
            System.out.println("They're equal!");
        } else {
            System.out.println("They're not equal!");
        }
        //primatives are compared by value

        String person1 = new String("Jack");
        String person2 = new String("Jack");

        //new is the new keyword

        if(person1 == person2) { // they are reference variables not a value - a new memory address
            System.out.println("same names!");
        } else {
            System.out.println("different names!");
        }
        //It will print different names because string comparison [review]
        //even though they are the sam, but they are reference variables which point to different memory addresses
        // new key word creates new memory address, even if they are objects
        //created to have identical values. Hence, == will return false for
        //reference variables which point to different objects

        //to check for 'value' equality, use equals() method. NOTE: this will only work
        //if you IMPLEMENT the toString(), equals(), hashCode() methods
        //This can be done easily with IntelliJ code generation
        System.out.println("-- comparison with equals() method --");
        if(person1.equals(person2)) {
            System.out.println("same values!");
        } else {
            System.out.println("different values!");
        }

        //anything created from a class is a reference type
        // anything created from a primative is a reference type

        System.out.println(Farm.farms);
        System.out.println(farm1.getName());
        //a getter is something to return a value
        System.out.println(farm3.getName()); */
    }
}
