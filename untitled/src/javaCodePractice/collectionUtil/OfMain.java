package javaCodePractice.collectionUtil;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {
    public static void main(String[] args) {
        //편리한 불변 컬렉션

        List<Integer> list = List.of(1, 2, 3);//of로 생성하면 불변 List가 된다.
   /*     list.add(1);//불변이라 값을 추가하거나
        list.set(1, 10);//값을 바꾸는게 안된다.*/
        Set<Integer> set = Set.of(1, 2, 3);//불변Set
        Map<Integer, String> map = Map.of(1, "One", 2, "Two");//불변Map
        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
        System.out.println("list.getClass() = " + list.getClass());
        System.out.println("set.getClass() = " + set.getClass());
        System.out.println("map.getClass() = " + map.getClass());
    }
}
