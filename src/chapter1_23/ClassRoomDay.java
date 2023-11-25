package chapter1_23;

public class ClassRoomDay {

    public static void main(String[] args){
        // 1. 인스턴스 생성
        Student student1 = new Student(1,3,20, "Bob", "Male");
        Student student2 = new Student(1,3,15, "Alice", "FeMale");
        Student student3 = new Student(1,3,30, "Tom", "Male");
        Student student4 = new Student(1,3,23, "Hwang", "FEMale");

        Teacher teacher = new Teacher("Stela", "Female", "Korean", "AB001");
        // 2. 로직 흐름 진행
        teacher.teach(student1);
        student1.study(teacher);

        teacher.teach(student2);
        student2.study(teacher);

        teacher.teach(student3);
        student3.study(teacher);

        teacher.teach(student4);
        student4.study(teacher);
    }
}
