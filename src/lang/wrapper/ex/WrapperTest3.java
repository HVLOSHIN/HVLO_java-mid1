package lang.wrapper.ex;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        Integer i = Integer.valueOf(str);
        System.out.println(i);

        int i2 = i.intValue();
        System.out.println(i2);

        Integer i3 = Integer.valueOf(i2);
        System.out.println(i3);

    }
}
