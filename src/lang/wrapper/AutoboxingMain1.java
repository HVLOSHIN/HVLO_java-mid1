package lang.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {
        //Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);
        System.out.println("boxedValue = " + boxedValue);

        //Wrapper -> Primitive
        int unboxedValue = boxedValue.intValue();
        System.out.println("unboxedValue = " + unboxedValue);

    }
}
