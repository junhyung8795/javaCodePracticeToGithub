package javaCodePractice.dequeStackQueue;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("stack = " + stack);

        //다음 꺼낼 요소를 조회만 하는 기능 peek!
        System.out.println("stack.peek() = " + stack.peek());

        //요소 꺼내기
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack = " + stack);//pop으로 꺼내면 해당 요소를 .
    }
}
