package chapter1_25;

public class BirthDay {
    private int year;
    private int month;
    private int day;

    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    private void printHi() { System.out.println("Hi");}

    BirthDay(){
        this.printHi();
    }
}
