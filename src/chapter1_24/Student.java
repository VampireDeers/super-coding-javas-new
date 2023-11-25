package chapter1_24;

public class Student {
    // 속성
    private int classYear; // 몇 학년
    private int classroomNumber; // 몇 반
    private int studentNumber; // 몇 번

    // 기본 정보
    private String name;
    private String gender;

    // 생성자
    Student(){}
    Student(String pName, String pGender){
        name = pName;
        gender = pGender;
    }
    Student(int pClassYear, int pClassroomNum, int pStudentNum, String pName,String pGender){
        classYear = pClassYear;
        classroomNumber = pClassroomNum;
        studentNumber = pStudentNum;
        name = pName;
        gender = pGender;
    }

    // getter / setter
    public String getName() {
        return name;
    }
    public void setName(String pName){
        name = pName;
    }

    public String getGender(){
        return gender;
    }
    public void setGender(String pGender){
        gender = pGender;
    }
    public int getStudentNumber(){
        return studentNumber;
    }
    public void setStudentNumber(int pStudentNumber){
        studentNumber = pStudentNumber;
    }

    // 행위
    void study(Teacher teacher, String subjectName){
        String teacherName = teacher.getName();
        System.out.printf("학생: 저는 %s 선생님에게 %s 과목을 배웁니다.\n", teacherName, subjectName);
    }
}