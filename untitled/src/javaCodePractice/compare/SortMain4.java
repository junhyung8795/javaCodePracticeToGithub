package javaCodePractice.compare;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortMain4 {
    public static void main(String[] args) {
        MadeObject madeObject1 = new MadeObject("a", 50);
        MadeObject madeObject2 = new MadeObject("b", 40);
        MadeObject madeObject3 = new MadeObject("c", 30);

        List<MadeObject> list = new LinkedList<>();
        list.add(madeObject1);
        list.add(madeObject2);
        list.add(madeObject3);
        System.out.println("기본 데이터");
        System.out.println(list);

        System.out.println("Comparable 기본 정렬 --> age로 오름차");
        list.sort(null);
        System.out.println(list);

        System.out.println("NameComparator 정렬--> name으로 내림차");
        list.sort(new NameComparator());
//        list.sort(new NameComparator().reversed());하면 name으로 오름차가 된다.
        System.out.println(list);

        //컬렉션을 이용한 방법이 더 있다.
        System.out.println("컬렉션 유틸 기본정렬");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("컬렉션 유틸 Comparator 정렬");
        Collections.sort(list, new NameComparator());
        System.out.println(list);



    }
}
