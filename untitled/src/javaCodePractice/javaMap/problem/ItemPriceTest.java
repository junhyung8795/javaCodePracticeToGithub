package javaCodePractice.javaMap.problem;

import java.util.HashMap;
import java.util.Map;

public class ItemPriceTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("mango", 1000);
        map.put("strawberry", 1000);

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if (entry.getValue().equals(1000)){
                System.out.println(entry.getKey());
            }
        }

    }
}
