
public class ExceptionsPlayground {

    public static void doSomething() throws Exception{
        System.out.println("I'm doing a thing!");
        //static method means you do not have to make an object
    }

    public static void compareNumbers(int num1, int num2) throws Exception{
        if (num1 == num2){
            System.out.println("numbers match!");
        } else{
            throw new Exception("numbers don't match");
        }
    }

}
