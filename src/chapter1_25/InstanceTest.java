package chapter1_25;

public class InstanceTest {

    public static void main(String[] args) {
        Student student1 = new Student();

        System.out.println(student1.getName());
        System.out.println(student1.getGender());
        System.out.println(student1.getStudentNumber());

        student1.setName("Tom");
        student1.setGender("Male");
        student1.setStudentNumber(15);

        System.out.println(student1.getName());
        System.out.println(student1.getGender());
        System.out.println(student1.getStudentNumber());

        Teacher teacher = new Teacher();

        System.out.println(teacher.getName());
        System.out.println(teacher.getGender());
        System.out.println(teacher.getSubject());

        teacher.setName("Alice");
        teacher.setGender("Female");
        teacher.setSubject(new Subject("English", "112"));

        System.out.println(teacher.getName());
        System.out.println(teacher.getGender());
        System.out.println(teacher.getSubject());
    }
}
