package javaCodePractice.javaMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {

        Map<String, Integer> student = new HashMap<>();//자바에서 제공하는 map은 제네릭 타입을 두개 선언 해야 한다.

        //학생의 성적 데이터 추가해보자
        student.put("studentA", 90);
        student.put("studentB", 80);
        student.put("studentC", 70);
        student.put("studentD", 60);
        student.put("studentE", 60);//E는 D와 성적이 같다고 넣어도 Value는 값 중복을 허락한다.
        System.out.println(student);

        //특정 학생의 값 조회 --> 특정 key를 통해 value를 찾음. HashSet과 유사
        Integer result = student.get("studentA");
        System.out.println(result);

        System.out.println("keySet 활용");
        Set<String> keySet = student.keySet();
    }
}
