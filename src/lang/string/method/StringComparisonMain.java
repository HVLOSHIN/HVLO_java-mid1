package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "hello world"; // 대소문자 차이 있음
        String str3 = "Hello Java";

        System.out.println("동등성 비교 : " + str1.equals(str2));
        System.out.println("동등성 비교 : " + str1.equalsIgnoreCase(str2));
        System.out.println("사전 우선순위 비교 :" + str1.compareTo(str2));
        System.out.println("사전 우선순위 비교 :" + str1.compareToIgnoreCase(str2));

        System.out.println("접두사 체크 : " + str1.startsWith("Hell"));
    }
}
