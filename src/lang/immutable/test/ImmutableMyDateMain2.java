package lang.immutable.test;

public class ImmutableMyDateMain2 {
    public static void main(String[] args) {
        ImmutableMyDateRef date1 = new ImmutableMyDateRef(2024,1,1);

        System.out.println("date1 = " + date1);

        ImmutableMyDateRef date2 = date1.withYear(2025);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
