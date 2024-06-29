package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        //split()
        String[] splitStr = str.split(",");
        for (String s : splitStr) {
            System.out.println(s);
        }

        //join()
        String joinStr = String.join("-", splitStr);
        System.out.println("연결된 문자열 : " + joinStr);
    }
}
