package assaignment05.java.polymorphism;

public class TestClass {
    public static void main(String[] args) {
        BankOverride bank= new BankOverride();
        IFICBank bank2=new IFICBank();
        SJIBLBank bank3=new SJIBLBank();
        bank3.rateOfInterest(63);
        bank2.rateOfInterest(13);
        bank.rateOfInterest(12);


    }
}
