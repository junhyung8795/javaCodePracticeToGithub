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
        while (listIter.hasNext()) {
            System.out.println("리스트의 순회" + listIter.next());
        }

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        Iterator<Integer> setIter = set.iterator();
        while (setIter.hasNext()) {
            System.out.println("셋의 순회 = " + setIter.next());
        }
        
    }
}
