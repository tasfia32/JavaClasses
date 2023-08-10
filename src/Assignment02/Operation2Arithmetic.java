package Assignment02;

public class Operation2Arithmetic {

    public static void main(String[] args) {
        int number1= 10;
        int number2= 65;

        int sum=  number1 + number2;
        System.out.println("Sum =:" + sum);


        int number3=41;
        int number4=sum;
        int sub= number4-number3;
        System.out.println( "sub =: " + sub);

        int number6=sub;
        int number7=5;
        int  multi= number6 * number7;
        System.out.println("multi =:"+ multi);

        int  division = sum /number7;
        System.out.println("divison =:" + division);

        int  modulus = division % number1;
        System.out.println("modulus =:"+ modulus);



    }
}
