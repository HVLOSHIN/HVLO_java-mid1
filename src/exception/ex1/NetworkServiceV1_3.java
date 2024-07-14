package exception.ex1;


public class NetworkServiceV1_3 {

    public void sendMessage(String data) {
        String address = "http://example.com ";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);

        // client.connect();
        String connectResult = client.connect();
        if (isError(connectResult)) { // "success" 가 아니면
            System.out.println("[네트워크 오류 발생] 오류코드 : " + connectResult);
        }
        else{
            String sendResult = client.send(data);
            if (isError(sendResult)) { // "success" 가 아니면
                System.out.println("[네트워크 오류 발생] 오류코드 : " + sendResult);
            }
        }
        client.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
