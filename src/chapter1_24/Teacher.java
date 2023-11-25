package chapter1_24;


public class Teacher {
    // 속성

    // 학교 정보
    private String schoolName;

    // 담당 과목
    private Subject subject;

    // 기본 정보
    private String name;
    private String gender;

    Teacher(){}
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String pSchoolName) {
        schoolName = pSchoolName;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject pSubject) {
        subject = pSubject;
    }

    public String getName() {
        return name;
    }

    public void setName(String pName) {
        name = pName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String pGender) {
        gender = pGender;
    }

    Teacher(String pName, String pGender, String pSubjectName, String pSubjectCode){
        name = pName;
        gender = pGender;

        Subject newSubject = new Subject(pSubjectName, pSubjectCode);
        subject = newSubject;
    }
    // 행위
    void teach(Student student, String subjectName){
        String studentName = student.getName();
        System.out.printf("선생: 저는 %s 학생에게 %s 과목을 가르치고 있습니다.\n", studentName, subjectName);
    }
}