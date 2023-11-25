package chapter1_25;


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

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    Teacher(String name, String gender, String subjectName, String subjectCode){
        this.name = name;
        this.gender = gender;

        Subject newSubject = new Subject(subjectName, subjectCode);
        subject = newSubject;
    }
    // 행위
    void teach(Student student, String subjectName){
        String studentName = student.getName();
        System.out.printf("선생: 저는 %s 학생에게 %s 과목을 가르치고 있습니다.\n", studentName, subjectName);
    }
}