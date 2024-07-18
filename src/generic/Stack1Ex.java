package generic;


import java.util.Stack;

public class Stack1Ex {
    public static void main(String[] args) {

        // Integer형 스택 선언
        Stack<Integer> stack = new Stack<>();

        // 값 추가 push()
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);

        // 값 제거 pop()
        stack.pop();
        System.out.println(stack);

        // Stack의 Top 출력
        System.out.println(stack.peek());
    }
}
