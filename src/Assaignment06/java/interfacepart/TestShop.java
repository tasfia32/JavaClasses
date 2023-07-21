package Assaignment06.java.interfacepart;

public class TestShop {
    public static void main(String[] args) {
        Chocolateshop chocolateshop=new Chocolateshop();

        System.out.println("the number of Chocolat:"+ chocolateshop.sellChocolate());
        System.out.println( " the number of Cake :"+ chocolateshop.sellCake());

    }
}
