public class Looping {

        public String getOneToTen(){
            String result = "";
            for(int i = 1; i <=10; i++) { //defining the loop with a for loop
                result = result + i; //ends up with a string that we want
            }
            return result; //returning that varibale
        }
}
