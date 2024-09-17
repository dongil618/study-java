package lang.object;

public class ObjectMain {

    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString은 Object 클래스의 메서드
        String string = child.toString();   // 객체에 대한 정보
        System.out.println(string);
    }
}
