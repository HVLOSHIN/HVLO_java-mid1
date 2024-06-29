package lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {


        //format()
        String format1 = String.format("소숫점 2자리 까지만 : %.2f",10.1234);
        System.out.println(format1);

        //printf()
        System.out.printf("소숫점 3자리 까지만 : %.3f \n",10.12345);
    }
}
