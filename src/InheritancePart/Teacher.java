package InheritancePart;

public class Teacher extends Person{
    void teacherInformation2(){
        personInformation();
    }




}
class Test {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher. name="Hero Vai";
        teacher.age=32;
        teacher.gendar="Male";
        teacher.teacherInformation2();




    }
}