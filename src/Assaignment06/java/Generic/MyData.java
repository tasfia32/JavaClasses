package Assaignment06.java.Generic;

public class MyData <T>{
    T data;
    public MyData(T data){
        this.data=data;
    }
    public T getData(){
        return data;
    }
}
