package assaignment05.java.abstraction;

public class AbstracTest {
    public static void main(String[] args) {
        User us ;

        us = new  RahimUser();
        us.sendtext();
        us.textsending();
        us=new KarimUser();
        us.sendtext();
    }

}
