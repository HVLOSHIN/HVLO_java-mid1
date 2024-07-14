package exception.basic.checked;

public class Service {
    Client client = new Client();
    // 잡는 경우
    public void callCatch() {
        try {   //예외 감시 로직
            client.call();
        }catch (MyCheckedException e){
            // 예외 처리 로직
            System.out.println("예외 처리, message : " + e.getMessage());
        }
        System.out.println("정상 흐름");
    }

    // 던지는 경우
    public void catchThrow() throws MyCheckedException {
        client.call();
    }
}
