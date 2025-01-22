package javaCodePractice.collectionUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("list.getClass() = " + list.getClass());

        //멀티 스레드 상황에서 동기화 문제가 일어나지 않는 안전한 리스트로 만들 수 있다.
        List<Integer> synchronizedList = Collections.synchronizedList(list);
        System.out.println("synchronizedList.getClass() = " + synchronizedList.getClass());
    }
}
