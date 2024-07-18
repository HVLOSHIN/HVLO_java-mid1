package generic.test.ex4;

public class MethodMain1_1 {
    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();

        genericMethod.<Integer>iAmGenericMethod(10);
        genericMethod.<String>iAmGenericMethod("Hello");
        genericMethod.<Double>iAmGenericMethod(3.14);

        genericMethod.iAmGenericMethod2(10);
    }
}
