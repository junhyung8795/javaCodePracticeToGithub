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
//주의!
//자바의 Stack클래스는 내부에서 Vector라는 자료구조를 사용한다.
//Vector는 지금은 사용되지 않고 하위 호환을 위해 존재한다.
//지금은 이보다 더 좋은 자료 구조가 많아서 굳이 stack을 쓰고 싶다면 deque를 사용하자.