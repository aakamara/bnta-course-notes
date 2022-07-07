package com.bnta;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AlgorithmExample alg = new AlgorithmExample();
        System.out.println(alg.factorial(6));
        alg.printFactorial(4);

        alg.logTimeExample(new int []{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20});

        //true
        System.out.println(alg.hasDuplicateNaive(new int[]{3, 4, 5, 8, 6, 1, 3, 2}));

        //false
        System.out.println(alg.hasDuplicateNaive(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));


    }
}
