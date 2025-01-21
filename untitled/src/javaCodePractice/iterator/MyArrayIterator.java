package javaCodePractice.iterator;

import java.util.Iterator;

//이 클래스는 배열에 접근해서 반복하는 반복자(Iterator)
public class MyArrayIterator implements Iterator<Integer> {
    private int currentIndex = -1;//현재 인덱스를 -1부터 시작한다. 
    private int[] targetArr;

    //타겟으로 할 int배열을 넣는다.
    public MyArrayIterator(int[] targetArr) {
        this.targetArr = targetArr;
    }

    @Override
    public boolean hasNext() {
        //현재가 인덱스의 끝보다 밑에 있냐라고 묻는 것.
        return currentIndex < targetArr.length - 1;
    }

    @Override
    public Integer next() {
        currentIndex++;//next()는 "다음으로 이동한 후"에 꺼낸다. currentIndex가 -1부터 시작한 이유 0->1->2->...
        return targetArr[currentIndex];
        //return targetArr[++currentIndex];도 가능
    }
}
