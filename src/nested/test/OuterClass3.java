package nested.test;

public class OuterClass3 {
    public void myMethod(){
        class LocalClass{
            public void hello(){
                System.out.println("ssss");
            }
        }
        LocalClass lc = new LocalClass();
        lc.hello();
    }

    public static void main(String[] args) {
        OuterClass3 o = new OuterClass3();
        o.myMethod();
    }
}

