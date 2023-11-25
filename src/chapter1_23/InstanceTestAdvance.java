package chapter1_23;

public class InstanceTestAdvance {

    public static void main(String[] args){
        Student student1 = new Student(1, 3, 20, "Bob", "Male");

        System.out.println(student1.name);
        System.out.println(student1.gender);
        System.out.println(student1.studentNumber);

        Student student2 = new Student(1,3,15,"Stela", "Female");

        System.out.println(student2.name);
        System.out.println(student2.gender);
        System.out.println(student2.studentNumber);


        Teacher teacher = new Teacher("Alice", "Female", "Korean", "AB001");

        System.out.println(teacher.name);
        System.out.println(teacher.gender);
        System.out.println(teacher.subject.subjectName);
        System.out.println(teacher.subject.subjectCode);
    }

}
