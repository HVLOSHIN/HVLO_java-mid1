package lang.immutable.adress;

public class RefMain1_2 {
    public static void main(String[] args) {
        //Call by Reference
        Address a = new Address("서울");
        Address b = new Address("서울");
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        System.out.println("b의 값을 부산으로 변경");
        b.setValue("부산");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}
