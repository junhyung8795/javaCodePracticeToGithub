package javaCodePractice.dequeStackQueue;

import java.util.ArrayDeque;
import java.util.Queue;

//Collection interface
//--> Queue interface
//--> Deque interface
//-->ArrayDeque, LinkedList

//참고로 링크드 리스트는 Deque와 List 인터페이스를 둘다 구현한다.
public class QueueMAin {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
//        Queue<Integer> queue = new LinkedList<>();//Queue의 구현체로 링크드 리스트도 있으니 사용해도 된다!
//        다만 ArrayDeque가 성능이 더 좋다.

        
    }
}
