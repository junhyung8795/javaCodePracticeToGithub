package javaCodePractice.collectionUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//개발하다 보면 빈 리스트를 생성 해야할 때도 있다.
//null반환하기 좀 그럴 때
public class EmptyListMain {
    public static void main(String[] args) {
        //빈 가변 리스트 생성
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        //빈 불변 리스트 생성
        List<Integer> list3 = Collections.emptyList(); // 자바 5에 들어옴
        List<Integer> list4 = List.of(); //자바 9에 들어옴

        System.out.println("list3 = " + list3.getClass());
        System.out.println("list4 = " + list4.getClass());
    }
}
