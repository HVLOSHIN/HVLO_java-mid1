package exception.ex4;

import exception.ex4.exception.*;

import java.util.Scanner;


public class MainV4 {
    public static void main(String[] args) {
        NetworkServiceV4 networkService = new NetworkServiceV4();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 문자 : ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }

            try {
                networkService.sendMessage(input);
            } catch (Exception e) {
                exceptionHandler(e);
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램 정상 종료");
    }

    // 공통 예외 처리
    private static void exceptionHandler(Exception e) {
        System.out.println("사용자 메시지 : 죄송");
        System.out.println("==개발자용 디버깅 메시지==");
        e.printStackTrace(System.out); // 스택 트레이스 출력

        // 필요하면 에외 별로 별도의 추가 처리 가능
        if (e instanceof SendExceptionV4 sendEx) {
            System.out.println("[전송 오류] 전송 데이터 : " + sendEx.getSendData());
        }
    }
}