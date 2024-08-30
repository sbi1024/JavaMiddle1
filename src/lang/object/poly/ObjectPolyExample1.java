package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
        // obj.sound(); 컴파일 오류
        // obj.move(); 컴파일 오류
        
        // 다운캐스팅
        if (obj instanceof Dog) {
            ((Dog) (obj)).sound();
        } else if (obj instanceof Car) {
            ((Car) (obj)).move();
        }
    }
}
