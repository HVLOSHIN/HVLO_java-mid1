package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Car car = new Car();


        action(dog);
        action(car);
    }

    private static void action(Object obj){
        //obj,sound();    // 컴파일 오류 발생 (서브클래스 기능에 접근할 수 없음)
        //obj.move();
        //다운 캐스팅
        if (obj instanceof Dog dog){
            dog.sound();
        }
        else if(obj instanceof Car car){
            car.move();
        }
    }
}

