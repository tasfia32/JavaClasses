package assaignment05.java.polymorphism;

public class AdderOverloading {
    void add( int a,int b){
        System.out.println("The sum is "+ (a+b));
    }

  void add(int a, int b,int c){
      System.out.println("The number is: " + a+b+c);
  }
}
class Overloading {
    public static void main(String[] args) {
        AdderOverloading adderOverloading=new AdderOverloading();
        adderOverloading.add(1,2);
        adderOverloading.add(1,11,13);

    }
}
