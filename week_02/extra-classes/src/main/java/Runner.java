import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        List<String> students = new ArrayList<>();
        //There is no syntax for an arraylist, so we use a method called add
        students.add("Anna");
        students.add("Colin");
        students.add("Richard");
        students.add("Lucasz");
        // typing sout will auto do this function
        System.out.println(students);

        // Enhanced for loop

        for(String student : students) {
            System.out.println(student);
        }

        // Classic for loop

        System.out.println("--classic for loop--");
        for( int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));

            //control + shift + R for running the code
            //control + shift + D for debugging the code
        }

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        System.out.println("all numbers:" + numbers);

        for(int i = 0; i < numbers.size(); i+=2){
            //+=2 is a shorthand for increment by 2 and resigning it back to i
            System.out.println(numbers.get(i));
            //prints out the odd numbers only
        }


    }
}
