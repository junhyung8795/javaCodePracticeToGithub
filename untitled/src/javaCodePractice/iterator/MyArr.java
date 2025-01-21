package javaCodePractice.iterator;

import java.util.Iterator;

//iterator는 혼자 사용될 수 없다. 순회할 대상으로 간단한 자료 구조 구현
//내부에 배열을 가지고 있는 단순한 자료 구조
//이 MyArr라는 자료 구조를 순회하게 만들려면 "순회할 수 있는"이라는 의미의 Iterable 인터페이스를 구현 해야한다.
//이로써 Iterable한 객체가 된 것이다!
public class MyArr implements Iterable<Integer> {

    private int[] numbers;

    public MyArr(int[] numbers) {
        this.numbers = numbers;
    }

    //이 함수를 오버라이딩 하면 방금 만든 MyArrayIterator에 MyArr 안에 있던 numbers를 전달하고 반복자(MyArrayIterator)
    //를 반환한다!. iterable한 객체는(iterable을 구현한 객체는) iterator로 반복자를 반환하고 사용할 수 있는 것이다.
    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayIterator(numbers);
    }
}
