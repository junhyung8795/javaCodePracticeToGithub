package javaCodePractice.javaMap;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMap {
    public static void main(String[] args) {
        String[][] productArr ={{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        Map<String, Integer> map = new HashMap<>();
        for (String[] strings : productArr) {
            Integer vale = Integer.parseInt(strings[1]);
            map.put(strings[0], vale);
        }
        System.out.println("map = " + map);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
