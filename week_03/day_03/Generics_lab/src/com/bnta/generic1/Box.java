package com.bnta.generic1;

public class Box<T> { //box can open

    private static boolean canOpen = true;
    public Box(){}

    // ------- INSTANCE method -------------
    public void print(T message) {
        if (canOpen) {
            System.out.println(message);
        }
    }

    // ------- STATIC method ---------------
    public static <Type> void boxes(Type object){ //getter
        if (canOpen) {
            System.out.println(object);
        }
    }

    public static void setCanOpen(boolean canOpen){ //setter
        Box.canOpen = canOpen;
    }
}
