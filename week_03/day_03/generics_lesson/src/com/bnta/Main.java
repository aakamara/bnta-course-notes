package com.bnta;
import com.bnta.log.Logger; // with just this it is class.print(); -- Logger.print();
//import static com.bnta.log.Logger.print;


public class Main {

    public static void main(String[] args) {
        //log("say something");
        //log("some other string");

        //logging a boolean will not work or an int -- generics solve

        //with class generics, each object you create can only accept one
        //type. you specify the type on creation of the object
        Logger<String> logger = new Logger<>();
        logger.log("some message");

        //int is a core data type
        //Integer is a wrapper for the 'int'
        Logger<Integer> intLogger = new Logger<>();
        intLogger.log(43);

        Logger.print(45);
        Logger.print(true);
        Logger.print("Hamster");
        //cannot accept primatives as there is a wrapper class -- the boolean --

        // intLogger.print(4); ideally don't use it just an example
    }
}
