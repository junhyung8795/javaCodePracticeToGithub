package javaCodePractice.javaMap;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);
        map1.put("c", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("d", 6);
        map2.put("b", 4);
        map2.put("c", 5);

        Map<String, Integer> map3 = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            String key = entry.getKey();
            if (map2.containsKey(key)) {
                map3.put(key, map2.get(key) + entry.getValue());
            }
        }

        for (String s : map3.keySet()) {
            System.out.println(map3.get(s));
        }

        System.out.println(map3);

    }
}
