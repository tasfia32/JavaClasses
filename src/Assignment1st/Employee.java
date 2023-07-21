package Assignment1st;

import javax.naming.Name;

public class Employee {

      public  static  String work="do testing";



   static  void getName(){
        String name= "joy";
        System.out.println("hi"+ "My Name is" +  name);
    }

    public static void main(String[] args) {
        getName();
        System.out.println(Employee.work);
        Student student1=new Student();
        student1.name="ruma";
        student1.roll=11;

        System.out.println("Name: "+student1.name);
        System.out.println("roll: "+student1.roll);
    }


}
