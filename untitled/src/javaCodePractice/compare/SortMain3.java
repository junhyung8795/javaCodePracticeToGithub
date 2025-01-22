package javaCodePractice.compare;

import java.util.Arrays;

public class SortMain3 {
    public static void main(String[] args) {
        MadeObject madeObject1 = new MadeObject("a", 50);
        MadeObject madeObject2 = new MadeObject("b", 40);
        MadeObject madeObject3 = new MadeObject("c", 30);

        MadeObject[] myObjects = new MadeObject[]{madeObject1, madeObject2, madeObject3};
        System.out.println("기본 데이터");
        System.out.println(Arrays.toString(myObjects));

        //기본 정렬 --> 오름차 정렬
//        System.out.println("Comparable 기본 정렬");
//        Arrays.sort(myObjects);
//        System.out.println(Arrays.toString(myObjects));

        System.out.println("NameComparator 정렬");
        Arrays.sort(myObjects, new NameComparator());
        System.out.println(Arrays.toString(myObjects));
        //비교 방식을 기본 정렬 방식이 아닌 다른 정렬 방식을 지정하고 싶다면
        //Arrays.sort()에 인자로 비교자(Comparator)를 넘겨주면 된다.
        //이렇게 되면 기본 정렬을 무시하고 넘어온 비교자를 사용하여 정렬한다.
    }
}
