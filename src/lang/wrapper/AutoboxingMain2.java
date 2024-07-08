package lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        //Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; //오토박싱
        Integer boxedValue2 = 7;
        System.out.println("boxedValue = " + boxedValue);
        System.out.println("boxedValue2 = " + boxedValue2);

        //Wrapper -> Primitive
        int unboxedValue = boxedValue;  //오토 언박싱
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
