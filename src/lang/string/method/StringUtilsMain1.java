package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello Java!";

        //ValueOf()
        System.out.println("숫자의 문자열 값 : " + String.valueOf(num));
        System.out.println("불리언의 문자열 값 : " + String.valueOf(bool));
        System.out.println("객체의 문자열 값 : " + String.valueOf(obj));
        // 편법
        System.out.println(" " + num);
        System.out.println(" " + bool);
        System.out.println(" " + obj );

        //toCharArray()
        char[] strCharArray = str.toCharArray();
        for (char c : strCharArray) {
            System.out.print(c);
        }
        System.out.println();
    }
}
