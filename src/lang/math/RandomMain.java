package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        Random random = new Random(1); // Seed 값 주입

        int randInt = random.nextInt();
        System.out.println("randInt: " + randInt);

        double randDouble = random.nextDouble();
        System.out.println("randDouble: " + randDouble);

        boolean randBoolean = random.nextBoolean();
        System.out.println("randBoolean: " + randBoolean);

        // 범위 지정
        int randomRange1 = random.nextInt(10); // 0~9
        System.out.println("0 ~ 9 : " + randomRange1);

        int randomRange = random.nextInt(10) + 1; // 1~10
        System.out.println("1 ~ 10 : " + randomRange);

    }
}
