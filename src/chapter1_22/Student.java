package chapter1_22;

public class Student {

    // 속성
    int classYear; // 학년
    int classRoomNumber; // 몇 반
    int studentNumber; // 몇 번

    String name;
    String gender;

    // 행위
    void study(Teacher teacher){
        String teacherName = teacher.name;
        String subject = teacher.subject;
        System.out.printf("학생: 저는 %s 선생님에게 %s 과목을 배웁니다.", teacherName, subject);
    }
}
