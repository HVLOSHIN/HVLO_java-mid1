package lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {

        String str1 = new String("hello");
        String str2 = new String("hello");
        String str3 = "hello";
        String str4 = "hello";

        System.out.println("메서드 호출 비교1 : " + isSame1(str1, str2));
        System.out.println("메서드 호출 비교2 : " + isSame1(str3, str4));

    }
    private static boolean isSame1(String x, String y) {
        return x == y;
    }

    private static boolean isSame2(String x, String y) {
        return x.equals(y);
    }
}
