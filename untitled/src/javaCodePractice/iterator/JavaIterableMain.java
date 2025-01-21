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


        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        Iterator<Integer> setIter = set.iterator();
        printAll(setIter);

    }

    private static void printAll(Iterator<Integer> iterator) {
        while (iterator.hasNext()) {
            System.out.println("set, list가 둘다 사용하는 공통 메서드로 iteraotor 받아서 순회 = " + iterator.next());
        }
    }
}
