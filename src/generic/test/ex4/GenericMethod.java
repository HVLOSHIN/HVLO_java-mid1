package generic.test.ex4;

public class GenericMethod {

    public static Object objMethod(Object obj) {
        System.out.println("Object print : " + obj);
        return obj;
    }

    public static <T> T genericMethod(T obj) {
        System.out.println("Object print : " + obj);
        return obj;
    }

    public static <T extends Number> T numberMethod(T obj) {
        System.out.println("Number print : " + obj);
        return obj;
    }

    public <T> void iAmGenericMethod(T t){
        System.out.println(t);
    }

    public <T extends Number> void iAmGenericMethod2(T t){
        System.out.println(t);
    }
}
