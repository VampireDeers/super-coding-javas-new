package chapter1_22;

public class Teacher {

    // 속성
    String subject; // 담당과목
    String name; // 선생님 이름
    String gender; // 성별

    // 행위
    void teach(Student student){
        String studentName = student.name;
        System.out.printf("선생: %s 학생에게 %s 과목을 가르치고 있습니다.", studentName, subject);
    }
}
