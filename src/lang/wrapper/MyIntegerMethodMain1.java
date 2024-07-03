package lang.wrapper;

public class MyIntegerMethodMain1 {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(10);

      int num1 =  myInteger.compareTo(5);
      int num2 =  myInteger.compareTo(10);
      int num3 =  myInteger.compareTo(20);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
