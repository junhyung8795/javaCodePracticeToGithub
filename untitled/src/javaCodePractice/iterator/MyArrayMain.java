package javaCodePractice.iterator;

public class MyArrayMain {
    public static void main(String[] args) {

        MyArr myArr = new MyArr(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        //만약 MyArr가 Iterable을 구현하지 않고 MyArrayIterator도 없다고 가정하면
        //myArr에서 내부의 배열의 참조를 return하는 메서드 만들고 for문을 돌았을 것이다.
        //그런데 이는 지금 당장만 배열인 것이고 이게 트리인지, 셋인지, 링크드 리스트인지 모르는 상황이라고 가정해보자
        //자료 구조마다 순회하는 방법이 다 다른다. 자료 구조마다 다른 순회 방법을 전부 외우는 건 비효율 적이다.
        //일관된 방법으로 같은 메서드를 써서 모든 자료 구조의 데이터를 순회하고 싶어! -->Iterator를 사용해야 한다
    }
}
