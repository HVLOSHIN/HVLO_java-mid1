package exception.basic.unchecked;

public class Service {
    Client client = new Client();

    public void callCatch(){
        try {
            client.call();
        } catch (MyUncheckedException e) {
            //예외 처리 로직
            System.out.println("예외 처리, message : " + e.getMessage());
        }
        System.out.println("정상 로직");
    }
    // 체크 예외와 다르게 throws 예외 선언을 하지 않아도 됩니다.
    public void callThrow(){
        client.call();
    }
}
