package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";

        int index = str.indexOf(".");
        String str2 = str.substring(index);
        System.out.println(str);
        System.out.println(str2);
    }
}
