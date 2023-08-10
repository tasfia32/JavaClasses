package Assaignment06.java.interfacepart2;

public interface CustomisedMethod {

    abstract void abstractMethod();
      static void staticMethod(){
privateStaticeMethod();
          System.out.println("this method is Static");

    }
    private static void privateStaticeMethod(){
        System.out.println("privatestatic");
    }
     default  void defaultMethod(){
privateMethod();
        System.out.println("this is default method");
    }



    private void privateMethod(){
        System.out.println("this is private");
    }
}
