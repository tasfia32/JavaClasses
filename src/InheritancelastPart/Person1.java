package InheritancelastPart;

public class Person1 {
    void behavior(){
        String name="human";

        System.out.println("Hi I am the behavior of Person, My Name is "+ name );
    }

    public static void main(String[] args) {
        Employee worker=new Employee();
        Retired retired=new Retired();
        Student student=new Student();
        worker.behavior();
        retired.behavior();
        student.behavior();
    }

}





