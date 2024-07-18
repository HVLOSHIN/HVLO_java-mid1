package generic;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Queue1Ex {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();

        // 큐
        for (int i = 1; i <= 10; i++) {
            que.add(i);
        }
        System.out.println(que);
        System.out.println("peek : " + que.peek());

        for (int i = 1; i <= 3; i++) {
            que.remove();
        }
        System.out.println(que);
        System.out.println("peek : " + que.peek());
    }
}
