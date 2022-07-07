package com.bnta;

import java.util.ArrayList;

public class AlgorithmExample {

    //Linear time (Factorial)
    //factorial (n!) is the product of a number, and all smaller positive numbers
    public int factorial (int n){
        int result = 1;
        while(n > 1){
                result = n * result;
                n--;
        }
        return result;
    }

    public void printFactorial(int n){
        System.out.println("factorial of " + n + ": " + factorial(n));
    }

    //Big O(1) or 'constant time'
    public int add(int a, int b){
        return a + b;
    }

    //logarithms time, Big O(log N)
    public void logTimeExample(int[] nums){
        System.out.println("Log N example start:");
        for(int i = nums.length - 1; i > 0; i /= 2){
            System.out.println(i);
            if(i == 0) break;
        }
        System.out.println("Log N example finished");
    }

    //Big O(n2) or 'quadratic time'
    //naive solution -> the most obvious solution, but not the most optimal
    //space complexity
    public boolean hasDuplicateNaive(int[] arr){
        //in the parent loop, we loop through every element in the array
        for(int i = 0; i < arr.length; i++){
            // in our child loop, we loop through every element again
            for(int other = arr.length - 1; other >= 0; other --){
                //skip if index is same
                if(i == other) continue;
                else if(arr[i] == arr[other]){
                    return true;
                }
            }
        }
        return false;
    }

    // a more optimal solution
    //space complexity is BigO(n)
    public boolean hasDuplicate(Integer[] arr){
        ArrayList<Integer> set = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            if(set.contains(arr[i])) return true;
            else set.add(arr[i]);
        }
        return false;
    }

    // dominant term
    public void multipleTerms(int[] arr){
        //constant time calculation - O(1)
        //it is constant time, because it performs the same
        //number of operations irrespective of input
        var constantResult = 4 * 3 +(3 - (9/2));

        //1D (linear) loop - O(n)
        for(int i = 0; i < arr.length; i++){
            System.out.println("linear loop at " + 1);
        }

        //2D (quadratic) loop - O(n2)
        for (int i = 0; i < arr.length; i++){
            for(int other = arr.length - 1; other >= 0; other --){
                System.out.println("quadratic loop at " + i + ", " + other);
            }
        }
    }

}
