package Assaignment06.java.interfacepart;

public interface Shop {

    int sellChocolate();

    default int sellCake() {
        return 16;
    }
}
