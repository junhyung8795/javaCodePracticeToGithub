package javaCodePractice.javaMap;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        //학생 성적 데이터 넣자
        studentMap.put("John", 100);
        System.out.println("studentMap = " + studentMap);

        //같은 키에 밸류를 또 넣으면 어떻게 되나? --> 기존의 값이 교체된다.
        studentMap.put("John", 200);
        System.out.println("studentMap = " + studentMap);
    }
}