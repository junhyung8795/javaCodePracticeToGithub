package javaCodePractice.javaMap;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        //학생 성적 데이터 넣자
        studentMap.put("John", 50);
        System.out.println("studentMap = " + studentMap);

        //학생이 없는 경우에만 데이터 추가!
        if (!studentMap.containsKey("John")) {//존이라는 키가 없으면 데이터를 추가하는 로
            studentMap.put("John", 70);
        }
        System.out.println("studentMap = " + studentMap);

        //학생이 없는 경우에만 데이터 추가2
        studentMap.putIfAbsent("John", 59);
        studentMap.putIfAbsent("stdudentG", 880);
        System.out.println("studentMap = " + studentMap);
    }
}

//Map과 Set은 거의 같다. 중복을 허용하지 않고 순서도 보장하지 않는다는 공통점
//단순히 Map은 Set에서 value를 추가로 가지고 있는 것.
//이런 이유로 Set과 Map의 구현체는 거의 같다. HashSet --> HashMap, LinkedHashSet --> LinkedHashMap, TreeSet --> TreeMap
//참고 실제로 HashSet의 구현은 대부분 HashMap을 가져다 쓴다. HashMap에서 밸류만 없으면 HashSet이 되기 때문. LinkedHashSet도 마찬가지.
//해시 코드 구해서 자료 집어 넣는 모든 과정 다 동일하고 진짜 Set에서 value만 따라오는 구조.