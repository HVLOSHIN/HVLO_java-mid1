package generic;


import java.util.Stack;

public class Stack2Ex {
    public static void main(String[] args) {

        // String형 스택 선언
        Stack<String> stack = new Stack<>();

        // 값 추가 push()
        stack.push("!");
        stack.push("O");
        stack.push("L");
        stack.push("L");
        stack.push("E");
        stack.push("H");

       while (!stack.isEmpty()) {
           System.out.print(stack.pop());
       }
    }
}
