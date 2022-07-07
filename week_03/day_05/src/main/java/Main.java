import generics.Box;
import generics.BoxGeneric;

public class Main {

    public static void main(String[] args){
        Box box = new Box("sentence");
        //I passed in a string but got back an Object
        //type-safety issue

        //Old-fashioned, lazy approach: typecast it to a String
        String myString = (String) box.getData();
        System.out.println(myString.charAt(4));

        //much better to a generic to specify the type of the property
        //at construction of the object (when we use the 'new' keyword)
        BoxGeneric<String> boxGeneric = new BoxGeneric<>("our first String value");
        boxGeneric.setData("Our updated string value");
        String myOtherString = boxGeneric.getData();
        System.out.println(myOtherString);

    }
}
