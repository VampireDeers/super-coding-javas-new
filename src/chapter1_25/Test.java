package chapter1_25;

public class Test {
    public static void main(String[] args){
//        Person person = new Person("아이유", "Female", 29);
//        Person person2 = new Person();
//
//        person.showMyself();
//        person2.showMyself();

        //
        Influencer influencer = new Influencer("아이유", "Female", 29, 0);
        influencer.showMySelf();

        influencer
                .addFollowers().addFollowers()
                .addFollowers().addFollowers().addFollowers();

        influencer.showMySelf();
    }
}
