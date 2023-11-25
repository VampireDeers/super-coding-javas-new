package chapter1_26;

public class StaticTest2 {

    public static void main(String[] args){
        // Student
        int num = Student.getSerialNum();
        Student.setSerialNum(10);
        Student student = new Student();

        System.out.println(num);
        // static
    }
}
