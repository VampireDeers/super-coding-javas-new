package chapter1_21;

public class Scores {

    public static void main(String[] args){
        // A class 학생들 점수
        int studentAClass1 = 50;
        int studentAClass2 = 30;
        int studentAClass3 = 45;

        // B Class 학생 점수
        int studentBClass1 = 60;
        int studentBClass2 = 65;
        int studentBClass3 = 66;

        // A의 평균
        double averageOfAClass = calculateAverage(studentAClass1, studentAClass2, studentAClass3);
        System.out.println(averageOfAClass);

        double averageOfBClass = calculateAverage(studentBClass1, studentBClass2, studentBClass3);
        System.out.println(averageOfBClass);

    }

    static double calculateAverage(int student1, int student2, int student3){
        int sumOfClass = student1 + student2 + student3;
        return sumOfClass / (double) 3;
    }
}
