package generics;

public class BoxGeneric <T> {
    private T data;

    //constructor
    public BoxGeneric(T data){
        this.data = data;
    }

    //setters and getters

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
