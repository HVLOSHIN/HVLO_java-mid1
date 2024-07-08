package lang.wrapper;

public class WrapperVsPrimitive2 {
    public static void main(String[] args) {
        int iterations = 1_000_000_000; // 반복횟수 10억
        long start = System.currentTimeMillis();
        Long sum2 = 0l ;
        for (int i = 0; i < iterations; i++) {
            sum2 += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("Iteration time: " + (end - start) + " ms");
        System.out.println("sum2: " + sum2);

    }
}
