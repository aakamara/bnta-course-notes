import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Tiree");
        scottishIslands.add("Jura");
        scottishIslands.add("Islay");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");
        scottishIslands.add("Coll");

        System.out.println(scottishIslands.get(4));

        scottishIslands.remove(5);
        scottishIslands.remove("Tresco");

        System.out.println(scottishIslands.size());

        Collections.sort(scottishIslands);
        for (String i : scottishIslands) {
            System.out.println(i);
        }

//        1. Add "Coll" to the end of the list Y

//        2. Add "Tiree" to the start of the list Y
        scottishIslands.add(0, "Tiree");

//        3. Add "Islay" after "Jura" and before "Mull" Y
        scottishIslands.add(2, "Islay");

//        4. Print out the index position of "Skye" ?
        int skyeIndex = scottishIslands.indexOf("Skye");

        System.out.println("Skye index: " + skyeIndex);

//        5. Remove "Tresco" from the list by name Y
        scottishIslands.remove("Tresco");

//        6. Remove "Arran" from the list by index Y
        scottishIslands.remove(5);

//        7. Print the number of islands in your arraylist Y
        System.out.println(scottishIslands.size());

//        8. Sort the list alphabetically Y
        Collections.sort(scottishIslands);

//        9. Print out all the islands using a for loop Y
           /* for(int i = 0; i < scottishIslands.size(); i++){ System.out.println(scottishIslands.get(i));}
            for(String island : scottishIslands) { System.out.println(scottishIslands.get(i));} */


        System.out.println(scottishIslands);
        System.out.println("----Finish Scetion 1----");

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);
        Collections.sort(numbers);


        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers ?
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers) {
            if ((number % 2) == 0) {
                evenNumbers.add(number);
                System.out.println(evenNumbers);
            }

//        2. Print the difference between the largest and smallest value
            /* Collections.sort(numbers);
            System.out.println(numbers.get((numbers.size() -1) - (numbers.get(0)));

            int maxNumber = Collections.max(numbers);
            int minNumber = Collections.min(numbers);
            System.out.println(maxNumber - minNumber);
*/

//        3. Print true if the list contains a 1 next to a 1 somewhere
        /*  boolean isContains = false;
            for (int i = 0; i < numbers.size() - 1; i++) {
                if(numbers.get(i) == 1 && numbers.get(i+1) == 1) {
                   isContains = true;
                   System.out.println("true")
                   }
                  }
         */

//        4. Print the sum of the numbers
        /* int sum =0;
            for(int i = 0; i < numbers.size(); i++){
            sum +=numbers.get(i);
            }
            System.out.println(sum);
         */
//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count
//          HINT - You will need to track the index throughout the loop
//
//          So [7, 13, 2] would have sum of 9.

        /* int sum2 = 0;
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i)!= 13) {
                    sum2 = sum2 + numbers.get(i);
                    } else { i++;
                                }
                }
              System.out.println(sum2);
         */
            // check whether a number is 13
            //if tracking the index, that if I hit 13, stop incrementing the index
        /* int total = 0;
        System.out.println("actual numbers: " + numbers);
            for(int number : numbers) {
                if (number == 13) {
                    break;
                    }
                        total += number;
                   System.out.println(total);
             }
         */

        }
    }

}