package assaignment05.java.Encapsulation;

public class EncapTest {
    public static void main(String[] args) {
        Person p1= new Person();
        p1.setName("tasfia");
        System.out.println("Hi,I am:"+ p1.getName());
        p1.setAge(25);
        System.out.println("my age is :"+ p1.getAge());
    }
}
