package javaCodePractice.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class JavaIterableMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> listIter = list.iterator();
        printAll(listIter);
        foreach(list);


        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        Iterator<Integer> setIter = set.iterator();
        printAll(setIter);
        foreach(set);

    }

    private static void foreach(Iterable<Integer> list) {
        System.out.println("iterable = " + list.getClass());
        for (Integer i : list) {
            System.out.println("foreach로 이터러블 객체 받아서 순회 = " + i);
        }
    }

    private static void printAll(Iterator<Integer> iterator) {
        //아래줄 실행시키면
//        iterator = class java.util.ArrayList$Itr
//        iterator = class java.util.HashMap$KeyIterator
        //이렇게 뜨는데 ArrayList안에는 Itr라고 내부클래스가 있고
        //set은 사실 HashMap에서 value를 뺀거다! 그래서 HashMap에서 Key값만가져오는 KeyIterator를 가지고 있다.
        System.out.println("iterator = " + iterator.getClass());
        while (iterator.hasNext()) {
            System.out.println("set, list가 둘다 사용하는 공통 메서드로 iteraotor 받아서 순회 = " + iterator.next());
        }
    }
}
