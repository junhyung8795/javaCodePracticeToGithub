package javaCodePractice.javaMap;

import java.util.*;

public class JavaMapMAin {
    public static void main(String[] args) {
        run(new HashMap<>());
        run(new TreeMap<>());
        run(new LinkedHashMap<>());
    }

    public static void run(Map<String, Integer> map ){
        System.out.println("map = " + map.getClass());
        map.put("c", 10);
        map.put("b", 20);
        map.put("a", 30);
        map.put("1", 40);
        map.put("2", 50);
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            System.out.println("key = " + key + ", value = " + map.get(key));

        }

    }
}
