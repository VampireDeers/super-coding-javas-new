package chapter1_25;

public class Student {
    // 속성
    private int classYear; // 몇 학년
    private int classroomNumber; // 몇 반
    private int studentNumber; // 몇 번

    // 기본 정보
    private String name;
    private String gender;

    // 생성자
    Student(){
        this("UNKNOWN", "UNKNOWN");
    }
    Student(String name, String gender){
        this(-1, -1, -1, name, gender);
    }

    public Student(int classYear, int classroomNumber, int studentNumber, String name, String gender) {
        this.classYear = classYear;
        this.classroomNumber = classroomNumber;
        this.studentNumber = studentNumber;
        this.name = name;
        this.gender = gender;
    }

    // getter / setter
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public int getStudentNumber(){
        return studentNumber;
    }
    public void setStudentNumber(int studentNumber){
        this.studentNumber = studentNumber;
    }

    // 행위
    void study(Teacher teacher, String subjectName){
        String teacherName = teacher.getName();
        System.out.printf("학생: 저는 %s 선생님에게 %s 과목을 배웁니다.\n", teacherName, subjectName);
    }
}