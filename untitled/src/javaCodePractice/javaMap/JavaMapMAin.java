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
//해시맵은 해시셋과 비슷하게 key값을 통해 해시 코드를 얻고 이 해시 코드로 해시 인덱스를 구해 해시 테이블에 저장한다.
//다만 다른 점은 해시맵은 Entry라는 객체에 Key와 value를 저장한다. 그래서 해시 인덱스안 배열에 Entry객체를 집어넣어서 저장한다.
//key값이 있는지 보는 contains()는 O(1)이지만(최악의 경우 O(n)이되기도 한다. 해시 충돌 많으면)
//containsValue() 밸류가 있는지 없는지 찾는거라 모든 key를 다 뒤져서 찾아야 해서 O(n)이된다. 
