package com.bnta.log;

public class Logger<T> {

    private static boolean canDebug = true;

    //a default constructor looks like (no parameters):
    public Logger(){}

    //this is an INSTANCE method
    public void log(T message){
        if(canDebug){
            System.out.println(message);
        }
    }

    //this is a STATIC method - it accepts its OWN generic (Type)
    //and belongs to the CLASS itself
    public static<Type> void print(Type object){
        if(canDebug){
            System.out.println(object);
        }
    }

    public static void setCanDebug(boolean canDebug) {
        Logger.canDebug = canDebug;//to avoid a clash we can add a class name
    }
}
