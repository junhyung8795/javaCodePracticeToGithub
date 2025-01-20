package javaCodePractice.javaMap;

import java.util.HashMap;
import java.util.Map;

public class MapMain1 {
    public static void main(String[] args) {

        Map<String, Integer> student = new HashMap<>();//자바에서 제공하는 map은 제네릭 타입을 두개 선언 해야 한다.

        //학생의 성적 데이터 추가해보자
        student.put("studentA", 90);
        student.put("studentB", 80);
        student.put("studentC", 70);
        student.put("studentD", 60);
        student.put("studentE", 60);//E는 D와 성적이 같다고 넣어도 Value는 값 중복을 허락한다.
    }
}
