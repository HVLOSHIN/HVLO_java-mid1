package generic.test.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        GenericMethod.objMethod(i);
        // 메서드의 반환값이 Object
        Object object = GenericMethod.objMethod(i);
        System.out.println(object);

        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        System.out.println("result = " + result);

        // 타입에 제한을 걸었을 경우
        Integer integerValue = GenericMethod.<Integer>numberMethod(i);
        Integer integerValue2 = GenericMethod.numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

    }
}
