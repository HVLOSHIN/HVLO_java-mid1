package nested.test;

public class OuterClass4 {
    public static void main(String[] args) {
        Hello hello = new Hello() {
            @Override
            public void hello() {
                System.out.println("hello");
            }
        };
        hello.hello();
    }
}
