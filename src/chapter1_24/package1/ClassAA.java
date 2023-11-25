package chapter1_24.package1;

public class ClassAA {

    void testPublic(ClassA classA){
        String str = classA.publicStr;
        classA.methodPublish();
    }

    void testDefault(ClassA classA){
        String str = classA.defaultStr;
        classA.methodDefault();
    }
//    void testPrivate(ClassA classA){
//        String str = classA.privateStr;
//        classA.methodPrivate();
//    }
}
