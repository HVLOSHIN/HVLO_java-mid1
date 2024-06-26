package lang.immutable.adress;

public class PrimitiveMain {
    public static void main(String[] args) {
        //Call by Value
        int a = 10;
        int b = a; // a -> b 값 복사 후 대입
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        b = 20;
        System.out.println("b의 값을 20으로 변경");
        System.out.println("a : " + a);
        System.out.println("b : " + b);

    }
}
