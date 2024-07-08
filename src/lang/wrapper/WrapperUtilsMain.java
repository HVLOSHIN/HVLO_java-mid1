package lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {

        Integer i1 = Integer.valueOf(10);   // 숫자, 래퍼 객체 변환
        Integer i2 = Integer.valueOf("10"); // 문자열, 래퍼 객체 변환
        int i3 = Integer.parseInt("10");

        System.out.println("i1: " + i1);
        System.out.println("i2: " + i2);
        System.out.println("i3: " + i3);


        //비교
        int compareResult1 = i1.compareTo(20);
        int compareResult2 = i1.compareTo(i2);

        System.out.println(compareResult1);
        System.out.println(compareResult2);

        //산술 연산
        System.out.println("sum : " + Integer.sum(10,20));
        System.out.println("min : " + Integer.min(10,20));
        System.out.println("max : " + Integer.max(10,20));
    }
}
