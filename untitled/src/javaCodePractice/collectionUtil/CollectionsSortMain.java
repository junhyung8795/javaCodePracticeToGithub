package javaCodePractice.collectionUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);
        System.out.println(max);
        System.out.println(min);

        System.out.println(list);
        Collections.shuffle(list);//랜덤하게 리스트의 요소를 섞는다.
        System.out.println(list);//뭔가 카드 게임 같은거 하면 좋다.
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);//기본 정렬을 뒤집어서 함
        System.out.println(list);
    }
}
