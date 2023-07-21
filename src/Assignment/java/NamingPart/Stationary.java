package Assignment.java.NamingPart;

public interface Stationary {

        void write();


        class Pan implements Stationary {
            public void write(){
                System.out.println("you can write with pan");
            }
        }
        class Pancil implements Stationary {
            public void write(){
                System.out.println("Pancil is use for drawing");
            }
        }
        class Maintest{
            public static void main(String[] args) {
                Stationary pen= new Pan();
                Stationary pancil= new Pancil();
                pen.write();
                pancil.write();
            }
        }

    }


