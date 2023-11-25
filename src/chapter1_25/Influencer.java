package chapter1_25;

public class Influencer {

    private String name;
    private String gender;
    private int age;

    private int followerNumbers;

    public void showMySelf(){
        System.out.printf("Influencer 인스턴스(name=%s, followers=%d, gender=%s, age=%d)\n", this.name, this.followerNumbers, this.gender, this.age);
    }

    public Influencer(String name, String gender, int age, int followerNumbers) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.followerNumbers = followerNumbers;
    }

    public Influencer addFollowers(){
        this.followerNumbers += 1;
        return this;
    }
}
