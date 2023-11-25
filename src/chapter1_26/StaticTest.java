package chapter1_26;

public class StaticTest {

    public static void main(String[] args){
        Student student1 = new Student("Alice", "Female");
        Student student2 = new Student("Tom", "Male");
        Student student3 = new Student("Taylor", "Female");
        Student student4 = new Student("Mike", "Male");

        student1.showMyInfo();
        student2.showMyInfo();
        student3.showMyInfo();
        student4.showMyInfo();
    }
}
