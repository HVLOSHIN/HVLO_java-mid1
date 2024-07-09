package enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {


        System.out.println("class Basic = " + Grade.BASIC.getClass());
        System.out.println("class gold = " + Grade.GOLD.getClass());
        System.out.println("class diamond = " + Grade.DIAMOND.getClass());

        System.out.println("ref basic = " + Grade.BASIC);
        System.out.println("ref gold = " + Grade.GOLD);
        System.out.println("ref diamond = " + Grade.DIAMOND);
    }
}
