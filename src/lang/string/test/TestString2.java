package lang.string.test;

public class TestString2 {
    public static void main(String[] args) {

        String[] arr = {"hello","java","jvm","spring","jpa"};
        int literalLength =0;
        for (String s : arr) {
            literalLength += s.length();
        }
        System.out.println(literalLength);
    }
}
