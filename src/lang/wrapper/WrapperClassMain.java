package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger1 = Integer.valueOf(10);
        Integer newInteger2 = Integer.valueOf(10);
        Long newLong = Long.valueOf(100);
        Double newDouble = Double.valueOf(10.05);

        System.out.println("newInteger1 = " + newInteger1);
        System.out.println("newInteger2 = " + newInteger2);
        System.out.println("newLong = " + newLong);
        System.out.println("newDouble = " + newDouble);

        System.out.println("내부 값 읽기");
        int intValue = newInteger1.intValue();

        System.out.println("비교");
        System.out.println("== : " + (newInteger1 == newInteger2));
        System.out.println("equals : " + newInteger1.equals(newInteger2));

    }
}
