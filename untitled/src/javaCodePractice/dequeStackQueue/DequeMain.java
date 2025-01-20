package javaCodePractice.dequeStackQueue;

import java.util.ArrayDeque;
import java.util.Deque;

//deque는 double end queue의 약자다. 양쪽 끝에서 요소를 추가하거나 제거할 수 있다. 큐와 스택의 기능을 모두 포함하고 있어 매우 유연한 자료 구조이다.
//offerFirst():앞에 추가
//offerLast():뒤에 추가
//pollFirst(): 앞에서 꺼낸다
//pollLast(): 뒤에서 꺼낸다.
public class DequeMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offerFirst(1);
        System.out.println("deque = " + deque);
        deque.offerFirst(2);
        System.out.println("deque = " + deque);
        deque.offerLast(3);
        System.out.println("deque = " + deque);
        deque.offerLast(4);
        System.out.println("deque = " + deque);

        //데이터 단순 조회
        System.out.println("deque.peekFirst() = " + deque.peekFirst());//앞에서 나오는거 조회
        System.out.println("deque.peekLast() = " + deque.peekLast());//뒤에서 나오는거 조회

        //데이터 꺼내기
        System.out.println("deque.pollFirst() = " + deque.pollFirst());//앞에서 꺼내기
        System.out.println("deque.pollLast() = " + deque.pollLast());//뒤에서 꺼내기
        System.out.println("deque = " + deque);
    }
}
