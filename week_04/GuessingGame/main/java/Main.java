

public class Main{

    public static void main(String[] args) {


        //scanner.nextLine();
        //programme won't finish running as it will be waiting for another command
        //you also have a cursors to implement an input
        //scanner enables use to put the input


        //int userGuess = scanner.nextInt();
        //it will only pass through an int not a string
        //Random rand = new Random();
        //a variable name
        //int secretNumber = rand.nextInt(1, 101);
        //will give us 1 but will not give us 101

        GuessingGame guessingGame = new GuessingGame();
        guessingGame.start();
        //putting the while loop around the if statement will make it have a continuous loop
        //without breaks


    }
}
