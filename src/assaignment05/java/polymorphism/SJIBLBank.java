package assaignment05.java.polymorphism;

public class SJIBLBank extends BankOverride {
    @Override
    void rateOfInterest(int a) {
        System.out.println("The Rate of Interest :"+ a);

    }
}
