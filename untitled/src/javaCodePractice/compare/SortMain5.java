package javaCodePractice.compare;

import java.util.TreeSet;

//tree구조는 들어갈때부터 비교를 하며 정렬하면서 넣기 때문에 MadeObject가 comparable을 구현하거나
//comparator를 생성자에 넣어줘야한다.
//자바가 제공하는 String, Integer는 이미 구현돼 있어서 괜찮지만
//MadeObject는 내가 만든 거니까 따로 compareTo메서드를 오버라이딩 해줘야 한다.
public class SortMain5 {
    public static void main(String[] args) {
        MadeObject madeObject1 = new MadeObject("a", 50);
        MadeObject madeObject2 = new MadeObject("b", 40);
        MadeObject madeObject3 = new MadeObject("c", 30);

        TreeSet<MadeObject> treeSet1 = new TreeSet<>();
        treeSet1.add(madeObject1);
        treeSet1.add(madeObject2);
        treeSet1.add(madeObject3);
        System.out.println("컴페러블 기본 정렬");
        System.out.println(treeSet1);//트리는 들어가는 순간에 대소 구분해서 정렬을 하니까 따로 sort안해도 정렬돼있음

        TreeSet<MadeObject> treeSet2 = new TreeSet<>(new NameComparator());
        treeSet2.add(madeObject1);
        treeSet2.add(madeObject2);
        treeSet2.add(madeObject3);
        System.out.println("네임컴퍼레이터 정렬");
        System.out.println(treeSet2);
    }
}
