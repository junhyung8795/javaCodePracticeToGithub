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
    }
}
