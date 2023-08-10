package Assainment03part1;

public class Foreachloop {
    public static void main(String[] args) {
        String name[]={"titu","mitu","giyu"};
        int roll[]={11,02,30};
        double mark[]={75,90.5,55.6};



        for(String S: name){
            System.out.println("the Student  Name="+ S);
        }
        System.out.println("========================");
        for(int a: roll){
            System.out.println("the Roll Number="+ a);

        }
        System.out.println("======================");
        for(double d: mark){
            System.out.println("the mark is=" + d);
        }

    }
}
