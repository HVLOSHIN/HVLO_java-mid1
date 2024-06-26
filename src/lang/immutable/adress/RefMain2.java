package lang.immutable.adress;

public class RefMain2 {
    public static void main(String[] args) {
        //Call by Reference
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; // 참조값 대입을 막을 수 있는 방법은 없다.
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        System.out.println("b의 값을 부산으로 변경");
        //  b.setValue("부산");
        b= new ImmutableAddress("부산"); //새로운 객체를 생성하는 방법밖에 없다.
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}
