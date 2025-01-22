package javaCodePractice.collectionUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//of로 생성해놓고 다시 가변 객체로 만들 수도 있다.
public class Immutable2mutableMain {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3);

        //가변!
        ArrayList<Integer> mutableList = new ArrayList<>(integers);
        mutableList.add(4);
        System.out.println("mutableList: " + mutableList);
        System.out.println(mutableList.getClass());

        //다시 불변으로 바꾸고 싶다면
        List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);
        /*unmodifiableList.add(5);
        Exception in thread "main" java.lang.UnsupportedOperationException
        at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        at javaCodePractice.collectionUtil.Immutable2mutableMain.main(Immutable2mutableMain.java:20)*/
        System.out.println("unmodifiableList: " + unmodifiableList.getClass());

    }
}
