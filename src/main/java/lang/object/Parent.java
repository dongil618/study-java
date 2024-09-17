package lang.object;

// 부모가 없으면 묵시적으로 Object 클래스를 상속받는다. => Object 클래스 상속은 생략 가능하고 생략을 권장
public class Parent /* extends Object */{

    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
