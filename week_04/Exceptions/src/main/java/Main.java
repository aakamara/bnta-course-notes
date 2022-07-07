public class Main {
    public static void main(String[] args) {

       /* try {
            ExceptionsPlayground.doSomething();
        } catch (Exception exception) {
            System.out.println("Something went wrong!");
        } */
        try{
            ExceptionsPlayground.compareNumbers(4,4);
        } catch (Exception exception){
            System.out.println("exception thrown");
            System.out.println(exception.getMessage());
            exception.printStackTrace();
            //useful method to have with exceptions
            //gives us the red text of what happened and where
            //it is coming from
        }
    }
}
