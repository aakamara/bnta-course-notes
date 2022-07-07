package generics;

public class Box {

    private Object data;
    public Box(Object data){
        this.data = data;
    }

    //getter and setter

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
