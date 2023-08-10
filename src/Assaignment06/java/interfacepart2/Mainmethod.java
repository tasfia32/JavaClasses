package Assaignment06.java.interfacepart2;

public class Mainmethod implements CustomisedMethod{
    public static void main(String[] args) {
        CustomisedMethod customisedMethod =new Mainmethod();
        customisedMethod.defaultMethod();
        customisedMethod.abstractMethod();
        CustomisedMethod.staticMethod();






    }

    @Override
    public void abstractMethod() {
        System.out.println("print abstract method");

    }
}
