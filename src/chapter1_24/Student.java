package chapter1_24;

public class Student {

    // 속성
    private int classYear; // 학년
    private int classRoomNumber; // 몇 반
    private int studentNumber; // 몇 번

    private String name;
    private String gender;

    // 생성자
    public Student(){} // default

    // 접근 메소드 ( getter / setter )
    public String getName() {
        return name;
    }
    public String getGender(){
        return gender;
    }
    public int getStudentNumber(){
        return studentNumber;
    }
    public void setName(String pName){
        name = pName;
    }
    public void setGender(String pGender){
        gender = pGender;
    }
    public void setStudentNumber(int pStudentNumber){
        studentNumber = pStudentNumber;
    }


    public Student(int pClassYear, int pClassRoomNumber, int pStudentNumber,
                   String pName, String pGender
    ){
        classYear = pClassYear;
        classRoomNumber = pClassRoomNumber;
        studentNumber = pStudentNumber;
        name = pName;
        gender = pGender;
    }

    // 행위
    void study(Teacher teacher){
        String teacherName = teacher.name;
        String subject = teacher.subject.subjectName;
        System.out.printf("학생: 저는 %s 선생님에게 %s 과목을 배웁니다.\n", teacherName, subject);
    }
}
