import java.io.*;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    private Scanner scanner;
    private int secretNumber;
    private boolean guessedCorrectly;

    public GuessingGame(){
        this.scanner = new Scanner(System.in);
        //this.secretNumber = new Random().nextInt(1, 101);
    }

    private void generateNumbers() throws IOException{
        File file = new File("src/number.text");
        if (!file.exists()){
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter);

       Random rand = new Random();
        for (int i = 0; i < 50; i++){
            printWriter.println(rand.nextInt(1, 101));
        }
        printWriter.close();

    }

    public void start(){

        try{
            generateNumbers();
        } catch (IOException exception){
            exception.printStackTrace();
        }

       File numberFile = new File("src/numbers.txt");

        try{
            Scanner fileScanner = new Scanner(numberFile);
            this.secretNumber = fileScanner.nextInt();
        } catch (FileNotFoundException exception){
            System.out.println("can't find file");
        }


        System.out.println("Enter your name:");

        String userName = scanner.nextLine();

        System.out.println("Welcome to the game, " + userName + "!");

        this.guessedCorrectly = false;

        while (!guessedCorrectly){
            promptUser();

        }
    }


    public void promptUser(){
        System.out.println("Guess a number between 1 and 100:");

        /* int userGuess = 0;

        try{
            userGuess = scanner.nextInt();
            //this will break if there's a boolean or text
        } catch (InputMismatchException exception){
            System.out.println("please enter a number");
        } */

        int userGuess = scanner.nextInt();

        if (secretNumber == userGuess) {
            System.out.println("Congratulations, you guessed correctly!");
            guessedCorrectly = true;
        } else if (secretNumber < userGuess) {
            System.out.println("Too high!");
        } else {
            System.out.println("Too low!");
        }
    }

}
