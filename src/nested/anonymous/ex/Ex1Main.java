package nested.anonymous.ex;

import java.util.Random;

import static nested.anonymous.ex.LogicList.*;

public class Ex1Main {
    public static void hello(LogicList logicList) {
        System.out.println("프로그램 시작");
        Logic logic = new Logic() {
            @Override
            public void logic(LogicList logicList) {
                if (logicList == DICE) {
                    int rand = new Random().nextInt(6) + 1;
                    System.out.println("주사위 : " + rand);
                } else if (logicList == PRINT) {
                    for (int i = 0; i < 3; i++) {
                        System.out.println(i);
                    }

                }

            }

        };
        logic.logic(logicList);

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        hello(DICE);
        hello(PRINT);
    }


}
