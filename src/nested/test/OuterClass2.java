package nested.test;

public class OuterClass2 {
    public class InnerClass {
        public void hello(){
            System.out.println("InnerClass.hello");
        }
    }
    public static void main(String[] args) {
        InnerClass i = new OuterClass2().new InnerClass();
        i.hello();
    }
}
