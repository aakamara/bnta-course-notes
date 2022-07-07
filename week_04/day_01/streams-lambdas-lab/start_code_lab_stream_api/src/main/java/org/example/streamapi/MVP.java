package org.example.streamapi;

import org.example.streamapi.model.User;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MVP {

    /*
        Convert a List<String> to an object stream and for each element -> System,out.println.
     */

    public void printNames(List<String> names) {
        // Implement me :)
        //Stream<String> namesStream = namesStream.get();
        //List<String> name = names.stream().map((names) -> getName).collect(Collectors.toList());
        names.stream().forEach(System.out::println);
    }

    /*
        Given a List<Integers>, return a List<Integer> with event numbers.
     */


    public static List<Integer> returnEvenNumbers(List<Integer> numbers) {
        // Implement me :)
        // a predicate is required for filtering out something
        //specific
        /* return numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList()); */
        return numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
           /* return numbers.stream()
                    .filter(evenOnly)
                    .collect(Collectors.toList());*/

        /*List<Integer> evenNums = numbers.stream()
        .filter(num -> nums % 2 == 0)
        .collect(Collectors.toList());

         */
    }

    /*
        Given an int [], double the value of each int and return an int [].
    */
    public int[] doubleInts(int[] numbers) {
        // Implement me :)
        //.count()
        //IntStream stream = Arrays.stream(numbers);
        //int[] doubleNumbers = stream.map(num -> num * 2).toArray();

        //return doubleNumbers;

        return Arrays.stream(numbers).map(num -> num * 2).toArray();

    }

    /*
        Given a String, return a List<String>, all caps.
     */
    public List<String> splitToAllCapsList(String input) {
        // Implement me :)
        //.split()
        return Arrays.stream(input.split(""))
                .map(str -> str.toUpperCase())
                .collect(Collectors.toList());
    }

    /*
    Given a list of animals:
     - filter the ones that start with a given letter
     - return sorted List<String>, all caps.
    */
    public List<String> filterByFirstLetterAndOrder(List<String> list, String letter) {
        // Implement me :)
        //.filter() conditional processing
        //.findFirst
        //list.stream().filter(str -> str.startsWith(letter));
         return list.stream().filter(str -> str.substring(0, 1).equals(letter))
                .sorted().map(str -> str.toUpperCase())
                .collect(Collectors.toList());
    }

    /*
        Given a list of words, return elements that:
         - are shorter than the given number and
         - start with a given letter.
    */
    public List<String> filterWords(List<String> words, int maxLength, String firstLetter) {
        // Implement me :)
        //.filter
        //.reduce
        return words.stream()
                .filter(str -> str.length() < maxLength && str.startsWith(firstLetter))
                .collect(Collectors.toList());
        /* words.stream().filter(str -> str.length() < maxLength && str.startsWith(firstLetter))
                .filter(str -> str.startsWith(firstLetter)) */
    }
}