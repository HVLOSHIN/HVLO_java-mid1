package lang.string.method;

public class StringSearchMain {
    public static void main(String[] args) {

        String str = "Hello, Java! Welcome to Java world.";
        System.out.println("Java를 포함하는지 체크 : " + str.contains("Java"));
        System.out.println("Java의 첫 인덱스 : " + str.indexOf("Java"));
        System.out.println("인덱스 10부터 Java의 인덱스 : " + str.indexOf("Java",10));
        //오버로딩도 생각하면 멋쟁이
        System.out.println("Java의 마지막 인덱스 : " + str.lastIndexOf("Java"));
    }
}

