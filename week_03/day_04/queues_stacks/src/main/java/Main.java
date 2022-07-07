import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        // -- stack --

        Stack<String> books = new Stack<>();
        books.push("Matilda");
        books.add("Peter Pan");
        books.add("Mary Poppins");

        books.pop();

        //System.out.println(books.peek());
        // System.out.println(books.empty());
        // System.out.println(books.search("Matilda"));
        // System.out.println(books);

        // -- queue --


        Queue<String> people = new LinkedList<>();

        people.add("Anna");
        people.add("Richard");
        people.add("Collin");

        people.offer("Lucas");
        people.poll();
        System.out.println(people.contains("Colin"));

        System.out.println(people);

        System.out.println(people.peek()); //returns the first value

    }
}
