package javaCodePractice.compare;

import java.util.Comparator;

//이미 기본 정렬로 MadeObject에 compareTo가 구현돼 있지만
//age 나이로 정렬하기 싫고 이번엔 name으로 정렬하고 싶으면 Comparator를 구현한
//새로운 비교자(Comparator)를 만들어서 sort의 파라미터에 추가하면 된다.
//정리하자면
//Comparable을 구현하면 그 객체는 "기본적으로 비교가능한 상태"가 되는 거고
//Comparator를 구현하면 이미 비교,정렬이 가능하지만 다른 기준이 적용된 새로운 비교자를 만든다는 것이다.
public class NameComparator implements Comparator<MadeObject> {
    @Override
    public int compare(MadeObject o1, MadeObject o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
