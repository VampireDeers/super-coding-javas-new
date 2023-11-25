package chapter1_23;

public class InstanceTest {

    public static void main(String[] args){
        // 학생 생성
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();

        student1.name = "Tom";
        student1.gender = "Male";
        student1.studentNumber = 15;

        System.out.println(student1.name);
        System.out.println(student1.gender);
        System.out.println(student1.studentNumber);


        Teacher teacher = new Teacher();

        teacher.name = "Alice";
        teacher.gender = "Female";
        teacher.subject = new Subject("English", "AB002");

        System.out.println(teacher.name);
        System.out.println(teacher.gender);
        System.out.println(teacher.subject);
    }
}
