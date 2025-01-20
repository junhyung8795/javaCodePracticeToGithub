package javaCodePractice.javaMap;

import java.util.Collection;
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
        for (String key : keySet) {
            Integer value = student.get(key);
            System.out.println(key + ":" + value);

        }

        System.out.println("entrySet 활용");
        Set<Map.Entry<String, Integer>> entries = student.entrySet();//Set안에 Map.Entry라는 내부 클스가 있다.
        for (Map.Entry<String, Integer> entry : entries) {//entry는 키와 밸류를 저장하는 객체다.
            String key = entry.getKey();//해당 객체에서 키와 값을 꺼낸다.
            Integer value = entry.getValue();
            System.out.println(key + ":" + value);
        }//values와 keySet은 각각 값과 키만 볼 수 있지만 entrySet은 키와 값을 쌍으로 뽑을 수 있다.


        Collection<Integer> values = student.values();
        for (Integer value : values) {
            System.out.println(value);
        }//컬렉션인 이유는 값이 중복은 가능하기 때문 + 리스트가 아닌 이유는 리스트는 순서를 보장하는데 얘는 아니다.
        //그래서 리스트의 상위 타입인 컬렉션으로 반환한다.
    }
}
