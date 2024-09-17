package lang.object.tostring;

public class Dog {

    private String dogName;
    private int age;

    public Dog(String dogName, int age) {
        this.dogName = dogName;
        this.age = age;
    }

//    // 내가 만든 것
//    @Override
//    public String toString() {
//        return "dogName: " + dogName + ", age: " + age;
//    }


    // intellij Generator 기능으로 만든 것
    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                '}';
    }
}
