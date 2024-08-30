package lang.object;

public class Parent {
    public void parentMethod() {
        // 묵시적 상속을 통해, Object 클래스를 생속받는다.
        System.out.println("Parent.parentMethod");
    }
}
