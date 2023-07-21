package Assainment03part1;

public class Continueloop {

    public static void main(String[] args) {
        int a=10;
        while (a<=15){
            if (a==13){
                a++;
                continue;
            }

            System.out.println(a);
            a++;

        }
    }
}
