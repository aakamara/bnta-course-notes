import java.util.ArrayList;
import java.util.List;

public class ArrayPractice {
    private List<String> names =new ArrayList<>();

    public int[] returnFiveIntegerArray(){
        int[] nums = {1, 6, 2, 4, 9};
        return nums;
    }

    public List<String> getNames(){
        return names;
    }

    public void addName(String name){
        names.add(name);
    }

    public void removeName(String name){
        for(String n : names){
            if(n.equals(name)){
                names.remove(names.indexOf(n)); //provide a reference form the index
                return; //we have found a name, so we have to return it
            }
        }
    }

}
