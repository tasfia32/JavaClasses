package Assaignment06.java.GenericWildcard;

public class MainWildCard {
    public static void main(String[] args) {
        Datatype<Integer> datatype = new Datatype<Integer>(50);
        System.out.println(datatype.getWildCard());
        Datatype<Double> datatype1 = new Datatype<Double>(20.50);
        System.out.println(datatype1.getWildCard());
    }
}
