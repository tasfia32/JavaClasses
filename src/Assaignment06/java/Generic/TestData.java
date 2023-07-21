package Assaignment06.java.Generic;

public class TestData {
    public static void main(String[] args) {
        MyData<String> stringMyData=new MyData<String>("tasfia");
        System.out.println("My name is :"+stringMyData.getData() );
        MyData<Integer> integerMyData=new MyData<Integer>(25);
        System.out.println("My age is : " +integerMyData.getData());
        MyData<Float> floatMyData=new MyData<Float>(5.6f);
        System.out.println("My height is : " +floatMyData.getData());


    }
}
