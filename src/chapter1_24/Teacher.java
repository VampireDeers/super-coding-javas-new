package chapter1_24;

public class Teacher {

    // 속성
    Subject subject; // 담당 과목
    String name; // 선생님 이름
    String gender; // 성별

    Teacher(){}
    Teacher(String pName, String pGender, String pSubjectName, String pSubjectCode){
        name = pName;
        gender = pGender;

        Subject newSubject = new Subject(pSubjectName, pSubjectCode);
        subject = newSubject;
    }
    // 행위
    void teach(Student student){
        String studentName = student.getName();
        System.out.printf("선생: %s 학생에게 %s 과목을 가르치고 있습니다.\n", studentName, subject.subjectName);
    }
}
