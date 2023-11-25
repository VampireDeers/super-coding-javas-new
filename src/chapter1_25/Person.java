package chapter1_25;

public class Person {
    private String name;
    private String gender;
    private int age;

    public void showMyself(){
        System.out.printf("Person(name=%s, gender=%s, age: %d)\n", this.name, this.gender, this.age);
    }

    public Person(){
        this("UNKNOWN");
    }
    public Person(String name){
        this(name, "UNKNOWN", 0);
    }

    public Person(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}
