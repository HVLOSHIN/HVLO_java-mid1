package lang.wrapper;

public class MyIntegerMethodMain0 {
    public static void main(String[] args) {
        int value = 10;
        int num1 = compareTo(value,5);
        int num2 = compareTo(value,10);
        int num3 = compareTo(value,20);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }

    public static int compareTo(int value, int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }
}
