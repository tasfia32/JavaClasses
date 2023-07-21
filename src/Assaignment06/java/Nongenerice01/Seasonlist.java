package Assaignment06.java.Nongenerice01;

import java.lang.management.ManagementFactory;

public class Seasonlist {
    public static void main(String[] args) {
Winter winter=new Winter(25);
        System.out.println(winter.getDuration());
        Summer summer=new Summer(10,"mango");
        System.out.println(summer.getFruitname());
        System.out.println(summer.getAnInt());
        Spring spring=new Spring('K');
        System.out.println("Spring is the king of season:" + spring.getCharacter());

    }

}
