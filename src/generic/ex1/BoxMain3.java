package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); // 생성 시점에 타입 결정
        integerBox.set(10);
        //integerBox.set("10"); //Integer 타입만 허용, 컴파일 오류
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("Hello");
        String string = stringBox.get();
        System.out.println("string = " + string);

        GenericBox<Double> DoubleBox = new GenericBox<Double>();
        DoubleBox.set(3.14);
        Double Double = DoubleBox.get();
        System.out.println("Double = " + Double);
    }
}
