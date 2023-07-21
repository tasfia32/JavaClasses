package Assaignment06.java.GenericWildcard;

public class Datatype < T extends Number > {
    private T wildCard;

    public Datatype(T wildCard) {
        this.wildCard = wildCard;
    }

    public T getWildCard() {
        return wildCard;
    }

}





