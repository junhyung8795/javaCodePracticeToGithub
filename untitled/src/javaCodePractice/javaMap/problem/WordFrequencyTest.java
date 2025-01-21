package javaCodePractice.javaMap;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] split = text.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String word : split){
            if (map.containsKey(word)){
                map.put(word, map.get(word)+1);
            } else {
                map.put(word, 1);
            }
//            Integer count = map.getOrDefault(word, 0);
//            map.getOrDefault(word, 0)는 word키에 해당하는 value값이 없으면 0을 default로 반환한다는 코드다\
//            count++;
//            map.put(word, count); 이와같이 접근하는 방법도 있다.

        }

        System.out.println(map);
    }
}
